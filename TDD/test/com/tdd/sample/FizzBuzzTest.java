package com.tdd.sample;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testNormalNumbers(){
        assertEquals("1", fizzBuzz.convertNum(1));
        assertEquals("2", fizzBuzz.convertNum(2));
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

}
