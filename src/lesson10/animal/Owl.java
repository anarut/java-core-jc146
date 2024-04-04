package lesson10.animal;

public class Owl extends FlyingAnimal {
    public Owl(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("yyy yyyy yy");
    }

    @Override
    public void eat() {
        System.out.println("mouses?");
    }

    @Override
    public void fly() {
        System.out.println("love sleep");
    }
}
