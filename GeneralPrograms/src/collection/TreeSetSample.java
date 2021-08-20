package collection;

import java.util.*;

public class TreeSetSample {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.addAll(Arrays.asList("Ajay", "David", "Jasmin", "Cavin"));
        Iterator<String> iterator = set.descendingIterator();

     //   set.add(null);
        for(String s : set){
            System.out.println(s);
        }

    }
}
