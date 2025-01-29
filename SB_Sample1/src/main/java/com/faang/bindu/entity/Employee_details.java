package com.faang.bindu.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee_details {
    @Id
    @Column
    Integer emp_id;
    @Column
    String emp_name;
    @Column
    String emp_desgnation;
    public Employee_details(){}

    public Employee_details(Integer emp_id, String emp_name, String emp_desgnation) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_desgnation = emp_desgnation;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_desgnation() {
        return emp_desgnation;
    }

    public void setEmp_desgnation(String emp_desgnation) {
        this.emp_desgnation = emp_desgnation;
    }
}
