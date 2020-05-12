package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExceptedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("异常测试");
        throw new RuntimeException();

    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("失败异常测试");


    }

}
