package com.qhg.dao;

import com.github.pagehelper.Page;
import com.qhg.model.Notice;
import com.qhg.model.NoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeMapper {
    int countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);


    /**
     * 获取所有数据
     * @return
     */
    List<Notice> findAll();

    /**
     * 分页查询数据
     * @return
     */
    Page<Notice> findByPage();
}