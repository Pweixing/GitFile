package com.qhg.service;

import com.qhg.model.Task;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/23 20:35
 * @Description:
 */
public interface TaskService {
    void insert(Task task);
    List<Task> selectTask(String tutorId);
    void delTask(String taskId);
    void updateTask(Task task);
    Task select(String taskId);
}
