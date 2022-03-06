package collection;

import java.util.*;

public class TreeSetSample {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.addAll(Arrays.asList("Ajay", "David", "Jasmin", "Cavin"));

     //   natural sorted order
        for(String s : set){
            System.out.println(s);
        }

        System.out.println("=============");

        // if we want to reverse the natural sorted order
        Iterator<String> iterator = set.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
