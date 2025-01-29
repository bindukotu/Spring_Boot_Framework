package com.faang.bindu;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagingTest {

    @Test
    @Tag("SomkeTest")

    public void test2(){
        System.out.println("SomkeTest");
    }
    @Test
    @Tag("RegressionTest")

    public void test3(){
        System.out.println("RegressionTest");
    }
    @Test
    @Tag("Ball")
    public void test4(){
        System.out.println("Tag test");
    }
    @Test
    @Tag("Apple")
    public void test1(){
        System.out.println("Apple");
    }
}
