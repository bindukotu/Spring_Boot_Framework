package com.faang.bindu;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestApp {
    @Test
    @Order(1)
    public void box(){
        System.out.println("This is Apple");
    }
    @Test
    @Order(3)
    public void cat(){
        System.out.println("this is cat test 3");
    }
    @Test
    @Order(2)
    public void dog(){
        System.out.println("this is dob test2");
    }

}
