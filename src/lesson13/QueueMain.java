package lesson13;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        workWithQueue(new ArrayDeque<>());
        workWithQueue(new LinkedList<>());


        Queue<Integer> numbers = new ArrayDeque<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(11);
        numbers.offer(81);
        System.out.println(numbers);
    }


    public static void workWithQueue(Queue<String> cities) {
        cities.offer("Minsk");
        cities.offer("Berlin");
        cities.offer("London");
        System.out.println(cities);
        String peek = cities.peek();
        System.out.println(peek);
        System.out.println(cities);
        String poll = cities.poll();
        System.out.println(poll);
        System.out.println(cities);
        cities.offer("Barcelona");
        cities.offer("New York");
        cities.offer("New Orlean");
        System.out.println(cities);
    }
}
