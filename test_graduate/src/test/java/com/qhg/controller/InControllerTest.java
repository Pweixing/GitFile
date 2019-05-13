package com.qhg.controller;

import com.qhg.NewApplication;
import com.qhg.model.Student;
import com.qhg.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: admin
 * @Date: 2019/4/26 10:38
 * @Description:
 */
@SpringBootTest(classes =NewApplication.class)
@RunWith(SpringRunner.class)
public class InControllerTest {


    @Autowired
    StudentService studentService;
    @Test
    public void login() {
        boolean yes = studentService.yes("17102020124", "123456");
        System.out.println(yes);
        boolean yes2 = studentService.yes("17102020124", "12qwqw");
        System.out.println(yes2);
        boolean yes3 = studentService.yes("17102020124", "12qwqdddw");
        System.out.println(yes3);
        Student student = studentService.selectStu("17102020124", "123456");
        Student student2 = studentService.selectStu("17102020124", "123456");
        System.out.println(student.getStuPassword());
        System.out.println(student2.getStuPassword());

    }
}