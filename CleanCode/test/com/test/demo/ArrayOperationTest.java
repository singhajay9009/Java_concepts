package com.test.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayOperationTest {

    private ArrayOperation arrayOperation;

    @BeforeEach
    public void setUp(){
        arrayOperation = new ArrayOperation();
    }

    @Test
    @DisplayName("should return nth highest integer from Array")
    public void shouldReturnNthHighestInt(){
        int[] arrInt = {1,5, -4, 14, -12, 17};
        int n = 3;
        int thirdHighestVal = 5;
        int resultVal = arrayOperation.getNthLargestInt(arrInt, n);
        assertEquals(thirdHighestVal, resultVal);
    }

    @Test
    @DisplayName("should throw exception if array is null")
    public void shouldThrowExceptionIfArrayIsNull(){
        int[] arrInt = null;
        int n = 0;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> arrayOperation.getNthLargestInt(arrInt, n));
        assertEquals("Array can't be empty or null", exception.getMessage());
    }

    @Test
    @DisplayName("should throw exception if array is empty")
    public void shouldThrowExceptionIfArrayIsEmpty(){
        int[] arrInt = {};
        int n = 0;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> arrayOperation.getNthLargestInt(arrInt, n));
        assertEquals("Array can't be empty or null", exception.getMessage());
    }

    @Test
    @DisplayName("should throw an exception if 'n' is larger than count of elements in Array")
    public void shouldThrowExceptionIfNExceedsArrayLength(){
        int[] arrInt = {-34, 23, 2};
        int n = 4;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> arrayOperation.getNthLargestInt(arrInt, n));
        assertEquals("n must be in range 1=< n <=ArraySize", exception.getMessage());
    }

    @Test
    @DisplayName("should throw an exception if 'n' is less than 1")
    public void shouldThrowExceptionIfNIsLessThanOne(){
        int[] arrInt = {-2, 12, 1};
        int n = 0;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> arrayOperation.getNthLargestInt(arrInt, n));
        assertEquals("n must be in range 1=< n <=ArraySize", exception.getMessage());
    }
}
