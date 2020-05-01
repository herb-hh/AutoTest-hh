package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test测试用例1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
        System.out.println("hh");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }

    @Test
    public void testCase2(){
        System.out.println("Test测试用例2");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("aftercalss");
    }

}
