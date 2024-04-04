package lesson10.animal;

public abstract class FlyingAnimal extends Animal implements Flyable {
    public FlyingAnimal(String name, int age) {
        super(name, age);
    }

    public abstract void fly();
}
