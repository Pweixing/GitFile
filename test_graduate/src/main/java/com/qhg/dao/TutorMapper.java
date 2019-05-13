package com.qhg.dao;

import com.qhg.model.Tutor;
import com.qhg.model.TutorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TutorMapper {
    int countByExample(TutorExample example);

    int deleteByExample(TutorExample example);

    int deleteByPrimaryKey(String id);

    int insert(Tutor record);

    int insertSelective(Tutor record);

    List<Tutor> selectByExample(TutorExample example);

    Tutor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tutor record, @Param("example") TutorExample example);

    int updateByExample(@Param("record") Tutor record, @Param("example") TutorExample example);

    int updateByPrimaryKeySelective(Tutor record);

    int updateByPrimaryKey(Tutor record);
    List<Tutor> selectAllTutor();
}