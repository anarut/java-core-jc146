package lesson12;

public class ClassC extends ClassA {

    private ClassB classB;
    private InnerClass innerClass;

    public ClassC(ClassB classB) {
        this.classB = classB;
    }

    public void methodB() {
        classB.methodB();
    }

    public void anotherMethodB() {
       classB.anotherMethodB();
       innerClass.anotherMethodB();
    }

    public class InnerClass extends ClassB {

        public InnerClass(int b) {
            super(b);
        }
    }
}
