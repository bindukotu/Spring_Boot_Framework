package com.faang.bindu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student_Info {
    @Id
    @Column
    Integer student_id;
    @Column
    String student_name;
    @Column
    String course;
    @Column
    Double persentage;
    @Column
    String grade;
    public Student_Info(){}

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getPersentage() {
        return persentage;
    }

    public void setPersentage(Double persentage) {
        this.persentage = persentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


}
