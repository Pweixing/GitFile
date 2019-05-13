package com.qhg.controller;

import com.qhg.model.*;
import com.qhg.service.DocumentService;
import com.qhg.service.TaskService;
import com.qhg.service.TeamService;
import com.qhg.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: admin
 * @Date: 2019/4/23 20:34
 * @Description:
 */
@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private  TaskService taskService;
    @Autowired
    private DocumentService documentService;
    @Autowired
    TeamService teamService;

    @RequestMapping("/taskList")
    public String inTask(Model model, HttpSession session) { //导师
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        List<Task> tasks = taskService.selectTask(tutor.getId());

        model.addAttribute("tasks", tasks);
        return "tutor/tutor_task";

    }

    @PostMapping("/add")
    @ResponseBody
    public Map<Object, Object> add(Task task, HttpSession session) {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        HashMap<Object, Object> map = new HashMap<>();
        task.setTutorid(tutor.getId());
        task.setId(IdGenerator.getID());
        task.setTaskTatus(0);
        taskService.insert(task);
        map.put("success", true);
        return map;
    }

    @PostMapping("/delTask")
    @ResponseBody
    public Map<Object, Object> delTask(String taskId) {
        HashMap<Object, Object> map = new HashMap<>();
        taskService.delTask(taskId);
        map.put("success", true);
        return map;
    }


    @GetMapping("/stuTaskList")
    public String inStuTaskList(HttpSession session, Model model) {
        /** 
        * @Description:   问题，判断是否结束 ；页面不好操作动态数据
        * @Param: [session, model] 
        * @return: java.lang.String
        * @Date: 2019/4/24 
        */  
        Student student = (Student) session.getAttribute("student");
        if (student.getStuGroupid().equals("")){
                return "student/student";
        }else {
        List<Task> tasks = taskService.selectTask(student.getStuTutorid());
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Task task:tasks
             ) {
            try {
                Date date1 = simpleDateFormat.parse(task.getTaskEndtime());
                if (date1.getTime()<date.getTime()){
                        task.setTaskTatus(1); //已结束
                         taskService.updateTask(task);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        //再次查找  更新一下数据库  判断结束

        List<Task> newtasks = taskService.selectTask(student.getStuTutorid());
        /** 
        * @Description:  思路  文件个数
         * 提交状态
                 该任务的id=
                 List -通过学生的组id寻找文件的id
                    判断文件的taskid =
        */
        Map<Object, Object> map = new HashMap<>();
        List<Document> documents = documentService.findDocument(student.getStuGroupid());
        for (Task task:newtasks
             ) {
            int count=0;
            for (Document document:documents
                 ) {
                if (document.getTaskid().equals(task.getId())){
                    count++;
            }
        }
            map.put(task.getId(),count);
        }
        model.addAttribute("tasks",newtasks);
        model.addAttribute("maps",map);
        return "student/student_task";
    }
    }

    @RequestMapping("/taskFile")
    public  String  taskFile(Model model,HttpSession session){
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        List<Task> tasks = taskService.selectTask(tutor.getId());
        //判断文件数 通过taskId= task.getId()
     Map<Object, Object> map = new HashMap<>();
        for (Task task:tasks
             ) {
            List<Document> documents = documentService.select(task.getId());
            map.put(task.getId(),documents.size());
        }

        model.addAttribute("tasks",tasks);
        model.addAttribute("maps",map);
        return "tutor/tutor_task_file";
    }
    @RequestMapping("/taskFileList")
    public String taskFileList(String taskId,Model model){
        List<Document> documents = documentService.select(taskId);
        //上传小组
        HashMap<Object, Object> map = new HashMap<>();
        List<Team> allTeam = teamService.findAllTeam();
        for (Document document:documents
             ) {
            for (Team team:allTeam
                 ) {
                if (team.getId().equals(document.getTeamid())){
                    map.put(document.getTeamid(),team.getTeamRemake());

                }

            }
            
        }

        model.addAttribute("documents",documents);
        model.addAttribute("maps",map);
        return "tutor/tutor_file_list";
    }
}
