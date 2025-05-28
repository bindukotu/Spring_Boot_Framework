package com.example.sqlmail.service;

import com.example.sqlmail.entity.FaangEntity;
import com.example.sqlmail.repo.FaangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaangSer {
    @Autowired
    FaangRepo repo;
    @Autowired
    JavaMailSender js;
    public void send(FaangEntity fe){
        repo.save(fe);
    }
    public void sendMail(String des){
       List<FaangEntity> li=repo.findByDesignation(des);

        SimpleMailMessage sm=new SimpleMailMessage();
        sm.setFrom("bindustudy85@gmail.com");
       for(int i=0;i<li.size();i++){
           String s1="Hi "+li.get(i).getName()+" , \n"+li.get(i).getSubject();
           sm.setTo(li.get(i).getToSend());
           sm.setSubject(li.get(i).getBody());
           sm.setText(s1);
           js.send(sm);
       }
    }
}
