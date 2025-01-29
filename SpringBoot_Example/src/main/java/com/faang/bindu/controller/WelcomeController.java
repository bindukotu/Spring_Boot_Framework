package com.faang.bindu.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    WelcomeController(){
        System.out.println("welcome controller constructor");
    }
    public void disp(){
        System.out.println("display controller");
    }
}
