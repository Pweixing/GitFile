package com.qhg.service;

import com.qhg.dao.ProjectMapper;
import com.qhg.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/11 19:32
 * @Description:
 */
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectMapper projectMapper;
    @Override
    public void insert(Project project) {
        projectMapper.insert(project);


    }

    @Override
    public List<Project> selectAll() {
        return projectMapper.findAll();
    }

    @Override
    public void updata(Project project) {
        projectMapper.updateByPrimaryKeySelective(project);
    }

    @Override
    public void del(String projectId) {
        projectMapper.deleteByPrimaryKey(projectId);
    }
}
