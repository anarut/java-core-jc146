package lesson10.animal;

public abstract class Animal { // extends Object {

    private String name;
    private int age;

    public Animal(String name, int age) {
//        super();
        this.name = name;
        this.age = age;

    }

    public abstract void say();
    public abstract void eat();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
