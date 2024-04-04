package lesson09;

public class Car { //extends Object {

    {
        color = "blue";
    }

    static {
        type = "SUV";
    }

    String color = "black";
    String brand;
    Integer year;

    boolean hasThisFunctionInCar = true;
    boolean blocked = true; // hands

    static String type = "sedan";

    public Car(String color, String brand, Integer year) {
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    public Car(String color) {
        this.color = color;
    }
    public Car(Integer year) {
        this.year = year;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car { color = '" + color + "', brand = '" + brand + "', year = " + year + " }";
    }


    public void move(double longitude, double latitude) {
        //tododasldjaklsjdklas
    }

    public void turnOnRadio() {

    }

    public String upSmth() {
        if (hasThisFunctionInCar) {
            if (blocked) {
                return "ne mogy";
            } else {
                return "gotovo";
            }
        } else {
            return "nyzhno sdelat vrychnyu";
        }
    }
}
