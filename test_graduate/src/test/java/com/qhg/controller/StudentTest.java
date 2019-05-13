package com.qhg.controller;

import com.qhg.NewApplication;
import com.qhg.model.Student;
import com.qhg.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: admin
 * @Date: 2019/5/3 04:04
 * @Description:
 */
@SpringBootTest(classes =NewApplication.class)
@RunWith(SpringRunner.class)
public class StudentTest {
    @Autowired
    StudentService studentService;
    @Test
    public void test1(){
        Student student = studentService.selectStuId("19050304_00f206");
        System.out.println(":"+student.getStuGroupid());
        System.out.println(student.getStuGroupid().equals(""));

    }
}
