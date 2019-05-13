package com.qhg.controller;

import com.qhg.model.Problem;
import com.qhg.model.Reply;
import com.qhg.model.Student;
import com.qhg.model.Tutor;
import com.qhg.service.ProblemService;
import com.qhg.service.ReplyService;
import com.qhg.service.StudentService;
import com.qhg.service.TutorService;
import com.qhg.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: admin
 * @Date: 2019/5/4 10:52
 * @Description:
 */
@Controller
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    ReplyService replyService;
    @Autowired
    ProblemService problemService;
    @Autowired
    TutorService tutorService;
    @Autowired
    StudentService studentService;

    @RequestMapping("/replyIndex")
    public String inReplyIndex(String problemId, Model model, HttpSession session) {
        Student student1 = (Student) session.getAttribute("student");
        Problem problem = problemService.select(problemId);
        if (!(student1.getId().equals(problem.getPromulgatorid()))) {
            problem.setLookNum(problem.getLookNum() + 1);
            problemService.update(problem);
        }

        List<Reply> replies = replyService.find(problemId);
        //显示X条
        List<Reply> replyList = null;
        if (replies.size() >= 6) {
            replyList = replies.subList(0, 5);  //start,end分别是第几个到第几个。

        }

        //获取导师和学生的所有表信息
        List<Tutor> tutors = tutorService.selectAllTutor();
        List<Student> students = studentService.selectAllStu();
        //查询
        for (Tutor tutor : tutors
                ) {
            if (tutor.getId().equals(problem.getPromulgatorid())) {
                model.addAttribute("Name", tutor.getTutorName() + ("导师"));
            }
        }
        for (Student student : students
                ) {
            if (student.getId().equals(problem.getPromulgatorid())) {
                model.addAttribute("Name", student.getStuName());
            }
        }
        Collections.reverse(replies);   //排序
        model.addAttribute("replies", replies);//所有
        model.addAttribute("replyList", replyList); //
        model.addAttribute("problem", problem);
        return "student/student_problem_reply";
    }

    @PostMapping("/replyStuProblem")
    @ResponseBody
    public Map<Object, Object> replyStuProblem(String problemId, String context, String replierId) {       //回复
        HashMap<Object, Object> map = new HashMap<>();
        Problem problem = problemService.select(problemId);
        problem.setReplyNum(problem.getReplyNum() + 1);
        problemService.update(problem);
        Reply reply = new Reply();
        reply.setId(IdGenerator.getID());
        reply.setProblemId(problemId);
        reply.setReplyContext(context);
        reply.setReplierId(replierId);

        Student student = studentService.selectStuId(replierId);
        //判断 学生 导师
        Tutor tutor = tutorService.select(replierId);
        if (student != null) {
            reply.setReplyName(student.getStuName());
        }
        if (tutor != null) {
            reply.setReplyName(tutor.getTutorName());
        }

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        reply.setReplyTime(format);
        replyService.insert(reply);
        map.put("success", true);
        return map;
    }

    //
    @RequestMapping("/replyTutIndex")
    public String replyTutIndex(String problemId, Model model, HttpSession session) {
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        Problem problem = problemService.select(problemId);
        if (!(tutor.getId().equals(problem.getPromulgatorid()))) {
            problem.setLookNum(problem.getLookNum() + 1);
            problemService.update(problem);
        }

        List<Reply> replies = replyService.find(problemId);
        //显示X条
        Collections.reverse(replies);   //排序

        List<Reply> replyList = null;
        if (replies.size() >= 6) {
            replyList = replies.subList(0, 5);  //start,end分别是第几个到第几个。

        }

        //获取导师和学生的所有表信息
        List<Tutor> tutors = tutorService.selectAllTutor();
        List<Student> students = studentService.selectAllStu();
        //查询
        for (Tutor t : tutors
                ) {
            if (t.getId().equals(problem.getPromulgatorid())) {
                model.addAttribute("Name", t.getTutorName() + ("导师"));
            }
        }
        for (Student student : students
                ) {
            if (student.getId().equals(problem.getPromulgatorid())) {
                model.addAttribute("Name", student.getStuName());
            }
        }
        model.addAttribute("replies", replies);//所有
        model.addAttribute("replyList", replyList); //
        model.addAttribute("problem", problem);
        return "tutor/tutor_problem_reply";
    }


}
