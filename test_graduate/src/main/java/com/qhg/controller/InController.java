package com.qhg.controller;

import com.qhg.model.Admin;
import com.qhg.model.Student;
import com.qhg.model.Tutor;
import com.qhg.service.AdminService;
import com.qhg.service.StudentService;
import com.qhg.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.Map;

/**
 * @Auther: admin
 * @Date: 2019/3/31 14:26
 * @Description:
 */

@Controller
@RequestMapping("/")
public class InController {
    @GetMapping
    public String login() {
        return "/login";
    }

    @RequestMapping("/exitAdmin")      //管理员退出
    public String exitAdmin(HttpServletRequest request) {
        request.getSession().removeAttribute("admin");
        return "/login";
    }
    @RequestMapping("/exitTutor")      //退出
    public String exitTutor(HttpServletRequest request) {
        request.getSession().removeAttribute("tutor");
        return "/login";
    }
    @RequestMapping("/exitStudent")      //退出
    public String exitStudent(HttpServletRequest request) {
        request.getSession().removeAttribute("student");
        return "/login";
    }

    @Autowired
    AdminService adminService;
    @Autowired
    TutorService tutorService;
    @Autowired
    StudentService studentService;

    @PostMapping("/in")
    public String success(@RequestParam("name") String name,
                          @RequestParam("password") String password,
                          Map<String, Object> map, HttpSession session) {

        if (adminService.yes(name, password)) { //  管理员登录成功
            Admin admin = adminService.selectAdmin(name, password);
            session.setAttribute("admin", admin);
            return "admin/admin";
        }if (tutorService.yes(name,password)){
            Tutor tutor = tutorService.selectTutor(name, password);
            session.setAttribute("tutor",tutor);
            return "tutor/tutor";
        }if (studentService.yes(name,password))
        {    //name->account
            Student student = studentService.selectStu(name, password);
            //判断是否锁定账号1。或已删除1
            if (student.getStuLock()==1||student.getStuDelete()==1){
                map.put("msg", "账号已删除或已锁定，请联系管理员");
                return "/login";
            }else {
                session.setAttribute("student",student);
                return "student/student";
            }
        }
        else {
            map.put("msg", "用户名账号或密码错误！");
            return "/login";
        }


    }


}
