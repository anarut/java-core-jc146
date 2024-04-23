package lesson15;

public class StackMain {

    public static void main(String[] args) {
        Stackable<Integer> myStackable = new MyStack();
        myStackable.push(1);
        myStackable.push(2);
        myStackable.push(3);
        myStackable.push(4);
        myStackable.push(5);
        myStackable.pop();
        Integer max = myStackable.max();
        System.out.println(max);
    }
}
