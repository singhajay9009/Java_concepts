package collection;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Vijay", "Viktor", "James", "Erik"));

        Queue<String> queue = new PriorityQueue<>();


      //  queue.addAll(list);

//        for(String s : queue){
//            System.out.println("Name is: " + s);
//        }

     //   queue.removeAll(list);

        queue.add("James");
        queue.add("Yanki");
        queue.add("Ana");

        System.out.println(queue.element());

        System.out.println(queue.peek());

      //  System.out.println(queue.offer());

    }
}
