package com.test.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationTest {

    /* Test Runner always loads the instance variables everytime a new test method ( @Test) runs
    So there is no need to define method like @BeforeAll or @BeforeEach just for
    initializing instance variables
    */

    private List<Integer> list = new ArrayList<>();
    private ListOperation listOperation = new ListOperation(list);

    @Test
    @DisplayName("Add an item in the list")
    public void testAddItem(){
        int num = 4;
        boolean result = listOperation.add(num);
        assertTrue(result);
    }

    @Test
    @DisplayName("Remove an item from the list- Success")
    public void testRemoveItem(){
    //    listOperation = new ListOperation(new ArrayList<>());
    //    List<Integer> list = new ArrayList<>();
        int num = 3;
        list.add(num);
      //  listOperation = new ListOperation(list);
        assertTrue(listOperation.remove(num));
    }

    @Test
    @DisplayName("Remove an item from the list which does not exist")
    public void testRemoveItemFails(){
        int num = 4;
        assertFalse(listOperation.remove(num));
    }

}
