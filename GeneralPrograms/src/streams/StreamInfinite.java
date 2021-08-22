package streams;

import java.util.stream.Stream;

public class StreamInfinite {

    /*
    Here, we pass Math::random() as a Supplier,
    which returns the next random number.
    With infinite streams, we need to provide a condition
    to eventually terminate the processing.
    One common way of doing this is using limit().
    In above example, we limit the stream to 5 random numbers
    and print them as they get generated.

    Please note that the Supplier passed to generate()
    could be stateful and such stream may not produce the same result
    when used in parallel.

     */

    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
