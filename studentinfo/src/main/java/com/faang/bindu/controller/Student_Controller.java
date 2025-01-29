package com.faang.bindu.controller;

import com.faang.bindu.entity.Student_Info;
import com.faang.bindu.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Student_Controller {
    Student_Service service;
    @Autowired
    @PostMapping(value = "/insert")
    public String insertRecord(@RequestBody Student_Info info){
        Student_Info info1=service.insertRecord(info);
        return "record insert by id :"+info1.getStudent_id();
    }
    @Autowired
    @GetMapping("/display")
    public List<Student_Info> displayRecord(){
        return service.displayRecoerd();
    }

}
