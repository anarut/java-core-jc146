package lesson21;

import java.io.File;
import java.io.InputStream;

public class FileReader {

    public FileReader() {
    }

    public String readFile(String fileName) {
        return null;
    }

    public String readFile(File file) {
        return null;
    }

    public String readFile(InputStream stream) {
        return null;
    }


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String content1 = fileReader.readFile("file.txt");
        String content2 = fileReader.readFile(new File("file.txt"));
        System.out.println(content1);
    }
}
