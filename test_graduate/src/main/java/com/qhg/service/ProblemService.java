package com.qhg.service;

import com.qhg.model.Problem;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/5/3 22:30
 * @Description:
 */
public interface ProblemService {
    void insert(Problem problem);
    List<Problem> allProblem();
    Problem select(String problemId);
    void update(Problem problem);
    List<Problem> find(String promulgatorId);
    void delProblem(String problemId);
}
