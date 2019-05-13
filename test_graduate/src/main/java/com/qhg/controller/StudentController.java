package com.qhg.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhg.model.*;
import com.qhg.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: admin
 * @Date: 2019/4/16 19:21
 * @Description:
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    NoticeService noticeService;
    @Autowired
    ProjectService projectService;
    @Autowired
    TeamService teamService;
    @Autowired
    StudentService studentService;
    @Autowired
    DocumentService documentService;
    @Autowired
    TutorService tutorService;

    @RequestMapping("/index")
    public String index() {
        return "student/student";

    }

    @RequestMapping("/notices")
    public String stuNotice(Model model, HttpSession session, @RequestParam(defaultValue = "1") Integer pageNum) {

        PageHelper.startPage(pageNum, 6);
        Student student = (Student) session.getAttribute("student");
        if (student.getStuGroupid().equals("")){
            return "student/student";
        }
        else {
            List<Notice> notices = noticeService.selectListNotice(student.getStuTutorid());

            PageInfo<Notice> pageInfo = new PageInfo<>(notices);
            model.addAttribute("pageInfo", pageInfo);
            model.addAttribute("notices", notices);
            return "student/student_notice";
        }



    }

    @RequestMapping("/stuProject")
    public String stuProject(Model model, @RequestParam(defaultValue = "1") Integer pageNum) {
        PageHelper.startPage(pageNum, 8);
        List<Project> projects = projectService.selectAll();
        PageInfo<Project> pageInfo = new PageInfo<>(projects);
        model.addAttribute("projects", projects);
        model.addAttribute("pageInfo", pageInfo);
        return "student/student_project_list";
    }

    @RequestMapping("/stuTeam")
    public String stuTeam(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        if (student.getStuGroupid().equals("")){
            return "student/student";
        }else {
        List<Student> students = studentService.selectStudent(student.getStuGroupid());
        model.addAttribute("students", students);
        return "student/student_team";
        }
    }

    @RequestMapping("/stuInfo")
    public String stuInfo() {
        return "student/student_info";
    }

    @PostMapping("/updateStuInfo")
    @ResponseBody
    public Map updateStuInfo(Student student,HttpSession session){
        HashMap<Object, Object> map = new HashMap<>();
        Student student1 = (Student) session.getAttribute("student");
        student.setId(student1.getId());
        studentService.update(student);
        map.put("success",true);
        return  map;
    }
    @GetMapping("/stuPassword")
    public String stuPassword(){
        return "student/student_password";
    }
    @PostMapping("/updateStuPassword")
    @ResponseBody
    public Map<Object ,Object> updatePassword(String newPassword,HttpSession session){
        HashMap<Object, Object> map = new HashMap<>();
        Student student = (Student) session.getAttribute("student");
        student.setStuPassword(newPassword);
        studentService.update(student);
        map.put("success",true);
        return map;
    }
    @RequestMapping("/stuFileList")
    public String stuFileList(HttpSession session, Model model ,String taskId){
        System.out.println(taskId);
        Student student = (Student) session.getAttribute("student");
        List<Document> documents = documentService.selectDoc(student.getStuGroupid(),taskId);
        model.addAttribute("documents",documents);
        return "student/student_file_list";
    }
    @RequestMapping("stuTeamInfo")
    public String stuTeamInfo(HttpSession session,Model model){
        Student  student = (Student) session.getAttribute("student");
        if (student.getStuGroupid().equals("")){
            return "student/student";
        }else {
            Team team = teamService.selectTeam(student.getStuGroupid());
            model.addAttribute("team",team);
            return "student/student_team_info";
        }


    }
    @PostMapping("/setHeader")
    @ResponseBody
    public Map<Object, Object> setHeader(String studentId,String teamId) {
        HashMap<Object, Object> map = new HashMap<>();
        List<Student> students = studentService.selectStudent(teamId);
        for (Student student : students
                ) {
            if (student.getId().equals(studentId)) {
                student.setStuIsleader(1);
            } else {
                student.setStuIsleader(0);  //
            }
            studentService.update(student);
        }
        map.put("success",true);
        return  map;
    }
@RequestMapping("/selectTutor")
    public String selectTutor( Model model,HttpSession httpSession){
    Student student = (Student) httpSession.getAttribute("student");
    //及时更新数据
    studentService.selectStuId(student.getId());
    List<Tutor> tutors = tutorService.selectAllTutor();
    model.addAttribute("tutors",tutors);
    model.addAttribute("student",student);
    return "student/student_select_tutor";
    }


}
