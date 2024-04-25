package lesson16;

public class ExceptionMain {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            int i = 0;
            System.out.println(i);

            String gg = null;

//            int length = gg.length();
//            i = a / b;

            int[] ints = new int[5];
            int anInt = ints[15];

            System.out.println(i);

            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("учись делить на 0");
//            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ты что считать не умеешь размер массива???");
        } catch (RuntimeException e) {
            System.out.println("yps");
        } catch (Exception e) {
            System.out.println("yps");
        }

        System.out.println("end");


    }

    //0 - n
    public static int sumNumber(int n) {
        if (n < 0) {
//            RuntimeException exception = new RuntimeException("Negative number is not allowed");
//            throw exception;

            throw new RuntimeException("Negative number is not allowed");
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }

        return sum;
    }
}
