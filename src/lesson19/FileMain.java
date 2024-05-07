package lesson19;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileMain {

    public static void main(String[] args) throws IOException {
        File file = new File("../../../projects/it-academy");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        File[] files = file.getCanonicalFile().listFiles();

//        String[] list = file.list();
        System.out.println();
        extracted(files, "");


    }

    private static void extracted(File[] files, String s) {
        for (File f : files) {

            System.out.println("%20s %30s %7s %15s".formatted(s, f.getName(), f.isHidden(), new Date(f.lastModified())));
            if (f.isDirectory()) {
                extracted(f.listFiles(), s + "-->");
            }
        }
    }
}
