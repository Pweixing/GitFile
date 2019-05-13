package com.qhg.service;

import com.qhg.dao.NoticeMapper;
import com.qhg.model.Notice;
import com.qhg.model.NoticeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/9 13:52
 * @Description:
 */
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
   @Autowired
    NoticeMapper noticeMapper;
    @Override
    public void insert(Notice notice) {
        noticeMapper.insert(notice);


    }

    @Override
    public List<Notice> selectListNotice(String creatorId) {
        NoticeExample noticeExample=new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andCreatoridEqualTo(creatorId);
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        return notices;
    }

    @Override
    public List<Notice> findAll() {
        return noticeMapper.findAll();
    }

    @Override
    public Notice selectNotice(String noticeId) {
        return noticeMapper.selectByPrimaryKey(noticeId);
    }

    @Override
    public void update(Notice notice) {
        noticeMapper.updateByPrimaryKey(notice);
    }

    @Override
    public void delete(String noticeId) {
        noticeMapper.deleteByPrimaryKey(noticeId);
    }


}
