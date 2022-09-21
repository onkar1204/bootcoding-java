package com.bootcoding.basic;

import com.bootcoding.oops.incapsulation.Fan;
import org.junit.Assert;
import org.junit.Test;

public class FanTest {
    @Test
    public void test1(){

        Fan f = new Fan();
        int actualSpeed=f.regulator(2);
        Assert.assertEquals(2,actualSpeed);
    }
    @Test
    public void test2(){

       Fan f = new Fan();
       int actualSpeed1=f.regulator(10);
        System.out.println(actualSpeed1);
            Assert.assertEquals(5,actualSpeed1);

    }
    @Test
    public void test3(){

        Fan f = new Fan();
        int actualSpeed1=f.regulator(-10);
        System.out.println(actualSpeed1);
        Assert.assertEquals(0,actualSpeed1);

    }

}

