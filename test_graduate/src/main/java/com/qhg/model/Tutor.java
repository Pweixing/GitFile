package com.qhg.model;

public class Tutor {
    private String id;

    private String tutorName;

    private String tutorPassword;

    private String tutorSex;

    private Integer tutorAge;

    private String tutorIphone;

    private String tutorRemake;

    private String tutorEmail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName == null ? null : tutorName.trim();
    }

    public String getTutorPassword() {
        return tutorPassword;
    }

    public void setTutorPassword(String tutorPassword) {
        this.tutorPassword = tutorPassword == null ? null : tutorPassword.trim();
    }

    public String getTutorSex() {
        return tutorSex;
    }

    public void setTutorSex(String tutorSex) {
        this.tutorSex = tutorSex == null ? null : tutorSex.trim();
    }

    public Integer getTutorAge() {
        return tutorAge;
    }

    public void setTutorAge(Integer tutorAge) {
        this.tutorAge = tutorAge;
    }

    public String getTutorIphone() {
        return tutorIphone;
    }

    public void setTutorIphone(String tutorIphone) {
        this.tutorIphone = tutorIphone == null ? null : tutorIphone.trim();
    }

    public String getTutorRemake() {
        return tutorRemake;
    }

    public void setTutorRemake(String tutorRemake) {
        this.tutorRemake = tutorRemake == null ? null : tutorRemake.trim();
    }

    public String getTutorEmail() {
        return tutorEmail;
    }

    public void setTutorEmail(String tutorEmail) {
        this.tutorEmail = tutorEmail == null ? null : tutorEmail.trim();
    }
}