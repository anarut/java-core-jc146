package lesson23;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Store store = new Store(15);
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(new Producer(store, 10));
        tasks.add(new Producer(store, 15, 4000));
        tasks.add(new Producer(store, 20, 4500));
        tasks.add(new Producer(store, 10));

        tasks.add(new Consumer(store, 10));
        tasks.add(new Consumer(store, 10));
        tasks.add(new Consumer(store, 10));
        tasks.add(new Consumer(store, 10));
        tasks.add(new Consumer(store, 6, 4000));
        tasks.add(new Consumer(store, 9, 3000));

        tasks.forEach(r -> new Thread(r).start());

    }
}
