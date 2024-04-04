package lesson10.animal;

public class Human extends EarthAnimal {

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Hello traveler");
    }

    @Override
    public void run() {
        System.out.println("I can run 15 km/h");
    }
}
