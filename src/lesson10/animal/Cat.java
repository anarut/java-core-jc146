package lesson10.animal;

public class Cat extends Pet {

    public Cat(String name, int age, boolean liveAtHome) {
        super(name, age, liveAtHome);
    }

    @Override
    public void say() {
        System.out.println("meow");
    }

    @Override
    public void run() {
        System.out.println("only run for mouses");
    }
}
