package lesson17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamMain {

    public static void main(String[] args) {
        writeSomeInfoIntoFile();
        System.out.println("WELCOME TO THE STREAM");
    }

    public static void writeSomeInfoIntoFile() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("super-contacts.txt");
            fos.write("Hi my dear students!".getBytes());
            fos.write("\n".getBytes());
            fos.write("This is a test message".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void writeSomeInfoIntoFile2() {
        try (FileOutputStream fos = new FileOutputStream("super-contacts.txt")) {
            fos.write("Hi my dear students!".getBytes());
            fos.write("\n".getBytes());
            fos.write("This is a test message".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
