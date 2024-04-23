package lesson15;

public interface Stackable<T extends Comparable<T>>  {

    void push(T o);
    T pop();

    /**
     *  complexity = O(1)
     */
    T max();
}
