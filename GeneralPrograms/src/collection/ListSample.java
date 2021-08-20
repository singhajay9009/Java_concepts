package collection;

import java.util.*;

public class ListSample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ajhsda", "dfsdfhj", "cfgdjs"));


        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Ajhsda", "dfsdfhj", "cfgdjs"));

        Iterator<String> iterator = linkedList.descendingIterator();


    }
}
