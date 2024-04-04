package lesson10.animal;

public abstract class EarthAnimal extends Animal {

    public EarthAnimal(String name, int age) {
//        super();
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eating food");
    }

    public abstract void run();

}
