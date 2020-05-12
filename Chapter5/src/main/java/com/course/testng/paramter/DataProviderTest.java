package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name=" +name+";age="+age);
    }

    @DataProvider(name = "data")
    public Object [][] providerData(){
        Object [][] o = new Object[][]{
                {"HH",20},
                {"wp",30},
                {"zcc",22}

        };
        return o;
    }

    @Test(dataProvider = "MethodData")
    public void test1(String name,int age){
        System.out.println("test111111 name=" +name+";age="+age);
    }

    @Test(dataProvider = "MethodData")
    public void test2(String name,int age){
        System.out.println("test2222 name=" +name+";age="+age);
    }

    @DataProvider(name = "MethodData")
    public Object [][] methodDataTest(Method method){
        Object [][] result = null;

        if(method.getName().equals("test1")){
            result = new Object [][]{
                    {"haha",11},
                    {"caca",22}
            };

        }else if (method.getName().equals("test2")){
            result = new Object [][]{
                    {"eweew",33},
                    {"wewew",44}
            };
        }
        return result;
    }
}
