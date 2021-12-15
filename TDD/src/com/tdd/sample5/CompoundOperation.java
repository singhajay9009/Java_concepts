package com.tdd.sample5;

import java.util.List;

public class CompoundOperation {

    public double getAverage(List<Integer> list){
        double sum =0;
        for(int num: list){
            sum = sum + num;
        }
        return sum/ list.size();
    }
}
