package com.example.apimail.service;

import com.example.apimail.entity.EmailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
@Autowired
    JavaMailSender js;
public void  send(EmailEntity ee){
    SimpleMailMessage sm=new SimpleMailMessage();
    sm.setFrom("bindustudy85@gmail.com");
    sm.setBcc(ee.getTo());
    //sm.setTo(ee.getTo());
    sm.setSubject(ee.getSubject());
    sm.setText(ee.getBody());
    js.send(sm);
 }
}
