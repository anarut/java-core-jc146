package lesson15;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Integer a1 = map.put("a", 1);
        Integer b1 = map.put("b", 2);
        Integer a2 = map.put("a", 3);
        Integer b2 = map.put("b", 4);

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(map);
    }
}
