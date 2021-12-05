package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SampleClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4));

        Consumer con = (Object text) -> System.out.print(text);
        con.accept("sdasd");

        list.add(2);
    }
}
