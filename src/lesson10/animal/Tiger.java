package lesson10.animal;

public class Tiger extends WildAnimal {

    public Tiger(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("Like fresh Meat");
    }

    @Override
    public void say() {
        System.out.println("rrrr");
    }

    @Override
    public void run() {
        System.out.println(" run at 32 km/h");
    }
}
