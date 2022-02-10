package com.test.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayOperation {

    public int getNthLargestInt(int[] arrInt, int n) {
        //Optional.ofNullable(arrInt).isEmpty()
        if( arrInt== null || arrInt.length == 0) {
            throw new IllegalArgumentException("Array can't be empty or null");
        }
        if(n < 1 || n > arrInt.length) {
            throw new IllegalArgumentException("n must be in range 1=< n <=ArraySize");
        }

//        Optional.ofNullable(arrInt).orElseThrow(() -> new IllegalArgumentException("Array can't be null"));
//        if(arrInt.length == 0) throw new IllegalArgumentException("Array can't be empty");

//        if(n > arrInt.length) throw new IllegalArgumentException("N can't be greater than count of elements in Array");
//        if(n < 1) throw new IllegalArgumentException("N can't be less than 1");

        List<Integer> listInt = Arrays.stream(arrInt).boxed().
                collect(Collectors.toList());
        Collections.sort(listInt);

        return listInt.get(listInt.size()-n);
    }
}
