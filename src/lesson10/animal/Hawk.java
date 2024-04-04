package lesson10.animal;

public class Hawk extends FlyingAnimal {
    public Hawk(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("0-0");
    }

    @Override
    public void eat() {
        System.out.println("love pets");
    }

    @Override
    public void fly() {
        System.out.println("high as possible");
    }
}
