package sample4;

import com.tdd.sample4.SetOperation;
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
    public void testAddItem(){
       int num = 4;
       Assert.assertTrue(setOperation.add(num));
    }

    @Test
    public void testRemoveItem(){
        int num =10;
        set.add(num);
        Assert.assertTrue(setOperation.remove(num));
    }

    @Test
    public void testShouldNotAllowDuplicate(){
        int num = 12;
        set.add(num);
        Assert.assertFalse(setOperation.add(num));
    }

}
