package lesson17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        int[] ints = new int[5];
//        int i = 0;
//        ints[10] = 1; //непроверяемая


        try {
            FileInputStream fis = new FileInputStream("text.txt"); //проверяемая
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("s");
        }

    }
}
