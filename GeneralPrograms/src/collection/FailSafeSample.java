package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeSample {

    public static void main(String[] args) {

        CopyOnWriteArrayList list = new CopyOnWriteArrayList(Arrays.asList(1,2,3,4));

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
            if(i == 2){
                list.add(5);
            }
        }
    }
}
