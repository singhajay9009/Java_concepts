package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;

public class TreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new java.util.TreeMap<>();

        map.put(101, "Zack");
        map.put(97, "Anna");

        map.descendingMap();

        for(Map.Entry<Integer, String> entrySet: map.entrySet()){
            System.out.println(entrySet.getKey() + " === " + entrySet.getValue());
        }
    }
}
