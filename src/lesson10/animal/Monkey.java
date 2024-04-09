package lesson10.animal;

import java.util.Random;

public class Monkey extends WildAnimal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    public Monkey(String name) {
        this(name, new Random().nextInt(3, 9));

        this.say();

        this.eat();
        super.eat();
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
