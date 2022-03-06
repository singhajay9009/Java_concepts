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

        //Arrays.asList() creates a list which can not be resized,
        // however items can be replaced at existing index, but we cant

        List<Integer> list5 = Arrays.asList(1,2,4);
        list5.set(1,6);
    //    list5.add(1,6);   // add operation is not allowed in Arrays.asList()
    //    list5.remove((Integer)4);  // not allowed in Arrays.asList()

        System.out.println(list5.get(1));
        System.out.println(list5);

        List<Integer> list6 = List.of(2,3,4);
       // list6.add(6);

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(list7);  // 1,2,3,4
        list7.add(5);
        list7.remove((Integer)4);

        System.out.println(list7);  // 1,2,3,5


        List<String> list8 = Arrays.asList("Adam", "anna", "Joe");

       boolean b =  list8.containsAll(Arrays.asList("Adam", "try"));
        System.out.println((b)); // false


       boolean c = list8.toString().matches(".*\\b(abc|Joe)\\b.*");
        System.out.println(c); // true  --> one liner solution



    }
}
