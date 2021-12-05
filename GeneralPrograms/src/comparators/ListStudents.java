package comparators;

import java.util.*;

public class ListStudents {

    public static void main(String[] args) {

        Student s1 = new Student("Rick", 21);
        Student s2 = new Student("Ela", 21);
        Student s3 = new Student("Rick", 25);

        List<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3));

        // Using lambda to define comparators ( single comparator )
        Comparator<Student> sCompName = (Student p1, Student p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Student> sCompAge = (Student p1, Student p2) -> Integer.compare(p1.getAge(), p2.getAge());


        //Lambda for multiple comparators
        Comparator<Student> stComp = Comparator
                .comparing((Student s) -> s.getName())
                .thenComparing(s -> s.getAge());

        // Comparator using method reference (best way for Comparators )
        Comparator<Student> studentComp = Comparator
                .comparing(Student::getName)
               .thenComparing(Student::getAge);


        //Comparator using Anonymous Class
        Comparator<Student> stuComp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) return i;
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(list, studentComp.reversed());

        list.forEach(System.out::println);
    }
}
