package lesson16;

import lesson10.animal.Animal;
import lesson10.animal.Flyable;
import lesson15.Point;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(10);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(3);

        Iterator<Integer> iterator = arrayList.iterator();

        Collection<Integer> linkedList = new LinkedList<>();
        Iterator<Integer> iterator3 = linkedList.iterator();

        Collection<Integer> hashSet = new HashSet<>();
        Iterator<Integer> iterator1 = hashSet.iterator();

        Collection<Integer> treeSet = new TreeSet<>();
        Iterator<Integer> iterator2 = treeSet.iterator();

        for (Integer integer : treeSet) { }

        while (iterator.hasNext()) {
            Integer next = iterator.next();

            System.out.println(next);
//            iterator.remove();
        }
//        boolean b = iterator.hasNext();
//        Integer next = iterator.next();


        ClassMain classMain = new ClassMain();


        ClassMain.InnerStaticClass innerStaticClass = new lesson16.ClassMain.InnerStaticClass();

        ClassMain.InnerSimpleClass innerSimpleClass = classMain.new InnerSimpleClass();

        {
            class Pointer {
                int x, y;
            }

            Pointer pointer = new Pointer();
        }

//        Pointer pointer = new Pointer();

        int i;

        for (i = 0; i < 5; i++) {
            int i1 = i;
        }

        int i1 = i;


        Point point = new Point(4, 5);

        Object point2 = new Point(4, 5) {
            @Override
            public int hashCode() {
                return 0;
            }
        };


        Animal animal = new Animal("Kolly", 12) {

            @Override
            public void say() {
                System.out.println("whhatt?");
            }

            @Override
            public void eat() {
                System.out.println("am am am am am");
            }
        };


        Flyable flyable = new Flyable() {

            @Override
            public void fly() {
                System.out.println("I believe I can fly");
            }
        };

        Flyable flyable2 = () -> System.out.println("I believe I can fly");
        Flyable flyable3 = System.out::println;
    }
}
