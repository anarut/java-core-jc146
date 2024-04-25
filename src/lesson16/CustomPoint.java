package lesson16;

import lesson15.Point;

public class CustomPoint extends Point {

    public CustomPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
