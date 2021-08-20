package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.addAll(Arrays.asList("Ajay", "David", "Jasmin", "Patrik"));

        set.add(null);
        for(String s : set){
            System.out.println(s);
        }

    }
}
