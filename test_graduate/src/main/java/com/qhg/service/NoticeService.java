package com.qhg.service;

import com.qhg.model.Notice;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/9 13:51
 * @Description:
 */
public interface NoticeService {
    void insert(Notice notice);
    List<Notice> selectListNotice(String creatorId);
    List<Notice> findAll();
    Notice selectNotice(String noticeId);
    void update(Notice notice);
    void delete(String noticeId);

}
