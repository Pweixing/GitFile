package com.qhg.service;

import com.qhg.model.Student;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/2 18:32
 * @Description:
 */
public interface StudentService {
     void insert(Student student);
     List<Student> stuClazzIdList(String clazzId); //根据班级号查找学生list
     void  update(Student student); //更新学生
     List<Student> selectAllStu();//查找所有学生
     Student selectStuId(String studentId);
     List<Student> findStuList(String tutorId);
     boolean yes(String account, String password);
     Student selectStu(String account, String password);
     List<Student> selectStudent(String teamId);
     List<Student> selectStu(String clazzId);

}
