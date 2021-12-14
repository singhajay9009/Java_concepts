package com.tdd.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
//import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testNormalNumbers(){
        assertEquals("1", fizzBuzz.convertNum(1));
        assertEquals("2", fizzBuzz.convertNum(2));
    }

    public void shouldReturnNumberForAnyNormalNumberOtherThanThreeOrFive(){

    }

    @Test
    public void testMultipleOfThree(){
        assertEquals("Fizz", fizzBuzz.convertNum(3));
    }

    @Test
    public void testMultipleOfFive(){
        assertEquals("Buzz", fizzBuzz.convertNum(5));
    }

    @Test
    public void testMultipleOfThreeAndFive(){
        assertEquals("FizzBuzz", fizzBuzz.convertNum(15));
    }

    /* we put one more requirement if no is 53, then throw exception that "invalid no."

     */

    @Test
    public void testInvalidNumber(){
        int num = 53;
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> fizzBuzz.convertNum(num));
        assertEquals("Invalid no.", exception.getMessage());
    }

}
