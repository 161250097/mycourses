package com.nju.mycourses.POJO;

public class CurriculumCardTC {
    private Long curriculumId;
    private String courseName;
    private String semesterYear;
    private String semesterSeason;
    private String schedule;
    private Integer restriction;
    private Integer selected;
    private String state;

    public CurriculumCardTC(Long curriculumId, String courseName, String semesterYear, String semesterSeason, String schedule, Integer restriction, Integer selected, String state) {
        this.curriculumId = curriculumId;
        this.courseName = courseName;
        this.semesterYear = semesterYear;
        this.semesterSeason = semesterSeason;
        this.schedule = schedule;
        this.restriction = restriction;
        this.selected = selected;
        this.state = state;
    }

    public Long getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(Long curriculumId) {
        this.curriculumId = curriculumId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSemesterYear() {
        return semesterYear;
    }

    public void setSemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }

    public String getSemesterSeason() {
        return semesterSeason;
    }

    public void setSemesterSeason(String semesterSeason) {
        this.semesterSeason = semesterSeason;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Integer getRestriction() {
        return restriction;
    }

    public void setRestriction(Integer restriction) {
        this.restriction = restriction;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
