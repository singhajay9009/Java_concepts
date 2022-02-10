package com.tdd.sample4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetOperationTest {

    Set<Integer> set;
    SetOperation setOperation;

    @Before
    public void setUp(){
        set = new HashSet<>();
        setOperation = new SetOperation(set);
    }

    @Test
    public void returnTrueOnAddingItem(){
       int num = 4;
       Assert.assertTrue(setOperation.add(num));
    }

    @Test
    public void returnTrueOnRemovingItem(){
        int num =10;
        set.add(num);
        Assert.assertTrue(setOperation.remove(num));
    }

    @Test
    public void returnFalseOnAddingDuplicateItem(){
        int num = 12;
        set.add(num);
        Assert.assertFalse(setOperation.add(num));
    }

}
