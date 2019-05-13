package com.qhg.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhg.model.Project;
import com.qhg.service.ProjectService;
import com.qhg.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: admin
 * @Date: 2019/4/11 19:36
 * @Description:
 */
@Controller
@RequestMapping("/project")
public class ProjectContrller {
    @Autowired
    ProjectService projectService;

    @PostMapping("/add")
    @ResponseBody
    public Map<Object,Object> addProject(Project project){
        HashMap<Object, Object> map = new HashMap<>();
        System.out.println(project.getProjectName());
        project.setId(IdGenerator.getID());
        projectService.insert(project);
        map.put("success",true);
    return  map;
    }

    @RequestMapping("/projectList")
    public String projectList(Model model ,@RequestParam(defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum, 8);

        List<Project> projects = projectService.selectAll();
        PageInfo<Project> pageInfo = new PageInfo<>(projects );
        model.addAttribute("projects",projects);
        model.addAttribute("pageInfo",pageInfo);
        return "tutor/project_list";
    }

    @PostMapping("/editProject")
    @ResponseBody
    public Map<Object, Object> editProject(Project project){
        HashMap<Object, Object> map = new HashMap<>();
        projectService.updata(project);
        map.put("success",true);
        return map;
    }
    @PostMapping("/del")
    @ResponseBody
    public Map<Object, Object> delProject(String projectId){
        System.out.println(projectId);
        HashMap<Object, Object> map = new HashMap<>();
        projectService.del(projectId);
        map.put("success",true);
        return map;
    }
}
