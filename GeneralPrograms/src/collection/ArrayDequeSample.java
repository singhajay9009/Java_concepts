package collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ArrayDequeSample {

    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

        dq.addAll(Arrays.asList("Ajay", "Holgun", "Traci", "Borting"));

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        for(String s: dq){
            System.out.println(s);
        }

    }
}
