package lesson22;

public class TreadMain2 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
          for (int i = 0; i < 10; i++) {
              System.out.println(Thread.currentThread().getName() + ":" + i);
              try {
                  Thread.sleep(20);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };


        Thread thread = new Thread(runnable);
        System.out.println(thread.getState());
        thread.setDaemon(true);

        thread.start();
        System.out.println(thread.getState());
        thread.run();


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread.getState());

        Thread thread1 = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":Hello World");
            }
        };
        thread1.start();

        boolean interrupted = thread1.isInterrupted();
    }
}
