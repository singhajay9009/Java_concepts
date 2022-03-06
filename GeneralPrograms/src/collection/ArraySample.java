package collection;

import designPatterns.Employee;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ArraySample {

    public static void main(String[] args) {

        int[] arrInt = {};
   //     System.out.println(arrInt.length);   // 0
      //  System.out.println(arrInt[0]);   //ArrayIndexOutOfBoundsException

        arrInt = null;
    //    System.out.println(arrInt.length);

     //  int[] arrInt2 = new int[0];

      //  System.out.println(arrInt2[0]);

        Object[] elements = new Object[4];
        elements[0]= 1;
        elements[1]= 2;
        elements[2]= 3;
        elements[3]= 4;
    //    elements[3]= 4;
        int i =0;
//        for(Object e : elements){
//            elements[i] = null;
//            i++;
//            System.out.println("size is : " + elements.length);
//            System.out.println("All array items: " + "\n");
//            for(Object o: elements){
//                System.out.println(o);
//            }
//        }

        Arrays.stream(elements).collect(Collectors.toSet());
        Arrays.stream(elements).distinct().collect(Collectors.toList());
        elements[2] = null;
        for(Object e: elements){
            System.out.println(e);
        }

        int[] numbers = new int[2];
        System.out.println(numbers[0]);

        Employee[] employees = new Employee[4];
        System.out.println("Print Employee");
        for(Employee employee: employees){
            System.out.println(employee);
        }
        System.out.println("~~~~~~~");
        new ArraySample().getEmployess();
    }

    public void getEmployess(){
        int i;
        Employee[] employees ;//= new Employee[2];
        Employee emp;
        System.out.println();
    }
}
