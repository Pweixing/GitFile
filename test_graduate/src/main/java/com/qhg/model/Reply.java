package com.qhg.model;

public class Reply {
    private String id;

    private String replyName;

    private String replierId;

    private String replyContext;

    private String replyTime;

    private String problemId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName == null ? null : replyName.trim();
    }

    public String getReplierId() {
        return replierId;
    }

    public void setReplierId(String replierId) {
        this.replierId = replierId == null ? null : replierId.trim();
    }

    public String getReplyContext() {
        return replyContext;
    }

    public void setReplyContext(String replyContext) {
        this.replyContext = replyContext == null ? null : replyContext.trim();
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime == null ? null : replyTime.trim();
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId == null ? null : problemId.trim();
    }
}