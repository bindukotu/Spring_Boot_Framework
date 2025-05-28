package com.example.sqlmail.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.lang.annotation.Repeatable;

@Entity
@Table
public class FaangEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    private String toSend;
    @Column
    private  String subject;
    @Column
    private  String body;
    @Column
  private   String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
private String name;
    public FaangEntity(String toSend, String subject, String body, String designation,String name) {
        this.toSend = toSend;
        this.subject = subject;
        this.body = body;
        this.designation = designation;
        this.name=name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public FaangEntity(){}
    public String getToSend() {
        return toSend;
    }

    public void setToSend(String toSend) {
        this.toSend = toSend;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
