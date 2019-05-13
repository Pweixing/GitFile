package com.qhg.dao;

import com.qhg.model.Clazz;
import com.qhg.model.ClazzExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClazzMapper {

    List<Clazz>  selectAllClazz(); //自行配置

    int countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int deleteByPrimaryKey(String id);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExample(ClazzExample example);


    Clazz selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}