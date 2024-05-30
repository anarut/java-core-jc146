package lesson22;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        List<Integer> collect = stream.collect(Collectors.toList());

        collect.forEach(System.out::println);

        stream
                .map(i -> i * 2)
                .forEach(System.out::println);

    }
}
