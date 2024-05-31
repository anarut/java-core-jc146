package lesson23;

public class Store {

    private volatile int count;
    private int maxCount;

    public Store(int maxCount) {
        this(0, maxCount);
    }

    public Store(int count, int maxCount) {
        this.count = count;
        this.maxCount = maxCount;
    }

    public synchronized void increaseCount() {
        while (count >= maxCount) {
            ThreadUtils.wait(this);
        }
        count++;
        ThreadUtils.printInfo("Producer", count);
        notifyAll();
    }

    public synchronized void decreaseCount() {
        while (count <= 0) {
            ThreadUtils.wait(this);
        }
        count--;
        ThreadUtils.printInfo("Consumer", count);
        notifyAll();
    }
}
