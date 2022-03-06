package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream6 {

    public static void main(String[] args) {
        Stream<Integer>  intStream = Stream.of(1,2,5,23,12,6);

//        int sum = intStream
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

//        long sum1 = intStream
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

//        double avg = intStream.mapToInt(i -> i).average().getAsDouble();
//        System.out.println(avg);

        System.out.println(intStream.findAny().get());

        System.out.println(intStream.anyMatch(i -> i%2 == 0));
    }
}
