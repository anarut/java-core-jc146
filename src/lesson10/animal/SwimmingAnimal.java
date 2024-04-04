package lesson10.animal;

public abstract class SwimmingAnimal extends Animal implements Swimmable {

    private boolean hasScale;

    public SwimmingAnimal(String name, int age, boolean hasScale) {
        super(name, age);
        this.hasScale = hasScale;
    }

    public abstract void swim();

    @Override
    public void say() {
        System.out.println("bool bool");
    }

    public boolean isHasScale() {
        return hasScale;
    }
}
