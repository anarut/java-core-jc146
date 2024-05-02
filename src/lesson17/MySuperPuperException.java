package lesson17;

import java.util.Random;

public class MySuperPuperException extends Exception {

    public MySuperPuperException() {
        super();
    }

    public MySuperPuperException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            todo();
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println("try again");
        }
    }


    public static void todo() throws Exception {
        ///
        if (new Random().nextBoolean()) {
            throw new MySuperPuperException("true is not good!");
        }
        //
    }
}
