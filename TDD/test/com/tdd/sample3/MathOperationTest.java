package com.tdd.sample3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathOperationTest {

    private MathOperation mathOperation;

    @Before
    public void setUp(){
        mathOperation = new MathOperation();
    }

    @Test
    public void testAddNumbers(){
        //given
        int num1 = 4;
        int num2 = 6;

        //when
        int actualResult = mathOperation.add(num1, num2);

        //then
        int expectedResult = 10;  //num1 + num2
        Assert.assertEquals(expectedResult, actualResult);


        /*
        Assert.assertEquals(10, mathOperation.add(4,6));
         */
    }

    @Test
    public void testSubtractNumbers(){
        int num1 = 10;
        int num2 = 3;
        int expectedResult = 7; // num1 - num2

        int actualResult = mathOperation.subtract(num1, num2);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
