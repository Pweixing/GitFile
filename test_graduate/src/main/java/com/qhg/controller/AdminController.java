package com.qhg.controller;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.qhg.model.Clazz;
import com.qhg.model.Student;
import com.qhg.model.Tutor;
import com.qhg.service.ClazzService;
import com.qhg.service.StudentService;
import com.qhg.service.TutorService;
import com.qhg.utils.FileUtils;
import com.qhg.utils.IdGenerator;
import com.qhg.utils.excel.ImportExcel;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: admin
 * @Date: 2019/3/16 21:05
 * @Description: 管理员
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    StudentService studentService;
    @Autowired
    ClazzService clazzService;
    @Autowired
    TutorService tutorService;

    @RequestMapping("/index")   //主页
    public String index() {
        return "admin/admin";
    }

    //---------------------------------导师管理---------------------------------------------------------------------
    @PostMapping("/addTutor")
    @ResponseBody
    public Map<Object, Object> addTutor(Tutor tutor) {
        /**
         * @Description: 导师信息添加
         * @Param: [tutor]
         * @return: java.util.Map<java.lang.Object                               ,                               java.lang.Object>
         * @Date: 2019/4/2
         */
        Map<Object, Object> map = new HashMap<>();
        if (tutor.getTutorSex().equals("男") || tutor.getTutorSex().equals("女")) {
            if (!(tutor.getTutorName() == "")) {
                if (tutorService.existName(tutor.getTutorName())) {
                    tutor.setId(IdGenerator.getID());
                    tutor.setTutorPassword("0123456");
                    tutorService.insert(tutor);
                    map.put("success", true);
                } else {
                    map.put("err", true);
                }
            } else {
                map.put("message", true);
            }

        }


        return map;
    }

    @RequestMapping("/selectAllTutor")
    public String selectAllTutor(Model model) {
        List<Tutor> tutors = tutorService.selectAllTutor();
        model.addAttribute("tutors", tutors);
        return "admin/admin_tutor";
    }

    @PostMapping("/delTutor")
    @ResponseBody
    public Map<Object, Object> DelTutor(String tutorId) {
        Map<Object, Object> map = new HashMap<>();
        tutorService.delTutor(tutorId);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/delListTutor")
    @ResponseBody
    public Map delListTutorId(String listTutorId) {
        Map<Object, Object> map = new HashMap<>();
        String[] strs = listTutorId.split(",");  //获取每个Id
        for (String tutorId : strs
                ) {
            tutorService.delTutor(tutorId);
        }
        map.put("success", true);
        return map;

    }

    //-------------------------------------学生管理------------------------------------------------------------------------
    @RequestMapping("/stuManage")
    public String stuManage(Model model) {   //学生管理页面
        Map<Object, Object> map = new HashMap<>();
        List<Student> students = studentService.selectAllStu();
        List<Tutor> tutors = tutorService.selectAllTutor();
        List<Clazz> clazzes = clazzService.selectAllClazz();
        for (Student s : students
                ) {
            for (Clazz clazz : clazzes
                    ) {
                if (clazz.getId().equals(s.getStuClassid())) {
                    map.put(s.getStuClassid(), clazz.getClazzName());
                }
            }
        }
        for (Student s : students
                ) {
            if (s.getStuTutorid() != null) { //判断是否为空
                for (Tutor tutor : tutors
                        ) {
                    if (tutor.getId().equals(s.getStuTutorid())) {
                        map.put(s.getStuTutorid(), tutor.getTutorName());
                    }
                }
            }

        }

        model.addAttribute("students", students);
        model.addAttribute("maps", map);
        model.addAttribute("tutors", tutors);
        return "admin/admin_student_manage";
    }


    @RequestMapping("/allStuDel")
    public String selectStuDel(Model model) {    //学生信息删除页面
        List<Student> students = studentService.selectAllStu();
        model.addAttribute("students", students);
        return "admin/admin_student_del";

    }


    @RequestMapping("/allStudent")
    public String allStudent(Model model) {
        /**
         * @Description: 学生信息查询
         * @Param: [model]
         * @return: java.lang.String
         * @Date: 2019/4/9
         */  //查询所有学生
        Map<Object, Object> map = new HashMap<>();
        List<Student> students = studentService.selectAllStu();
        List<Tutor> tutors = tutorService.selectAllTutor();
        List<Clazz> clazzes = clazzService.selectAllClazz();
//
        for (Student s : students
                ) {
            for (Clazz clazz : clazzes
                    ) {
                if (clazz.getId().equals(s.getStuClassid())) {
                    map.put(s.getStuClassid(), clazz.getClazzName());
                }

            }
        }

        for (Student s : students
                ) {
            for (Tutor tutor : tutors
                    ) {

                if (tutor.getId().equals(s.getStuTutorid())) {
                    map.put(s.getStuTutorid(), tutor.getTutorName());

                }

            }
        }

        model.addAttribute("students", students);
        model.addAttribute("maps", map);
        return "admin/admin_student";
    }


    @PostMapping("/lockClose")
    @ResponseBody
    public Map<Object, Object> lockClose(String studentId) {        //锁
        //加锁解锁
        Map<Object, Object> map = new HashMap<>();
        Student student = studentService.selectStuId(studentId);
        student.setStuLock(1);
        studentService.update(student);
        map.put("success", true);
        return map;
    }

    @PostMapping("/lockOpen")
    @ResponseBody
    public Map<Object, Object> lockOpen(String studentId) { //
        //加锁解锁
        Map<Object, Object> map = new HashMap<>();
        Student student = studentService.selectStuId(studentId);
        student.setStuLock(0);
        studentService.update(student);
        map.put("success", true);


        return map;
    }

    @PostMapping("/updateStuTutor") //更换导师
    @ResponseBody
    public Map<Object, Object> updateStuTutor(String studentId, String tutorId) {
        Map<Object, Object> map = new HashMap<>();
        Student student = studentService.selectStuId(studentId);
        student.setStuTutorid(tutorId);
        //小组信息清除，组长清除
        student.setStuGroupid(null);//清空
        student.setStuIsleader(0);
        studentService.update(student);
        map.put("success", true);

        return map;

    }


//----------------------------------------班级管理------------------------------------------------------------------------------


    @RequestMapping("/stuClazz")
    public String clazzStu(Model model, String clazzId) {
        /**
         * @Description: 学生信息查询
         * @Param: [model]
         * @return: java.lang.String
         * @Date: 2019/4/9
         */  //查询所有学生
        Map<Object, Object> map = new HashMap<>();
        List<Student> students = studentService.stuClazzIdList(clazzId);
        List<Tutor> tutors = tutorService.selectAllTutor();
        List<Clazz> clazzes = clazzService.selectAllClazz();
        for (Student s : students
                ) {
            for (Clazz clazz : clazzes
                    ) {
                if (clazz.getId().equals(s.getStuClassid())) {
                    map.put(s.getStuClassid(), clazz.getClazzName());
                }

            }
        }
        for (Student s : students
                ) {
            for (Tutor tutor : tutors
                    ) {
                if (tutor.getId().equals(s.getStuTutorid())) {
                    map.put(s.getStuTutorid(), tutor.getTutorName());

                }

            }
        }
        model.addAttribute("students", students);
        model.addAttribute("maps", map);
        model.addAttribute("tutors", tutors);
        return "admin/admin_student_manage";
    }

    @RequestMapping("/uploadFile")  //录入学生信息页面
    public String uploadFile(String clazzId, Model model) {
        System.out.println("录入学生信息页面");
        model.addAttribute("clazzId", clazzId); //
        return "admin/stufile";
    }

    @RequestMapping("/stuDownloadFile")
    public String downloadFile(HttpServletResponse response) {
        /**
         * @Description: 下载文件
         * @Param: [request, response]
         * @return: java.lang.String
         * @Date: 2019/4/2
         */
        String fileName = "学员信息导入数据_模板.xlsx";
        String realPath = "E://workspace_IDEA//test_graduate//src//main//resources//static//file//";
//        String realPath = "C://file//";
        File file = new File(realPath, fileName);
        FileUtils.downFile(response, fileName, file);

        return null;
    }


    /**
     * @Description: 上传学生信息
     * @Param:
     * @return:
     * @Date: 2019/4/2
     */
    @RequestMapping("/uploadStudents")
    @ResponseBody
    public Object improtExcel(@RequestParam("file") MultipartFile multipartFile, String clazzId) {
        System.out.println("文件已经接收到！！");
        List<String[]> list = this.parseMultipartFile(multipartFile);  //解析xlsx文件方法，存到list集合
        //判断不为空的
        boolean  kong=false;
        for (int i = 1; i < list.size(); i++) {
            String[] strArr = list.get(i);
           if (strArr[1]!=""&&strArr[2]!=""&&strArr[3]!=""&&strArr[5]!=""&&strArr[6]!=""){
               if (strArr[4].equals("男")||strArr[4].equals("女")) {
                   kong = true;
               }else {
                   kong=false;
               }
           }else {
               kong=false;
           }
        }
//    -----------------------------
        Map<String, Object> map = new HashMap<>();
        if (kong) {
            int count = 0;
            List<Student> students = studentService.selectAllStu();
            String sameAccount = "学号已存在列:[";
            boolean flag = true; //判断学号相同则不插入数据
            for (int i = 1; i < list.size(); i++) {   //文件从第一列开始
                String[] strArr = list.get(i);
                for (Student s : students
                        ) {
                    if (s.getStuAccount().equals(strArr[1])) {
                        flag = false;
                        sameAccount += i + ",";
                        break;
                    }
                }
            }
            for (int i = 1; i < list.size(); i++) {
                String[] strArr = list.get(i);

                if (flag) {
                    Student student = new Student();
                    student.setId(IdGenerator.getID());
                    student.setStuAccount(strArr[1]);
                    student.setStuName(strArr[2]);
                    student.setStuPassword("123456");
                    student.setStuAge(Integer.parseInt(strArr[3]));
                    student.setStuSex(strArr[4]);
                    student.setStuSpecialty(strArr[5]);//专业
                    student.setStuCollage(strArr[6]);
                    if (strArr[7] != "") {
                        student.setStuIphone(Integer.parseInt(strArr[7]));
                    }
                    student.setStuClassid(clazzId);
                    student.setStuLock(1);//锁住账户
                    student.setStuDelete(0);
                    student.setStuIsleader(0);
                    student.setStuRemake("");
                    student.setStuGroupid("");
                    studentService.insert(student);
                    count++;
                }
            }
            Clazz clazz = clazzService.selectClazz(clazzId);
            Integer clazzNum = clazz.getClazzNum();
            clazz.setClazzNum(clazzNum + count);
            clazzService.updateClazzSelective(clazz);
            map.put("success", true);
            map.put("updateCount", count);
            map.put("sameAccount", sameAccount + "]");
        }else {
            map.put("msg","内容格式存在错误");
        }
        return map;
    }

    /**
     * @Description: 解析文件
     * @Param:
     * @return:
     * @Date: 2019/4/2
     */
    private List<String[]> parseMultipartFile(MultipartFile multipartFile) {
        List<String[]> all = new ArrayList<>();
        try {
            ImportExcel importExcel = new ImportExcel(multipartFile, 0, 0);
            StringBuilder eachRow = new StringBuilder();
            outter:
            for (int i = importExcel.getDataRowNum(); i < importExcel.getLastDataRowNum(); i++) {
                Row row = importExcel.getRow(i);
                String[] rowArr = new String[importExcel.getLastCellNum()];
                for (int j = 0; j < importExcel.getLastCellNum(); j++) {
                    if ((importExcel.getCellValue(row, 1) + "").trim().length() <= 0) {
                        continue outter;
                    }
                    Object val = importExcel.getCellValue(row, j);
                    if (val instanceof Double) {//double 类型的数字，去掉 .00
                        double d = (Double) val;
                        val = (int) d;
                    }
                    rowArr[j] = String.valueOf(val).trim();
                }
                all.add(rowArr);
            }
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all.size() > 0 ? all : null;
    }


}
