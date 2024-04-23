package lesson14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

    public static void main(String[] args) {
        String s = "ajdsfghuyasgdfyugayghfrhtyyftyhgfhufgweufgasduygfyuasgfewugfuyvfuysdgf";
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            Character key = charArray[i];
            if (map.containsKey(key)) {
                Integer prevValue = map.get(key);
                Integer newValue = prevValue + 1;
                map.put(key, newValue);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);


        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        Set<Character> characters = map.keySet();
        Collection<Integer> values = map.values();

        Integer max = 0;
        Character maxChar = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (max < value) {
                max = value;
                maxChar = key;
            }
        }
        System.out.println(max);
        System.out.println(maxChar);

        map.getOrDefault('c', 0);
        map.getOrDefault('k', 0);
        map.getOrDefault('l', 0);
    }
}
