package collection;

import java.util.*;

/**
 * Priority queue internally sort the elements in the natural sorting order.
 * methods:-
 * boolean add (E e) // adds the element at the head
 * boolean offer(E e)  // ads the element at the head
 * E peek()  // returns head   --> returns null if queue is empty
 * E element()  //  returns head --> throws NoSuchElementException if queue is empty
 * E poll()  // removes and returns head   --> returns null if queue is empty
 * E remove()  // removes and returns head --> throws NoSuchElementException if queue is empty
 */

public class QueueDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Vijay", "Viktor", "James", "Erik"));

        Queue<String> queue = new PriorityQueue<>(list);
        System.out.println(queue);
//        for(String s : queue){
//            System.out.println("Name is: " + s);
//        }

     //   queue.removeAll(list);

        // Adding all items from collection
      //  queue.addAll(list);

        queue.add("James");
        queue.add("Yanki");
        queue.add("Ana");
     //   queue.poll()
        System.out.println(queue.element());

        System.out.println(queue.peek());

   //    System.out.println(queue.offer());

    }
}
