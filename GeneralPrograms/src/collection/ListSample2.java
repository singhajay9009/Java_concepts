package collection;

import java.util.*;
import java.util.stream.Collectors;

public class ListSample2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Orange", "Apple", "Mango");

        Iterator<String> iterator = list.listIterator();
        iterator.forEachRemaining(System.out::println);

        List<String> unmodifiableList = Collections.unmodifiableList(list);

        List<String> synchronizedList = Collections.synchronizedList(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("================");

        list.forEach(System.out::println);

        System.out.println("================");

        list.forEach(e -> System.out.println(e.toLowerCase()));

        List<String> lowerCaseItems = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("================");
        list.spliterator().forEachRemaining(e -> System.out.println(e.toLowerCase()));

    }
}
