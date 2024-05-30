package lesson22;

public class TreadMain {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println();

        Thread.State state = thread.getState();
        String name = thread.getName();
        int priority = thread.getPriority();
        boolean daemon = thread.isDaemon();
//        thread.setDaemon(true);
        boolean alive = thread.isAlive();
        boolean interrupted = thread.isInterrupted();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ThreadGroup threadGroup = thread.getThreadGroup();
        threadGroup.getName();
    }
}
