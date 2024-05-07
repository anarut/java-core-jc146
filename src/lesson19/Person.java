package lesson19;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    public static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient String password;
    private String lastName;

    private static double PI = 3.14;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }


    public Person() {
    }

    public void todo() {
        System.out.println("hi" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, password);
    }
}
