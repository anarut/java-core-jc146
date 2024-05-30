package lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Spliterators;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Minsk", "Moscow", "Barcelona", "Oslo", "Paris");


//        Stream<String> stream1 = StreamSupport.stream(Spliterators.spliterator(cities, 0), false);

        Stream<String> stream = cities.stream();
        Stream<Integer> integerStream = stream.map(s -> s.length());


        Stream<char[]> stream1 = cities.stream().map(s -> s.toCharArray());

        IntStream intStream = cities.stream().flatMapToInt(s -> s.chars());

        cities.stream()
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(x -> (char) x)
//                .flatMap(s -> s.toLowerCase().chars().mapToObj(x -> (char) x))
                .distinct()
                .sorted()
                .forEach(System.out::println);




    }
}
