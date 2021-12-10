package com.test.demo;

import java.util.List;

public class ListOperation {

    private List<Integer> list;

    public ListOperation(List<Integer> list) {
        this.list = list;
    }

    public boolean add(int num) {
         return list.add(num);
    }

    public boolean remove(int num) {

        return list.remove(Integer.valueOf(num));
    }
}
