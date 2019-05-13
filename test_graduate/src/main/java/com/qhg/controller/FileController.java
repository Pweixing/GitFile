package com.qhg.controller;

import com.qhg.model.*;
import com.qhg.service.DocumentService;
import com.qhg.service.TaskService;
import com.qhg.service.TeamService;
import com.qhg.service.TutorService;
import com.qhg.utils.FileUtils;
import com.qhg.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Auther: admin
 * @Date: 2019/4/23 10:46
 * @Description: 文件
 */
@Controller
@RequestMapping("/file")
public class FileController {

//    private final static String filePath = "C://file//doc//";
    private final static String filePath = "E://workspace_IDEA//test_graduate//files//";
    @Autowired
    private TeamService teamService;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private TutorService tutorService;
    @Autowired
    TaskService taskService;

    @PostMapping("/upload")
    @ResponseBody
    public Map<Object, Object> upload(@RequestParam("fileName") MultipartFile file, String taskId, HttpSession session) {
        HashMap<Object, Object> map = new HashMap<>();
        Student student = (Student) session.getAttribute("student");
        Tutor tutor = tutorService.select(student.getStuTutorid());
        Team team = teamService.selectTeam(student.getStuGroupid());
        Task task = taskService.select(taskId);

        // 文件名
        String fileName = file.getOriginalFilename();
        //创建文件     ==file/彭伟/测试/第6小组/qhg_biye.sql
        String path = filePath  +tutor.getTutorName()+"//"+task.getTaskName()+"//"+team.getTeamRemake() + "//";
        File dest = new File(path + fileName);
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String  time = formatter.format(currentTime);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);//存入 会覆盖
            /**
            * @Description:  判断相同目录下的相同文件 只修改时间，其他不变
             *   思路：
             *          通过taskid
             *          文件名相同$$文件路径相同--->修改时间
             *          文件名相同 文件路径不同--->上传文件
            * @Param: [file, taskId, session]
            * @return: java.util.Map<java.lang.Object,java.lang.Object>
            * @Date: 2019/4/26
            */
            List<Document> documents = documentService.selectDoc(student.getStuGroupid(), taskId);
            boolean flag=true;
            for(Document doc:documents
                 ) {
                if (doc.getFileName().equals(fileName)&&doc.getPath().equals(dest.getAbsolutePath())){
                    System.out.println("111");
                    flag=false;
                    doc.setUploadTime(time);
                    documentService.update(doc);

                }
            }
            if (flag){//存入数据库
                Document document = new Document();
                document.setId(IdGenerator.getID());
                document.setFileName(fileName);
                document.setPath(dest.getAbsolutePath());
                document.setTaskid(taskId);
                document.setTeamid(student.getStuGroupid());
                document.setUploadTime(time);
                documentService.insert(document);

            }
            map.put("success", true);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }


    //    文件下载
    @RequestMapping("/downFile")
    @ResponseBody
    public String  downFile(HttpServletResponse response, String documentId) {
        Document document = documentService.selectDoc(documentId);
        String fileName = document.getFileName();
        String path = document.getPath();
        String realPath = path.replace("\\", "//");
        File file = new File(realPath);
        FileUtils.downFile(response, fileName, file);
        return null;
    }
    
    /** 
    * @Description:  项目文件下载 ， 任务Id , 任务名称 +tutorName
     *              不能下载文件夹，要压缩成一个zip 下载
     *
    * @Param:  
    * @return: 
    * @Date: 2019/5/1 
    */
    @RequestMapping("/downTaskFile")
    public String taskFile(HttpServletResponse response,HttpSession  session,String taskId ) throws IOException {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        Task task = taskService.select(taskId);
        String sourceFile=filePath+tutor.getTutorName()+"//"+task.getTaskName();
        //这是文件夹
       // 这个是压缩之后的文件绝对路径
        String  path=filePath+tutor.getTutorName()+"//"+task.getTaskName()+".zip";
        FileOutputStream fos = new FileOutputStream(path);
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = new File(sourceFile);

        zipFile(fileToZip, fileToZip.getName(), zipOut);//
        zipOut.close();
        fos.close();
        //再下载文件
        File file = new File(path);
        String fileName=task.getTaskName()+".zip";
        FileUtils.downFile(response,fileName , file);
        //删除zip
          file.delete();
        return null;


    }

    //全部下载
    @RequestMapping("/downAllFile")
    public String downAllFile(HttpServletResponse response,HttpSession  session) throws IOException {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        //原路径
        String sourceFile=filePath+tutor.getTutorName();
        //压缩路径
        String  path=filePath+tutor.getTutorName()+".zip";
        FileOutputStream fos = new FileOutputStream(path);
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = new File(sourceFile);

        zipFile(fileToZip, fileToZip.getName(), zipOut);//
        zipOut.close();
        fos.close();
        //再下载文件
        File file = new File(path);
        String fileName=tutor.getTutorName()+".zip";
        FileUtils.downFile(response,fileName , file);
        //删除zip
        file.delete();
        return null;

    }

    private void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            if (fileName.endsWith("/")) {
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            } else {
                zipOut.putNextEntry(new ZipEntry(fileName + "/"));
                zipOut.closeEntry();
            }
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
            }
            return;
        }
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[2048];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        fis.close();
    }
    @PostMapping("/delFile")
    @ResponseBody
    public  Map<Object ,Object> delFile(String fileId){
        HashMap<Object, Object> map = new HashMap<>();

        Document document = documentService.selectDoc(fileId);
        String path = document.getPath();
        String realPath = path.replace("\\", "//");
        File file = new File(realPath);
        file.delete();
        documentService.del(fileId);//删除数据库中的数据
        map.put("success",true);
        return map;
    }


}
