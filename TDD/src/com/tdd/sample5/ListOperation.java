package com.tdd.sample5;

import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;

public class ListOperation {
    public int getSecondLargestInteger(List<Integer> listInt) {
        Optional.ofNullable(listInt).orElseThrow(() -> new IllegalArgumentException("List can't be null"));
        if(listInt.size() == 0) throw new IllegalArgumentException("List can't be empty");
        PriorityQueue<Integer> pqInt = new PriorityQueue<>();
        listInt.forEach(num -> pqInt.add(num));
        while(pqInt.size()>2){
            pqInt.poll();
        }
        return pqInt.poll();
    }
}
