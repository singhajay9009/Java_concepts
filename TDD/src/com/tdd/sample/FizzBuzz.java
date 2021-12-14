package com.tdd.sample;

public class FizzBuzz {
    public String convertNum(int num) {
        if(num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        if(num % 3 == 0) return "Fizz";
        if(num % 5 == 0) return "Buzz";
        if(num == 53) throw new IllegalArgumentException("Invalid no.");
        return String.valueOf(num);
    }

    public void printConversionResult(){

    }
}
