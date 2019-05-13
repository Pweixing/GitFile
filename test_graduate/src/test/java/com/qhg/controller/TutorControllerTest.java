package com.qhg.controller;

import com.qhg.NewApplication;
import com.qhg.model.Student;
import com.qhg.model.Team;
import com.qhg.service.StudentService;
import com.qhg.service.TeamService;
import com.qhg.utils.IdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


/**
 * @Auther: admin
 * @Date: 2019/4/13 22:11
 * @Description:
 */

@SpringBootTest(classes =NewApplication.class)
@RunWith(SpringRunner.class)
public class TutorControllerTest {

    @Autowired
    StudentService studentService;
    @Autowired
    TeamService teamService;
    @Test
    public void studentList() {
        List<Student> students = studentService.selectAllStu();
        System.out.println(students.size());
        getGroup(students,5);
    }
        /**
         * 进行分组 els 需要进行分组的成员 groups 需要分成几组
         */
        public void getGroup(List<Student> list, int peoples) {
            /**
             * 获取随机数
             */
      String groupId= IdGenerator.getMinId();
      Random r = new Random();
            // 随机打乱一下顺序
            Collections.shuffle(list);
            // 计算一下每组多少人
            int groups = list.size() / peoples;
//            分组Id
            for (int i=0;i<groups;i++){
                System.out.println(groupId+String.valueOf(i+1));
            }

            // 分组开始
            for (int i = 0; i < groups; i++) {//分组
                for (int j = 0; j < peoples; j++) {
                    int random = r.nextInt(list.size());
                    Student student = list.get(random);
                    student.setStuGroupid(groupId+String.valueOf(i+1));
                    //jdbc
                    list.remove(random);
                }

            }
            // 最后剩下的人再重新分配一遍
            for (int i = 0; i < list.size(); i++) {
                Student student = list.get(i);
                int number = (int) (Math.random() * groups) + 1;//再一次随机分组
//                student.setStuGroup(String.valueOf(number));
//                studentService.updateByPrimaryKeySelective(student);
            }
        }
        @Test
        public void test(){
            Map<Object, Object> map = new HashMap<>();
            List<Team> allTeam = teamService.findAllTeam();

            for (Team team:allTeam
                 ) {
                System.out.println(team);

            }
            List<Student> students = studentService.selectAllStu();
            for (Student student:students
                 ) {
                if (student.getStuGroupid()!=null){
                    for (Team team:allTeam
                            ) {
                        if (student.getStuGroupid().equals(team.getId())){
                            map.put(student.getStuGroupid(),team.getTeamRemake());
                        }


                    }
                }



            }

        }
    }
