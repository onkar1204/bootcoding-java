package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciMethodTest {

    @Test
    public void test1(){
        FibonacciMethod gs = new FibonacciMethod();
        int[] expectedResult = {1, 2 , 3, 5, 8};
        int[] actualResult = gs.getFibonacciOf(5);
        Assert.assertArrayEquals(expectedResult, actualResult);

    }
}
