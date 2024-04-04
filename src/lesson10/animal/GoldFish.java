package lesson10.animal;

public class GoldFish extends SwimmingAnimal {
    public GoldFish(String name, int age, boolean hasScale) {
        super(name, age, hasScale);
    }

    @Override
    public void eat() {
        System.out.println("grass");
    }

    @Override
    public void swim() {
        System.out.println("like doing it");
    }
}
