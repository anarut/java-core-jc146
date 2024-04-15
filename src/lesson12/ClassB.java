package lesson12;

public class ClassB {

    private int b;

    public ClassB(int b) {
        this.b = b;
    }

    public void methodB() {
        System.out.println("B" + b);
    }

    public void anotherMethodB() {
        System.out.println("b2" + b);
    }

    public void superMethodB() {
        System.out.println("super b" + b);
    }
}
