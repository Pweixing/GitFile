package com.qhg.model;

public class Task {
    private String id;

    private String taskName;

    private String taskDescription;

    private String taskStarttime;

    private String taskEndtime;

    private String tutorid;

    private Integer taskTatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription == null ? null : taskDescription.trim();
    }

    public String getTaskStarttime() {
        return taskStarttime;
    }

    public void setTaskStarttime(String taskStarttime) {
        this.taskStarttime = taskStarttime == null ? null : taskStarttime.trim();
    }

    public String getTaskEndtime() {
        return taskEndtime;
    }

    public void setTaskEndtime(String taskEndtime) {
        this.taskEndtime = taskEndtime == null ? null : taskEndtime.trim();
    }

    public String getTutorid() {
        return tutorid;
    }

    public void setTutorid(String tutorid) {
        this.tutorid = tutorid == null ? null : tutorid.trim();
    }

    public Integer getTaskTatus() {
        return taskTatus;
    }

    public void setTaskTatus(Integer taskTatus) {
        this.taskTatus = taskTatus;
    }
}