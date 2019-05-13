package com.qhg.model;

public class Clazz {
    private String id;

    private String clazzName;

    private String clazzCreattime;

    private Integer clazzNum;

    private String clazzRemake;

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName == null ? null : clazzName.trim();
    }

    public String getClazzCreattime() {
        return clazzCreattime;
    }

    public void setClazzCreattime(String clazzCreattime) {
        this.clazzCreattime = clazzCreattime == null ? null : clazzCreattime.trim();
    }

    public Integer getClazzNum() {
        return clazzNum;
    }

    public void setClazzNum(Integer clazzNum) {
        this.clazzNum = clazzNum;
    }

    public String getClazzRemake() {
        return clazzRemake;
    }

    public void setClazzRemake(String clazzRemake) {
        this.clazzRemake = clazzRemake == null ? null : clazzRemake.trim();
    }
}