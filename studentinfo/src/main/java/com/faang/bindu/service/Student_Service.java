package com.faang.bindu.service;

import com.faang.bindu.entity.Student_Info;
import com.faang.bindu.repo.Student_Repo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class Student_Service {
    Student_Repo repo;

     public Student_Info insertRecord(Student_Info info){
         Student_Info info1=new Student_Info();
         return repo.save(info1);
     }

     public List<Student_Info> displayRecoerd(){
         List<Student_Info> li=(List<Student_Info>)repo.findAll();
         return li;
     }


}
