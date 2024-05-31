package lesson23;

public class Consumer implements Runnable {

    public static final int AWAIT_TIME = 9000;

    private final Store store;
    private final int maxCount;
    private final long awaitTime;

    public Consumer(Store store, int maxCount) {
        this(store, maxCount, AWAIT_TIME);
    }

    public Consumer(Store store, int maxCount, long awaitTime) {
        this.store = store;
        this.maxCount = maxCount;
        this.awaitTime = awaitTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < maxCount; i++) {
            store.decreaseCount();
            ThreadUtils.sleep(awaitTime);
        }
    }
}
