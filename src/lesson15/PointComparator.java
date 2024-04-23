package lesson15;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        int result = Integer.compare(o1.getX(), o2.getX());
        if (result == 0) {
            return Integer.compare(o1.getY(), o2.getY());
        } else {
            return result;
        }
    }
}
