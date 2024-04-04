package lesson09;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red", "Audi", 2016);
        Car car2 = new Car("black", "Lexus", 2022);
        Car car3 = new Car("white", "Tesla", 2023);
        Car car4 = new Car("yellow", "Pegeout", 2020);

        System.out.println(car1.color);
        System.out.println(car2.color);
        System.out.println(car3.color);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3.toString());
        System.out.println(car4.toString());

        int i = car1.hashCode();

        Car car5 = new Car();
        lesson09.Car car6 = new lesson09.Car();
        lesson09.extra.Car car7 = new lesson09.extra.Car();
    }
}
