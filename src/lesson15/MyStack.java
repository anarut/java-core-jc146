package lesson15;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack implements Stackable<Integer> {

    private Deque<Integer> queue = new LinkedList<>();

    @Override
    public void push(Integer o) {
        queue.push(o);
    }

    @Override
    public Integer pop() {
        return queue.pop();
    }

    @Override
    public Integer max() {
        return 0;
    }
}
