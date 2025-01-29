package com.faang.bindu;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class SkippingTest {
    @Test
    @Disabled
    public void running(){
        System.out.println("this is running");
    }
    @Test
    public void workingProgress(){
        System.out.println("this is working");
    }
}
