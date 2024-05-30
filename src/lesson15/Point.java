package lesson15;

import java.util.Objects;

public class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point o) {
        Point point1 = this;
        Point point2 = o;

        int value1 = point1.x * point1.x + point1.y * point1.y;
        int value2 = point2.x * point2.x + point2.y * point2.y;

        if (value1 == value2) {
            return 0;
        } else if (value1 > value2) {
            return 1;
        } else {
            return -1;
        }
    }
}
