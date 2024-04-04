package lesson10.animal;

public class Shark extends SwimmingAnimal {
    public Shark(String name, int age, boolean hasScale) {
        super(name, age, hasScale);
    }

    @Override
    public void eat() {
        System.out.println("like blood");
    }

    @Override
    public void swim() {
        System.out.println("always in action");
    }
}
