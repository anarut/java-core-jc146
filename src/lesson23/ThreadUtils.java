package lesson23;

public class ThreadUtils {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printInfo(String action, int count) {
        System.out.println(Thread.currentThread().getName() + " " + action + ": " + count);
    }

    public static void wait(Object o) {
        try {
            o.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
