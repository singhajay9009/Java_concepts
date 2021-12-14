package optional;

import java.util.Locale;
import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {

        String name = "Ajay";
        Optional<String> opt1 = Optional.of(name);
        opt1.ifPresent(System.out::println);

        String temp = null;
        /* will throw nullpointerexception ****/
    //    Optional<String> opt2 = Optional.of(name);

        String name1 = opt1.orElseThrow(NullPointerException::new);
        System.out.println("This is name1: " + name1);

        Optional<String> opt2 = Optional.ofNullable(name);


        String str2 = "java";
        Optional<String> opt = Optional.ofNullable(str2);
    //    System.out.println("This is empty string: " + opt.isEmpty());

        opt.ifPresent(s -> System.out.println(s.toUpperCase()));

        String str3 = Optional.ofNullable(str2).filter(s -> !s.isEmpty())
                .orElseThrow(IllegalArgumentException::new);

     //   String str3 = Optional.ofNullable(str2).orElseThrow(IllegalArgumentException::new);


        System.out.println("String value: " + str3);


    }
}
