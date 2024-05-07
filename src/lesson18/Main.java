package lesson18;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            for (int i = 0; i < 100; i++) {
                bos.write((i + "\n").getBytes());
                if (i == 50) {
                    bos.flush();
                }
            }
            bos.write("end".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
