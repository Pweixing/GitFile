package com.qhg.service;

import com.qhg.model.Team;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/14 10:15
 * @Description:
 */
public interface  TeamService {
    void insert(Team team);
    List<Team> findAllTeam();
    List<Team> findTeamOf(String tutorId);
    void delTeam(Team team);
    void  update(Team team);
    Team selectTeam(String teamId);
}
