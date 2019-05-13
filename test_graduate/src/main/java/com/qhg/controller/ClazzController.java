package com.qhg.controller;


import com.qhg.model.Clazz;
import com.qhg.model.Student;
import com.qhg.service.ClazzService;
import com.qhg.service.StudentService;
import com.qhg.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: admin
 * @Date: 2019/3/31 18:18
 * @Description:
 */
@Controller
@RequestMapping("/clazz")

public class ClazzController {
   @Autowired
   ClazzService clazzService;
   @Autowired
   StudentService studentService;

    @PostMapping("/addClazz")
    @ResponseBody
    public Object addClazz(Clazz clazz) {
        /**
         * @Description: 班级管理一块
         * @Param:
         * @return:
         * @Date: 2019/4/2
         */
        Map<Object, Object> map = new HashMap();
        if (clazzService.clazzName(clazz.getClazzName())){
            clazz.setId(IdGenerator.getID());
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(currentTime);
            clazz.setClazzCreattime(dateString);
            clazz.setClazzNum(0);
            clazzService.addClazz(clazz);

            map.put("success", true);
        }

        return map;

    }
    @RequestMapping("/allClazz")
    public String allClazz(Model model) { //查询班级所有信息
        List<Clazz> clazzes = clazzService.selectAllClazz();
        model.addAttribute("clazzes", clazzes);
        return "admin/admin_clazz";
    }
    @RequestMapping("/clazzManage")
    public String addClazzManage(Model model) {
        List<Clazz> clazzes = clazzService.selectAllClazz();
        model.addAttribute("clazzes", clazzes);
        return "admin/admin_clazz_manage";
    }

    @PostMapping("/delClazz")
    @ResponseBody
    public Map delClazz(String clazzId) {
        /**
         * @Description: 删除班级 ，同时删除学生，setStuDelete置为 1
         * @Param: [clazzId]
         * @return: java.util.Map
         * @Date: 2019/4/2
         */
        Map<Object, Object> map = new HashMap<>();
        clazzService.delClazzOfId(clazzId);
        List<Student> students = studentService.stuClazzIdList(clazzId);
        for (Student student : students
                ) {
            student.setStuDelete(1);
            student.setStuClassid(null);
            studentService.update(student);
        }
        map.put("success", true);
        return map;
    }

    @PostMapping("/addLock")
    @ResponseBody
    public Map<Object, Object> addLock(String clazzId){
        HashMap<Object, Object> map = new HashMap<>();
        List<Student> students = studentService.selectStu(clazzId);
        for (Student student:students
                ) {
            student.setStuLock(1);      //加锁
            studentService.update(student);
        }
        map.put("success",true);
        return map;
    }
    @PostMapping("/cancelLock")
    @ResponseBody
    public Map<Object, Object> cancelLock(String clazzId){
        HashMap<Object, Object> map = new HashMap<>();
        List<Student> students = studentService.selectStu(clazzId);
        for (Student student:students
                ) {
            student.setStuLock(0);
            studentService.update(student);
        }
        map.put("success",true);
        return map;
    }




}
