package lesson14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {
        Set<String> objects = new HashSet<>();
        objects.add("1");
        objects.add("2");
        objects.add("11");
        System.out.println(objects);
        objects.add("14");
        objects.add("3");
        objects.add("1");
        System.out.println(objects);

        Set<String> strings = new LinkedHashSet<>();
        strings.add("c");
        strings.add("b");
        strings.add("a");
        System.out.println(strings);
        strings.add("d");
        strings.add("e");
        strings.add("a");
        strings.add("d");
        System.out.println(strings);

        Set<String> number = new TreeSet<>();
        number.add("1");
        number.add("abcd");
        number.add("2");
        number.add("11");
        number.add("aa");
        number.add("14");
        number.add("3");
        number.add("1");
        number.add("abc");
        System.out.println(number);

        Set<Integer> s = new TreeSet<>();
        s.add(11);
        s.add(7);
        s.add(15);
        s.add(5);
        System.out.println(s);
    }
}
