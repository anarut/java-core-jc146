package lesson23;

public class Producer implements Runnable {

    public static final int AWAIT_TIME = 5000;

    private Store store;
    private int maxCount;
    private long awaitTime;

    public Producer(Store store, int maxCount) {
        this(store, maxCount, AWAIT_TIME);
    }

    public Producer(Store store, int maxCount, long awaitTime) {
        this.store = store;
        this.maxCount = maxCount;
        this.awaitTime = awaitTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < maxCount; i++) {
            store.increaseCount();
            ThreadUtils.sleep(awaitTime);
        }
    }
}
