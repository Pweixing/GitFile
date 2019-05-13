package com.qhg.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhg.model.*;
import com.qhg.service.*;
import com.qhg.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: admin
 * @Date: 2019/4/9 12:30
 * @Description:
 */
@Controller
@RequestMapping("/tutor")
public class TutorController {
    @RequestMapping("/index")
    public String index() {
        return "tutor/tutor";
    }

    @RequestMapping("/inNotice")
    public String inNotice() {
        return "tutor/tutor_notice";
    }

    @Autowired
    NoticeService noticeService;
    @Autowired
    StudentService studentService;
    @Autowired
    TeamService teamService;
    @Autowired
    ClazzService clazzService;
    @Autowired
    TutorService tutorService;

    @PostMapping("/addNotice")
    @ResponseBody
    public Map<Object, Object> addNotice(Notice notice, HttpSession session) {
        Map<Object, Object> map = new HashMap<>();
        Tutor tutor = (Tutor) session.getAttribute("tutor");    //获取session
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String creatTime = formatter.format(date);
        notice.setId(IdGenerator.getID());
        notice.setCreatorid(tutor.getId());
        notice.setCreattime(creatTime);
        noticeService.insert(notice);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/editNotice")
    public String edit(Model model, HttpSession session,
                       @RequestParam(defaultValue = "1") Integer pageNum) {
        /**
         * @Description: 分页操作
         * @Param: [model, session, pageNum]
         * @return: java.lang.String
         * @Date: 2019/4/10
         */
        PageHelper.startPage(pageNum, 6);
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        String id = tutor.getId();
        List<Notice> notices = noticeService.selectListNotice(id);
        PageInfo<Notice> pageInfo = new PageInfo<>(notices);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("notices", notices);
        return "tutor/tutor_notice_edit";
    }

    @PostMapping("/updateNotice")
    @ResponseBody
    public Map updateNotice(Notice notice, HttpSession session) {
        Tutor tutor = (Tutor) session.getAttribute("tutor");    //获取session
        notice.setCreatorid(tutor.getId());
        HashMap<Object, Object> map = new HashMap<>();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        notice.setCreattime(simpleDateFormat.format(date));
        noticeService.update(notice);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/delNotice")
    @ResponseBody
    public Map<Object, Object> delNotice(String noticeId) {
        HashMap<Object, Object> map = new HashMap<>();
        noticeService.delete(noticeId);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/studentList")
    public String studentList(Model model, HttpSession session) {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        String tutorId = tutor.getId();
        List<Student> stuList = studentService.findStuList(tutorId);
        List<Clazz> clazzes = clazzService.selectAllClazz();
        List<Team> allTeam = teamService.findAllTeam();
        Map<Object, Object> map = new HashMap<>();
        for (Student student : stuList
                ) {
            for (Clazz clazz : clazzes
                    ) {
                if (clazz.getId().equals(student.getStuClassid())) {
                    map.put(student.getStuClassid(), clazz.getClazzName());
                }
            }
        }
        for (Student student : stuList
                ) {
            if (student.getStuGroupid() != null) {
                for (Team team : allTeam
                        ) {
                    if (team.getId().equals(student.getStuGroupid())) {
                        map.put(student.getStuGroupid(), team.getTeamRemake());
                    }
                }
            }
        }
        model.addAttribute("students", stuList);
        model.addAttribute("maps", map);
        model.addAttribute("teams", allTeam);
        return "tutor/tutor_stu_List";
    }

    /**
     * @Description: 分组
     * @Param: [session, num]
     * @return: java.util.Map<java.lang.Object                                                               ,                                                               java.lang.Object>
     * @Date: 2019/4/14
     */
    @PostMapping("/setGroup")
    @ResponseBody
    public Map<Object, Object> stuGroup(HttpSession session, Integer num) {
        HashMap<Object, Object> map = new HashMap<>();
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        List<Team> teamOf = teamService.findTeamOf(tutor.getId());
        for (Team team : teamOf
                ) {
            teamService.delTeam(team);//先把分组给删除，节约资源，再次分组
        }

        List<Student> stuList = studentService.findStuList(tutor.getId());
        getGroup(stuList, num, tutor.getId());//通过自定义方法，实现分组
        map.put("success", true);
        updateTeam(tutor);    //更新小组信息
        return map;

    }

    public void updateTeam(Tutor tutor) {//更新小组人数

        List<Student> students = studentService.findStuList(tutor.getId());
        List<Team> teams = teamService.findTeamOf(tutor.getId());
        for (Team team : teams
                ) {
            int x = 0;
            for (Student student : students
                    ) {
                if (team.getId().equals(student.getStuGroupid())) {
                    x += 1;
                }
            }
            team.setTeamPeopleNum(x);
            teamService.update(team);
        }
    }


    /**
     * 进行分组 els 需要进行分组的成员 groups 需要分成几组
     */
    public void getGroup(List<Student> list, int peoples, String tutorId) {

        String groupId = IdGenerator.getMinId(); //风阻ID

        Random r = new Random();    //获取随机数

        Collections.shuffle(list);// 随机打乱一下顺序

        int groups = list.size() / peoples; // 计算一下每组多少人
        for (int i = 1; i <= groups; i++) {
            Team team = new Team();
            team.setId(groupId + String.valueOf(i)); //设置
            team.setTeamRemake("第" + i + "小组");
            team.setTeamTutorid(tutorId);
            teamService.insert(team);
        }
        // 分组开始
        for (int i = 0; i < groups; i++) {
            for (int j = 0; j < peoples; j++) {
                int random = r.nextInt(list.size());
                Student student = list.get(random);
                student.setStuGroupid(groupId + String.valueOf(i + 1));
                studentService.update(student);
                list.remove(random);
            }

        }
        // 最后剩下的人再重新分配一遍
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            int number = (int) (Math.random() * groups) + 1;//再一次随机分组
            student.setStuGroupid(groupId + String.valueOf(number));
            studentService.update(student);
        }

    }

    @PostMapping("/cancel")
    @ResponseBody
    public Map<Object, Object> cancelGroup(HttpSession httpSession) {
        HashMap<Object, Object> map = new HashMap<>();
        Tutor tutor = (Tutor) httpSession.getAttribute("tutor");
        List<Team> teamOf = teamService.findTeamOf(tutor.getId());
        for (Team team : teamOf
                ) {
            teamService.delTeam(team);
        }
        List<Student> stuList = studentService.findStuList(tutor.getId());
        for (Student s : stuList
                ) {
            s.setStuGroupid("");
            studentService.update(s);
        }
        map.put("success", true);
        return map;
    }

    @PostMapping("/updataTeam")
    @ResponseBody
    public Map<Object, Object> update(String teamId, String studentId, HttpSession session) {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        HashMap<Object, Object> map = new HashMap<>();
        Student student = studentService.selectStuId(studentId);
        student.setStuGroupid(teamId);
        studentService.update(student);
        updateTeam(tutor);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/stuList")
    public String stuList(Model model, HttpSession session) {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        List<Student> students = studentService.findStuList(tutor.getId());
        List<Clazz> clazzes = clazzService.selectAllClazz();
        List<Team> allTeam = teamService.findAllTeam();
        Map<Object, Object> map = new HashMap<>();
        for (Student s : students) {
            for (Team team : allTeam
                    ) {
                if (team.getId().equals(s.getStuGroupid())) {
                    map.put(s.getStuGroupid(), team.getTeamRemake());
                }
            }
        }
        for (Student student : students
                ) {
            for (Clazz clazz : clazzes
                    ) {
                if (clazz.getId().equals(student.getStuClassid())) {
                    map.put(student.getStuClassid(), clazz.getClazzName());
                }
            }
        }

        model.addAttribute("students", students);
        model.addAttribute("maps", map);
        model.addAttribute("teams", allTeam);
        return "tutor/tutor_stu";
    }

    @RequestMapping("/tutorInfo")
    public String tutorInfo() {
        return "tutor/tutor_info";
    }

    @PostMapping("/updateTutor")
    @ResponseBody
    public Map<Object, Object> updateTutor(Tutor tutor, HttpSession session) {
        Map<Object, Object> map = new HashMap<>();
        Tutor tutor1 = (Tutor) session.getAttribute("tutor");
        tutor.setId(tutor1.getId());
        tutorService.update(tutor);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/editPassword")
    public String editPassword() {

        return "tutor/tutor_password";
    }

    @RequestMapping("/task")
    public String inTask() {
        return "tutor/tutor_task";
    }

    @PostMapping("/updateTutorPassword")
    @ResponseBody
    public Map updatePassword(String newPassword, HttpSession session) {
        HashMap<Object, Object> map = new HashMap<>();
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        tutor.setTutorPassword(newPassword);
        tutorService.update(tutor);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/team")
    public String tutorTeam(Model model, HttpSession session, @RequestParam(defaultValue = "1") Integer pageNum) {
        //        分页

        PageHelper.startPage(pageNum, 6);
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        List<Team> teams = teamService.findTeamOf(tutor.getId());
        PageInfo<Team> pageInfo = new PageInfo<>(teams);

//        判断学生是否是组长
        HashMap<Object, Object> map = new HashMap<>();
        List<Student> stuList = studentService.findStuList(tutor.getId());
        for (Team team : teams
                ) {
            for (Student student : stuList
                    ) {
                if (student.getStuGroupid().equals(team.getId())) {
                    if (student.getStuIsleader() == 1) {
                        map.put(team.getId(), student.getStuName());
                    }
                }
            }

        }

        model.addAttribute("teams", teams);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("maps", map);
        return "tutor/tutor_team";
    }

    @RequestMapping("/stuScore")
    public String stuScore(Model model, HttpSession session) {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        List<Team> teams = teamService.findTeamOf(tutor.getId());
        model.addAttribute("teams", teams);
        return "tutor/tutor_stu_score";
    }

    //小组成员信息
    @RequestMapping("/teamStu")
    public String teamStu(String teamId, Model model) {
        List<Student> students = studentService.selectStudent(teamId);
        model.addAttribute("students", students);
        model.addAttribute("teamId", teamId);//需要teamID
        return "tutor/tutor_team_header";
    }
}
