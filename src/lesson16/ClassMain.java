package lesson16;

public class ClassMain {

    int a = 12;
    static int b = 15;

    public static class InnerStaticClass {
        int c = 3;

        public void todo() {
            System.out.println(b + c);
        }
    }

    public class InnerSimpleClass {
        int d = 1;

        public void todo() {
            System.out.println(d + a + b);
        }
    }


}

class InnerClass {

}
