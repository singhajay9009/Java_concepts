package com.tdd.sample;

public class FizzBuzz {
    public String convertNum(int num) {
        if(num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        if(num % 3 == 0) return "Fizz";
        if(num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }

    public void printConversionResult(){

    }
}