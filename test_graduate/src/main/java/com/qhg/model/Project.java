package com.qhg.model;

public class Project {
    private String id;

    private String projectName;

    private String projectGraduate;

    private String projectDescription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectGraduate() {
        return projectGraduate;
    }

    public void setProjectGraduate(String projectGraduate) {
        this.projectGraduate = projectGraduate == null ? null : projectGraduate.trim();
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription == null ? null : projectDescription.trim();
    }
}