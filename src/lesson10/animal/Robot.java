package lesson10.animal;

public class Robot implements Swimmable, Flyable {

    private String name;


    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println("roborun");
    }

    @Override
    public void swim() {
        System.out.println("roboswim");
    }

    public void fly() {
        System.out.println("robofly");
    }

    public void say() {
        System.out.println("robosay");
    }
}
