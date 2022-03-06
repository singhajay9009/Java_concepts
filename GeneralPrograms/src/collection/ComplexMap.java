package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ComplexMap {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();

        map.put(new Student(1, "Adam"), "First");
        map.put(new Student(3, "Nadia"), "Second");

        Comparator<Student> studentComparator =
                Comparator
                        .comparing(Student::getName)
                        .thenComparing(Student::getId);

        //sort by Key then print
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(studentComparator))
                .forEach(System.out::println);


        //sort by key reverse order
       map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(studentComparator.reversed()))
                .forEach(System.out::println);

    }
}
