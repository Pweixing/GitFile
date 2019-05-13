package com.qhg.model;

public class Student {
    private String id;

    private String stuAccount;

    private String stuName;

    private String stuPassword;

    private Integer stuAge;

    private String stuSex;

    private String stuClassid;

    private String stuTutorid;

    private Integer stuIphone;

    private String stuCollage;

    private String stuSpecialty;

    private Integer stuIsleader;

    private String stuGroupid;

    private Integer stuScore;

    private Integer stuLock;

    private Integer stuDelete;

    private String stuRemake;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStuAccount() {
        return stuAccount;
    }

    public void setStuAccount(String stuAccount) {
        this.stuAccount = stuAccount == null ? null : stuAccount.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuClassid() {
        return stuClassid;
    }

    public void setStuClassid(String stuClassid) {
        this.stuClassid = stuClassid == null ? null : stuClassid.trim();
    }

    public String getStuTutorid() {
        return stuTutorid;
    }

    public void setStuTutorid(String stuTutorid) {
        this.stuTutorid = stuTutorid == null ? null : stuTutorid.trim();
    }

    public Integer getStuIphone() {
        return stuIphone;
    }

    public void setStuIphone(Integer stuIphone) {
        this.stuIphone = stuIphone;
    }

    public String getStuCollage() {
        return stuCollage;
    }

    public void setStuCollage(String stuCollage) {
        this.stuCollage = stuCollage == null ? null : stuCollage.trim();
    }

    public String getStuSpecialty() {
        return stuSpecialty;
    }

    public void setStuSpecialty(String stuSpecialty) {
        this.stuSpecialty = stuSpecialty == null ? null : stuSpecialty.trim();
    }

    public Integer getStuIsleader() {
        return stuIsleader;
    }

    public void setStuIsleader(Integer stuIsleader) {
        this.stuIsleader = stuIsleader;
    }

    public String getStuGroupid() {
        return stuGroupid;
    }

    public void setStuGroupid(String stuGroupid) {
        this.stuGroupid = stuGroupid == null ? null : stuGroupid.trim();
    }

    public Integer getStuScore() {
        return stuScore;
    }

    public void setStuScore(Integer stuScore) {
        this.stuScore = stuScore;
    }

    public Integer getStuLock() {
        return stuLock;
    }

    public void setStuLock(Integer stuLock) {
        this.stuLock = stuLock;
    }

    public Integer getStuDelete() {
        return stuDelete;
    }

    public void setStuDelete(Integer stuDelete) {
        this.stuDelete = stuDelete;
    }

    public String getStuRemake() {
        return stuRemake;
    }

    public void setStuRemake(String stuRemake) {
        this.stuRemake = stuRemake == null ? null : stuRemake.trim();
    }
}