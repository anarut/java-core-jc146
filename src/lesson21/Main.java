package lesson21;

import lesson15.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    @FunctionalInterface
    public interface Transformable {
        int transform(String s);
    }

    @FunctionalInterface
    public interface Pointable {
        Point transform(int a, int b);
    }

    public static void main(String[] args) {
        Transformable t1 = s -> 5;

        Transformable t2 = s -> s.getBytes().length;

        Transformable t3 = s -> s.length();

        Transformable t4 = String::length;

        Transformable t5 = Integer::valueOf;

        Pointable p1 = (a, b) -> new Point(a, b);

        Pointable p2 = Point::new;

        List<String> objects = new ArrayList<>();
        objects.forEach(o -> System.out.println(o));
        objects.forEach(System.out::println);

        Function<String, Integer> f1 = s -> s.length();

        BiFunction<String, Integer, Boolean> f2 = (s, i) -> s.length() < i;

        Supplier<Integer> s = () -> new Random().nextInt(100);

        Consumer<String> c = System.out::println;


        byte b1 = 5;
        byte b2 = 5;

        int i = b1 + b2;
    }
}
