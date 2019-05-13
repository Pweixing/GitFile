package com.qhg.service;

import com.qhg.dao.ProblemMapper;
import com.qhg.model.Problem;
import com.qhg.model.ProblemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/5/3 22:30
 * @Description:
 */

@Service
@Transactional
public class ProblemServiceImpl implements ProblemService{
    @Autowired
    ProblemMapper problemMapper;
    @Override
    public void insert(Problem problem) {
        problemMapper.insert(problem);

    }

    @Override
    public List<Problem> allProblem() {
       return problemMapper.allProblem();

    }

    @Override
    public Problem select(String problemId) {
        return problemMapper.selectByPrimaryKey(problemId);
    }

    @Override
    public void update(Problem problem) {
        problemMapper.updateByPrimaryKeySelective(problem);
    }

    @Override
    public List<Problem> find(String promulgatorId) {
        ProblemExample problemExample=new ProblemExample();
        ProblemExample.Criteria criteria = problemExample.createCriteria();
        criteria.andPromulgatoridEqualTo(promulgatorId);
       return problemMapper.selectByExample(problemExample);
    }

    @Override
    public void delProblem(String problemId) {
        problemMapper.deleteByPrimaryKey(problemId);
    }
}
