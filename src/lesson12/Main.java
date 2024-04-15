package lesson12;

public class Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC(new ClassB(6));
        classC.methodA();
        classC.anotherMethodA();
        classC.methodB();
        classC.anotherMethodB();


    }
}
