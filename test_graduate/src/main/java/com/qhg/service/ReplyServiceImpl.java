package com.qhg.service;

import com.qhg.dao.ReplyMapper;
import com.qhg.model.Reply;
import com.qhg.model.ReplyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/5/4 12:09
 * @Description:
 */
@Service
@Transactional
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    ReplyMapper replyMapper;
    @Override
    public void insert(Reply reply) {
        replyMapper.insert(reply);

    }

    @Override
    public List<Reply> find(String problemId) {
        ReplyExample replyExample = new ReplyExample();
        ReplyExample.Criteria criteria = replyExample.createCriteria();
        criteria.andProblemIdEqualTo(problemId);
       return replyMapper.selectByExample(replyExample);
    }

    @Override
    public void delReply(String problemId) {
        ReplyExample replyExample=new ReplyExample();
        ReplyExample.Criteria criteria = replyExample.createCriteria();
        criteria.andProblemIdEqualTo(problemId);
        replyMapper.deleteByExample(replyExample);
    }

    @Override
    public List<Reply> selectReList(String replierId) {
        ReplyExample replyExample = new ReplyExample();
        ReplyExample.Criteria criteria = replyExample.createCriteria();
        criteria.andReplierIdEqualTo(replierId);
       return replyMapper.selectByExample(replyExample);

    }
}
