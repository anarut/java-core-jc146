package lesson15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PointTreeSet {

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 3);
        Point point3 = new Point(2, 4);
        Point point4 = new Point(5, 6);
        Point point5 = new Point(1, 3);
        Point point6 = new Point(-1, 3);
        Point point7 = new Point(2, 2);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(point4);
        System.out.println(point5);
        System.out.println(point6);
        System.out.println(point7);

        Set<Point> pointSet = new TreeSet<>(new PointComparator());
        pointSet.add(point1);
        pointSet.add(point2);
        pointSet.add(point3);
        pointSet.add(point4);
        pointSet.add(point5);
        pointSet.add(point6);
        pointSet.add(point7);
        System.out.println(pointSet);

    }
}
