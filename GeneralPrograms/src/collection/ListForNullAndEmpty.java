package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListForNullAndEmpty {

    public static void main(String[] args) {

        List<Object> list = Arrays.asList(null, 23, "Ajay", "", null);

        System.out.println(list.contains(null));  //true

        List<Object> list2 = Arrays.asList(23, "Ajay", "");
        System.out.println(list2.contains(""));   //true

        List<Object> list3 = Arrays.asList(new Object(),  23, "Ajay");
        boolean hasIllegalVal = list3.stream().anyMatch(s ->
                s == "" || s == null);
        System.out.println(hasIllegalVal);  // false


        List<Object> list4 = Arrays.asList("Ajay", "  ");
        boolean hasIllegalVal4 = list4.stream().anyMatch(s ->
                s == "" || s == null);
        System.out.println("Final: " + hasIllegalVal4);  //false

        List<String> list5 = Arrays.asList("u", "tr", null);
        boolean isIllegalString = list5.stream().anyMatch(s ->
                s == null || s.trim().equals("") );
        System.out.println("Illegal: " + isIllegalString);

    }
}
