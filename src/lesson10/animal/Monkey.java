package lesson10.animal;

public class Monkey extends WildAnimal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("y y y y y a a a a a y y");
    }

    @Override
    public void run() {
        System.out.println("my speed 5 km/h");
    }

    @Override
    public void eat() {
        System.out.println("I like bananas");
    }
}
