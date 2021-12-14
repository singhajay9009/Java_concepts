package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapSample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Tango");
        map.put(2, "Delta");
        map.put(3, "Apache");
        map.put(4, "Yanki");
//
//        for(Map.Entry<Integer, String> entry: map.entrySet()){
//            System.out.println(entry.getKey() + "====" + entry.getValue());
//        }
//
//        for(int i: map.keySet()){
//            System.out.println(i + "===" + map.get(i));
//        }

        map.getOrDefault(5, "Police");



        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("-----------------");

        //not sorted
        for(int i: map.keySet()){
            System.out.println(i + "===" + map.get(i));
        }
    }
}


