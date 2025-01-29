package com.faang.bindu.demo;

import com.faang.bindu.controller.WelcomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.faang.bindu.controller")
public class BeanClassCreation {
    public static void main(String[] args) {
        ConfigurableApplicationContext con= SpringApplication.run(BeanClassCreation.class,args);
//        WelcomeController wc=con.getBean(WelcomeController.class);
//        wc.disp();
        WelcomeController w1=con.getBean("welcomeController", WelcomeController.class);
        w1.disp();

    }
}
