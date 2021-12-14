package com.tdd.sample4;

import java.util.Set;

public class SetOperation {

    private Set<Integer> set;

    public SetOperation(Set<Integer> set) {
        this.set = set;
    }

    public boolean add(int num) {
       return set.add(num);
    }

    public boolean remove(int num) {
        return set.remove(num);
    }
}
