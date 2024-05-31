package lesson22;

public class SomeCount {

    static class Counter {
        int count = 0;

        public void increment() {
            count = count + 1;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                synchronized (counter) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + ": " + counter.getCount());
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };

        new Thread(runnable).start();
        Thread thread = new Thread(runnable);
        thread.start();
        new Thread(runnable).start();

        Thread.sleep(50);
        thread.interrupt();


        Thread.sleep(3000);
        System.out.println(counter.getCount());
    }
}
