package lesson10.animal;

public class Cow extends Pet {

    public Cow(String name, int age, boolean liveAtHome) {
        super(name, age, liveAtHome);
    }

    @Override
    public void say() {
        System.out.println("muuu");
    }

    @Override
    public void run() {
        System.out.println("lazy");
    }
}
