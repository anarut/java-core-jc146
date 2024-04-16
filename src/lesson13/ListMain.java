package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListMain {

    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(new ArrayList<String>(List.of("Mexico")));
        lists.add(new LinkedList<String>(List.of("Australia", "Brazil")));
        lists.add(new Vector<String>(List.of("Mexico")));
        lists.add(new Vector<String>(List.of("Mexico")));


        for (List<String> list : lists) {
            workWithList(list);
        }

//        workWithList(new ArrayList<>(List.of("Mexico")));
//        workWithList(new LinkedList<>(List.of("Australia", "Brazil")));
//        workWithList(new Vector<>(List.of("Mexico")));
//        workWithList(new Vector<>(List.of("Mexico")));

        System.out.println("adjasasjdklasjkldjaskld".substring(0, 2));
        System.out.println("adjasasjdklasjkldjaskld".substring(2, 5));
        System.out.println("adjasasjdklasjkldjaskld".substring(5, 10));
        System.out.println("adjasasjdklasjkldjaskld".substring(10, 17));
        System.out.println("adjasasjdklasjkldjaskld".substring(17, "adjasasjdklasjkldjaskld".length()));

    }

    public static void workWithList(List<String> countries) {
        countries.add("Belarus");
        countries.add("Belgium");
        countries.add(1, "Germany");
        System.out.println();
        countries.add("India");
        countries.add(2, "United States");
        countries.add(3, "United Kingdom");
        System.out.println(countries);

        countries.add("Norway");
        countries.add("Finland");
        countries.add("Denmark");
        System.out.println(countries);
        System.out.println(countries.get(5));

        List<String> strings = countries.subList(2, 5);
        System.out.println(strings);

    }
}
