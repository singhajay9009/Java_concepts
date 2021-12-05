package optional;

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


    }
}
