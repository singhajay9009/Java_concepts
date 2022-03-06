package comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEmployee {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee(1, "Adam"),
                new Employee(3, "Jack"),
                new Employee(2, "Elena"));

        Collections.sort(employees, new Employee());

       employees.forEach(System.out::println);

      //  Collections.sort(employees)
        //  above will give error as Employee does not implement Comparable<Employee>
        //rather implements Comparator<Employee>
    }
}
