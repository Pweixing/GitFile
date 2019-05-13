package com.qhg.controller;

import com.qhg.model.Student;
import com.qhg.model.Team;
import com.qhg.service.StudentService;
import com.qhg.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: admin
 * @Date: 2019/4/29 17:39
 * @Description:
 */
@Controller
@RequestMapping("/team")
public class TeamController {
    @Autowired
    TeamService teamService;
    @Autowired
    StudentService studentService;
    @PostMapping("/updateTeam")
    @ResponseBody
    public Map<Object,Object> updateTeam(Team team, HttpSession session){
        HashMap<Object, Object> map = new HashMap<>();
        Student student = (Student) session.getAttribute("student");
        team.setId(student.getStuGroupid());
        teamService.update(team);
        map.put("success",true);
        return map;
    }
    @RequestMapping("/updateScore")     //评分
    @ResponseBody
    public Map<Object,Object> updateScore(String teamId,Integer score){
        HashMap<Object, Object> map = new HashMap<>();
        Team team = teamService.selectTeam(teamId);
        team.setTeamScore(score);
        int x=3; //组长优待
        List<Student> students = studentService.selectStudent(teamId);
        for (Student student:students
             ) {
            if (student.getStuIsleader()==1){
                if ((score+x)>=99){
                    student.setStuScore(99);
                }else {
                    student.setStuScore(score+x);
                }

            }else {
                student.setStuScore(score);
            }
            studentService.update(student);
        }
        teamService.update(team);
        map.put("success",true);
        return map;
    }
}
