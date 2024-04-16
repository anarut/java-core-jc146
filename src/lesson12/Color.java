package lesson12;

public enum Color {

    BLACK,
    WHITE,
    RED,
    BLUE,
    YELLOW,
    GREEN;
}

class Car {

    private Color color;

    public Car(Color color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car car = new Car(Color.BLACK);
    }
}
