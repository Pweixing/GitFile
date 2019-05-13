package com.qhg.dao;

import com.qhg.model.Team;
import com.qhg.model.TeamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeamMapper {
    int countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(String id);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
    List<Team> findAllTeam();
}