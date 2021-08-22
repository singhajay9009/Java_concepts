package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {

    public static void main(String[] args) {

        Stream<String> st1 = Stream.empty();

        st1.forEach(System.out::println);

        Collection<String> collection = Arrays.asList("a", "b", "c", "d");

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4));
        Collection<Integer> collection1 = set;

        //Creating a Stream of Array of Strings
        Stream<String> st2 = Stream.of("we", "34", "abc");

        Stream<String> st3 = Arrays.stream(new String[]{"2", "wter", "tangosncld"});

        Optional<String> str = st2.filter(e -> e.contains("we")).findAny();
        System.out.println(str.get());

//        Optional<String> str2 = st2.filter(e -> e.contains("we")).findAny();
//        System.out.println(str2.get());

        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(4);
        streamGenerated.forEach(System.out::println);
    }

    // Creating a Stream from a List
    public Stream<String> streamOf(List<String> list){
        return list == null || list.isEmpty()? Stream.empty():list.stream();
    }
}
