package com.qhg.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: admin
 * @Date: 2019/5/3 20:38
 * @Description:
 */
@Controller
@RequestMapping("/problem")
public class ProblemController {
    @Autowired
    ProblemService problemService;
    @Autowired
    TutorService tutorService;
    @Autowired
    StudentService studentService;
    @Autowired
    ReplyService replyService;


    @RequestMapping("/problemList")     //学生
    public String problemStuList(@RequestParam(defaultValue = "1") Integer pageNum, Model model) {
        PageHelper.startPage(pageNum, 6);
        List<Problem> problems = problemService.allProblem();
        //查询
        Map<Object, Object> map = promulgatorName(problems);  //
        PageInfo<Problem> pageInfo = new PageInfo<>(problems);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("problems", problems);
        model.addAttribute("maps", map);    //姓名
        return "student/student_problem_list";

    }

    @PostMapping("/addProblem")
    @ResponseBody
    public Map<Object, Object> addProblem(Problem problem) {
        HashMap<Object, Object> map = new HashMap<>();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);

        if (problem.getProblemContext().equals("")) {
            map.put("err", true);
        } else {
            problem.setId(IdGenerator.getID());
            problem.setCreatTime(format);
            problem.setLookNum(0);
            problem.setReplyNum(0);
            problemService.insert(problem);
            map.put("success", true);
        }

        return map;
    }

    @RequestMapping("/myProblem")
    public String myProblem(@RequestParam(defaultValue = "1") Integer pageNum, Model model, HttpSession session) {
        PageHelper.startPage(pageNum, 6);
        Student student = (Student) session.getAttribute("student");
        List<Problem> problems = problemService.find(student.getId());
        PageInfo<Problem> pageInfo = new PageInfo<>(problems);
        model.addAttribute("problems", problems);
        model.addAttribute("pageInfo", pageInfo);
        return "student/student_problem_info";
    }

    @PostMapping("/delProblem")
    @ResponseBody
    public Map<Object, Object> delProblem(String problemId) {
        HashMap<Object, Object> map = new HashMap<>();
        /**
         * @Description: 删除 问题，需要删除回答
         * @Param: [problemId]
         * @return: java.util.Map<java.lang.Object       ,       java.lang.Object>
         * @Date: 2019/5/4
         */
        problemService.delProblem(problemId);
        replyService.delReply(problemId);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/stuMyReply")//参与讨论
    public String stuMyReply(@RequestParam(defaultValue = "1") Integer pageNum, Model model, HttpSession session) {
        PageHelper.startPage(pageNum, 6);

        Student student = (Student) session.getAttribute("student");
        //获取所有答复
        List<Reply> replyList = replyService.selectReList(student.getId());
        //使用Set  hashSet treeSet(排序)
        HashSet<String> set = new HashSet<>();
        for (Reply reply : replyList
                ) {
            set.add(reply.getProblemId());  //problemId
        }

        List<Problem> problems = new ArrayList<>();
        for (String problemId : set
                ) {
            Problem problem = problemService.select(problemId);
            problems.add(problem);
        }
        PageInfo<Problem> pageInfo = new PageInfo<>(problems);
        //查询姓名
        Map<Object, Object> map = promulgatorName(problems);

        model.addAttribute("problems", problems);
        model.addAttribute("maps", map);
        model.addAttribute("pageInfo", pageInfo);
        return "student/student_problem_my_reply";
    }
//
//


    //    -------------------------------------导师页面------------------------------------------
    @RequestMapping("/problemTutList")
    public String problemTutList(@RequestParam(defaultValue = "1") Integer pageNum, Model model) {
        PageHelper.startPage(pageNum, 6);
        List<Problem> problems = problemService.allProblem();
        //查询
        Map<Object, Object> map = promulgatorName(problems);
        PageInfo<Problem> pageInfo = new PageInfo<>(problems);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("problems", problems);
        model.addAttribute("maps", map);    //姓名
        return "tutor/tutor_problem_list";

    }

    @RequestMapping("/myTutProblem")
    public String myTutProblem(@RequestParam(defaultValue = "1") Integer pageNum, Model model, HttpSession session) {
        PageHelper.startPage(pageNum, 6);
        Tutor tutor = (Tutor) session.getAttribute("tutor");
        List<Problem> problems = problemService.find(tutor.getId());
        PageInfo<Problem> pageInfo = new PageInfo<>(problems);
        model.addAttribute("problems", problems);
        model.addAttribute("pageInfo", pageInfo);
        return "tutor/tutor_problem_info";
    }

    //方法体
    public Map<Object, Object> promulgatorName(List<Problem> problems) {
        HashMap<Object, Object> map = new HashMap<>();
        //获取导师和学生的所有表信息
        List<Tutor> tutors = tutorService.selectAllTutor();
        List<Student> students = studentService.selectAllStu();
        for (Problem problem : problems
                ) {
            for (Tutor tutor : tutors
                    ) {
                if (tutor.getId().equals(problem.getPromulgatorid())) {
                    map.put(problem.getPromulgatorid(), tutor.getTutorName() + "(导师)");
                }
            }
            for (Student student : students
                    ) {
                if (student.getId().equals(problem.getPromulgatorid())) {
                    map.put(problem.getPromulgatorid(), student.getStuName());
                }
            }

        }
        return map;
    }

    @RequestMapping("/tutMyReply")
    public String tutMyReply(@RequestParam(defaultValue = "1") Integer pageNum, Model model, HttpSession session) {
        PageHelper.startPage(pageNum, 6);

        Tutor tutor = (Tutor) session.getAttribute("tutor");
        //获取所有答复
        List<Reply> replyList = replyService.selectReList(tutor.getId());
        //使用Set  hashSet treeSet(排序)
        HashSet<String> set = new HashSet<>();
        for (Reply reply : replyList
                ) {
            set.add(reply.getProblemId());  //problemId
        }

        List<Problem> problems = new ArrayList<>();
        for (String problemId : set
                ) {
            Problem problem = problemService.select(problemId);
            problems.add(problem);
        }
        PageInfo<Problem> pageInfo = new PageInfo<>(problems);
        //查询姓名
        Map<Object, Object> map = promulgatorName(problems);
        model.addAttribute("problems", problems);
        model.addAttribute("maps", map);
        model.addAttribute("pageInfo", pageInfo);
        return "tutor/tutor_problem_my_reply";
    }

}
