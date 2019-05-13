package com.qhg.service;

import com.qhg.model.Project;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/11 19:31
 * @Description:
 */
public interface ProjectService {
    void insert(Project project);
    List<Project> selectAll();
    void updata(Project project);
    void del(String projectId);
}
