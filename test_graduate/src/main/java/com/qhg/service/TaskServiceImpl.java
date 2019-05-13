package com.qhg.service;

import com.qhg.dao.TaskMapper;
import com.qhg.model.Task;
import com.qhg.model.TaskExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/23 20:36
 * @Description:
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;
    @Override
    public void insert(Task task) {
        taskMapper.insert(task);


    }

    @Override
    public List<Task> selectTask(String tutorId) {
        TaskExample taskExample=new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTutoridEqualTo(tutorId);
        return taskMapper.selectByExample(taskExample);

    }

    @Override
    public void delTask(String taskId) {
        taskMapper.deleteByPrimaryKey(taskId);
    }

    @Override
    public void updateTask(Task task) {
        taskMapper.updateByPrimaryKeySelective(task);
    }

    @Override
    public Task select(String taskId) {
        return taskMapper.selectByPrimaryKey(taskId);

    }
}
