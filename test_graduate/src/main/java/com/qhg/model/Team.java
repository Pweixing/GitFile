package com.qhg.model;

public class Team {
    private String id;

    private String teamName;

    private String teamProject;

    private Integer teamPeopleNum;

    private String teamTutorid;

    private String teamHeaderid;

    private Integer teamScore;

    private String teamRemake;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getTeamProject() {
        return teamProject;
    }

    public void setTeamProject(String teamProject) {
        this.teamProject = teamProject == null ? null : teamProject.trim();
    }

    public Integer getTeamPeopleNum() {
        return teamPeopleNum;
    }

    public void setTeamPeopleNum(Integer teamPeopleNum) {
        this.teamPeopleNum = teamPeopleNum;
    }

    public String getTeamTutorid() {
        return teamTutorid;
    }

    public void setTeamTutorid(String teamTutorid) {
        this.teamTutorid = teamTutorid == null ? null : teamTutorid.trim();
    }

    public String getTeamHeaderid() {
        return teamHeaderid;
    }

    public void setTeamHeaderid(String teamHeaderid) {
        this.teamHeaderid = teamHeaderid == null ? null : teamHeaderid.trim();
    }

    public Integer getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(Integer teamScore) {
        this.teamScore = teamScore;
    }

    public String getTeamRemake() {
        return teamRemake;
    }

    public void setTeamRemake(String teamRemake) {
        this.teamRemake = teamRemake == null ? null : teamRemake.trim();
    }
}