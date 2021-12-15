package com.tdd.sample5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CompoundOperationTest {

    @Test
    public void testGetAverage(){
        List<Integer> list = List.of(3,5,6,8);
        double expectedAvg = 5.5;  // (3+5+6+8)/4

        CompoundOperation compoundOperation = new CompoundOperation();
        double actualAvg = compoundOperation.getAverage(list);
        Assert.assertEquals(0, Double.compare(expectedAvg, actualAvg));
    }


}
