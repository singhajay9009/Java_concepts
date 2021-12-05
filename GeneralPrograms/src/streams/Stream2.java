package streams;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args) {
        Stream<String> st1 = Stream.of("IN", "DE", "NL", "USA", "DEUTSCHLAND", "DEUSCHE");

        List<String> c =  st1.filter(e -> e.contains("DE"))
                .map(String::toLowerCase)
                .sorted().collect(Collectors.toList());

        c.forEach(System.out::println);
    }
}
