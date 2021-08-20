package collection;

import java.util.Set;
import java.util.stream.Stream;

public class SetSample {

    public static void main(String[] args) {
        Set<String> set = Set.<String>of("Addd", "ddada");
//        set.add("atvh");
//        set.add("htueu");
//        set.add("uou");
//        set.add("cvge");

        Stream<String> stream = set.stream();
        stream.forEach(e -> System.out.println(e));
    }
}
