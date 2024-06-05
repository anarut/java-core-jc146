package lesson23;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(10, false);

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " started");
            try {
                semaphore.acquire(30);
                System.out.println(Thread.currentThread().getName() + " acquired");
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " released/finished");
        };

        Runnable r2 = () -> {
            System.out.println(Thread.currentThread().getName() + " started");
            try {
                semaphore.acquire(30);
                semaphore.acquire(40);
                System.out.println(Thread.currentThread().getName() + " acquired");
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release(70);
            System.out.println(Thread.currentThread().getName() + " released/finished");
        };


        for (int i = 0; i < 5; i++) {
            new Thread(r).start();
        }
//        semaphore.acquire();
//        semaphore.release();
    }
}
