package collection;

import java.util.*;

public class ListSample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ajhsda", "dfsdfhj", "cfgdjs"));


        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Ajhsda", "dfsdfhj", "cfgdjs"));

        Iterator<String> iterator = linkedList.descendingIterator();


        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(2, 3));


        List<Integer> list2 = Arrays.asList(2, 3);

        List<String> list3 = List.of("1", "a");

        List<String> list4 = new ArrayList<>();
        list.add(null);
        list.add("hyt");

        String[] strArr = list4.toArray(new String[list4.size()]);

        //Arrays.asList() creates a list which can not be resized.
        // However items can be added at existing index or removed from that
        List<Integer> list5 = Arrays.asList(1,2,4);
        list5.set(1,6);
        System.out.println(list5.get(1));

        List<Integer> list6 = List.of(2,3,4);
       // list6.add(6);


    }
}
