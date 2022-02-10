package collection;

import java.util.Objects;

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

        elements[2] = null;
        for(Object e: elements){
            System.out.println(e);
        }





    }
}
