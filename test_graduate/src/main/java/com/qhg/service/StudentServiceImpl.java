package com.qhg.service;

import com.qhg.dao.StudentMapper;
import com.qhg.model.Student;
import com.qhg.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/1 22:34
 * @Description:
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    public void insert(Student student) {    //插入学生数组
        studentMapper.insert(student);
    }

    public List<Student> stuClazzIdList(String clazzId) { //根据班级号查找学生list
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuClassidEqualTo(clazzId);
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students;
    }

    public void update(Student student) { //更新学生
        studentMapper.updateByPrimaryKeySelective(student);
    }

    public List<Student> selectAllStu() { //查找所有学生

        return studentMapper.selectAllStudent();
    }


    @Override
    public Student selectStuId(String studentId) {
        Student student = studentMapper.selectByPrimaryKey(studentId);
        return student;
    }

    @Override
    public List<Student> findStuList(String tutorId) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuTutoridEqualTo(tutorId);
        return studentMapper.selectByExample(studentExample);

    }

    @Override
    public boolean yes(String account, String password) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuAccountEqualTo(account).andStuPasswordEqualTo(password);
        List<Student> students = studentMapper.selectByExample(studentExample);
        int size = students.size();
        return size == 1;
    }

    @Override
    public Student selectStu(String account, String password) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuAccountEqualTo(account).andStuPasswordEqualTo(password);
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students.get(0);
    }

    @Override
    public List<Student> selectStudent(String teamId) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuGroupidEqualTo(teamId);
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students;
    }

    @Override
    public List<Student> selectStu(String clazzId) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuClassidEqualTo(clazzId);
        return studentMapper.selectByExample(studentExample);
    }
}
