package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTet {

    @Test(timeOut = 3000)//我能容忍的超时时间是3秒
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);//设置了一个2秒通过的进程，所以能通过
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}
