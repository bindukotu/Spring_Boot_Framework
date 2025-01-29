package com.faang.bindu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Emp_Details {
    @Id
            @Column
    Integer id;
    @Column
    String name;
    @Column
    String loc;
    Emp_Details(){}

    public Emp_Details(Integer id, String name, String loc) {
        this.id = id;
        this.name = name;
        this.loc = loc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
