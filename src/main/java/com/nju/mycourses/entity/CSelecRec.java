package com.nju.mycourses.entity;

import javax.persistence.*;

@Entity
public class CSelecRec {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long recordId;
    @Column(nullable = false)
    private Long studentId;
    @Column(nullable = false)
    private Long curriculumId;
    @Column(nullable = false)
    private Integer approved;
    @Column(nullable = false)
    private Boolean withdraw;

    public CSelecRec() {
    }

    public CSelecRec(Long studentId, Long curriculumId, Integer approved) {
        this.studentId = studentId;
        this.curriculumId = curriculumId;
        this.approved = approved;
        this.withdraw = false;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(Long curriculumId) {
        this.curriculumId = curriculumId;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Boolean getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Boolean withdraw) {
        this.withdraw = withdraw;
    }
}
