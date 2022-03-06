package string;

import java.util.Arrays;

public class Stringdemo {

    public static void main(String[] args) {

        String str = "Javaav";

        String str1 = str.substring(1,3);  // 1 inclusive, 3 exclusive

        String str2 = str.replace("a", "z");

        System.out.println(str2);

        String str3 = str.replace("av", "tz");
        System.out.println(str3);

        String [] strArr = str.split("v");
        Arrays.stream(strArr).forEach(System.out::println);

        System.out.println(str.indexOf('a'));

        System.out.println(str.indexOf("vaav"));


    }
}
