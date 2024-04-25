package lesson16;

public class ExMain {

    public static void main(String[] args) {
        int i = ExceptionMain.sumNumber(6);
        System.out.println(i);
        int i1 = ExceptionMain.sumNumber(2);
        System.out.println(i1);

        try {
            int a = a(-6);
            System.out.println(a);
        } catch (RuntimeException e) {
//            e.printStackTrace();
            System.out.println("что-то пошло не так: " + e.getMessage());
        }


    }


    public static int a(int n) {
        return b(n);
    }

    public static int b(int n) {
        return c(n);
    }

    public static int c(int n) {
        return ExceptionMain.sumNumber(n);
    }
}
