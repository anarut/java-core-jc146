package lesson15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PointMapMain {

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 3);
        Point point3 = new Point(2, 4);
        Point point4 = new Point(5, 6);
        Point point5 = new Point(1, 3);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point2.hashCode());
        System.out.println(point3);
        System.out.println(point4);
        System.out.println(point5);
        System.out.println(point5.hashCode());
        System.out.println(point2.equals(point5));



        Map<Point, Integer> pointSet = new HashMap<>();
        pointSet.put(point1, 1);
        pointSet.put(point2, 1);
        pointSet.put(point3, 1);
        pointSet.put(point4, 1);
        pointSet.put(point5, 1);
        System.out.println(pointSet);

        point1.setX(10);
        point1.setY(10);
        System.out.println(point1);
        pointSet.put(point1, 1);
        System.out.println(pointSet);

        point1.setX(15);
        point1.setY(15);
        System.out.println(point1);
        pointSet.put(point1, 1);
        System.out.println(pointSet);

        point1.setX(0);
        point1.setY(0);
        System.out.println(point1);
        pointSet.put(point1, 1);
        System.out.println(pointSet);

        point1.setX(4);
        point1.setY(4);
        System.out.println(point1);
        pointSet.put(point1, 1);
        System.out.println(pointSet);
    }
}
