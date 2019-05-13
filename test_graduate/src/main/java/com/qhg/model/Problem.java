package com.qhg.model;

public class Problem {
    private String id;

    private String promulgatorid;

    private String problemContext;

    private Integer lookNum;

    private Integer replyNum;

    private String creatTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPromulgatorid() {
        return promulgatorid;
    }

    public void setPromulgatorid(String promulgatorid) {
        this.promulgatorid = promulgatorid == null ? null : promulgatorid.trim();
    }

    public String getProblemContext() {
        return problemContext;
    }

    public void setProblemContext(String problemContext) {
        this.problemContext = problemContext == null ? null : problemContext.trim();
    }

    public Integer getLookNum() {
        return lookNum;
    }

    public void setLookNum(Integer lookNum) {
        this.lookNum = lookNum;
    }

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }
}