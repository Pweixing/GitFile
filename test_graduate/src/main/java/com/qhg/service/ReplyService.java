package com.qhg.service;

import com.qhg.model.Reply;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/5/4 12:07
 * @Description:
 */
public interface ReplyService {
    void insert(Reply reply);
    List<Reply> find(String problemId );
    void delReply(String problemId);
    List<Reply> selectReList(String replierId);
}
