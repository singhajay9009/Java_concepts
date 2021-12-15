package com.tdd.sample5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListOperationTest {

    private ListOperation listOperation = new ListOperation();

    @Test
    public void returnSecondLargestInteger(){
        List<Integer> listInt = Arrays.asList(2,5,23,45,30);
        int secondLargestNumberInList = 30;
        Assert.assertEquals(secondLargestNumberInList, listOperation.getSecondLargestInteger(listInt));
    }

    @Test
    public void returnOnlyElementPresent(){
        List<Integer> listInt = List.of(4);
        int largestNum = 4;
        Assert.assertEquals(largestNum, listOperation.getSecondLargestInteger(listInt));
    }

    @Test
    public void shouldThrowExceptionIfNoElementPresent(){
        //given
        List<Integer> listInt = List.of();

        //when


        //Then
        Throwable exception = Assert.assertThrows(IllegalArgumentException.class,
                () -> listOperation.getSecondLargestInteger(listInt));

        Assert.assertEquals("List can't be empty", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfListIsNull(){
        List<Integer> listInt = null;
        Exception exception = Assert.assertThrows(IllegalArgumentException.class,
                () -> listOperation.getSecondLargestInteger(listInt));
        Assert.assertEquals("List can't be null", exception.getMessage());
    }

    // verify exception is thrown
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfListIsNull_2ndWay(){
        List<Integer> listInt = null;
        listOperation.getSecondLargestInteger(listInt);
    }
}
