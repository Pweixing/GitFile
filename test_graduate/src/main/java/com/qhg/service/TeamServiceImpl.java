package com.qhg.service;

import com.qhg.dao.TeamMapper;
import com.qhg.model.Team;
import com.qhg.model.TeamExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/14 10:17
 * @Description:
 */
@Service
@Transactional
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamMapper teamMapper;

    @Override
    public void insert(Team team) {
        teamMapper.insert(team);

    }

    @Override
    public List<Team> findAllTeam() {
        return teamMapper.findAllTeam();

    }

    @Override
    public List<Team> findTeamOf(String tutorId) {
        TeamExample teamExample = new TeamExample();
        TeamExample.Criteria criteria = teamExample.createCriteria();
        criteria.andTeamTutoridEqualTo(tutorId);
        return teamMapper.selectByExample(teamExample);

    }

    @Override
    public void delTeam(Team team) {
        teamMapper.deleteByPrimaryKey(team.getId());
    }

    @Override
    public void update(Team team) {
        teamMapper.updateByPrimaryKeySelective(team);
    }

    @Override
    public Team selectTeam(String teamId) {
        TeamExample teamExample=new TeamExample();
        TeamExample.Criteria criteria = teamExample.createCriteria();
        criteria.andIdEqualTo(teamId);
        List<Team> teams = teamMapper.selectByExample(teamExample);
        return teams.get(0);
    }


}
