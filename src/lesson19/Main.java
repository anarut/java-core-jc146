package lesson19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static final String FILE = "contacts.txt";

    public static void main(String[] args) throws Exception {
        writeToFile();
        readFromFile();

        try (FileWriter fileWriter = new FileWriter("some-data.txt")){
            fileWriter.write("""
                    dasdasdasasdkthqewiuryiuewGUYKDafsUYDFASytdfatysfdytasfDYUASTdjytawKRUYTasyurtyuasgfdytasFDTYJA
                    SDTYASTDSRFAtysdfyasrdYTAsfdtfastydfasytDFTSADFYTAsfduyafsYTJDFASytdfasytdftyasfdy
                    tasfdjyAFSDTYJASFDTJASFdjfastjyfdtyasdftdasdas
                    """);
//            BufferedWriter bufferedWriter = new BufferedWriter();
        }
        
        
        try (FileReader fileReader = new FileReader("some-data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//            Stream<String> lines = bufferedReader.lines();
            String s = bufferedReader.readLine();
            while (s != null) {
                System.out.println(s);
                s = bufferedReader.readLine();
            }

        }
    }

    private static void readFromFile() throws Exception {
        try (FileInputStream fis = new FileInputStream(FILE);
        ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object object1 = ois.readObject();
            System.out.println(object1);
            Object object2 = ois.readObject();
            System.out.println(object2);
            Object object3 = ois.readObject();
            System.out.println(object3);
        }
    }

    private static void writeToFile() throws Exception {
        List<Person> people = List.of(
                new Person("Вася", 22, "1232146"),
                new Person("Петя", 11, "qwerty"),
                new Person("Коля", 33, "qwerty123")
        );
        try (FileOutputStream fos = new FileOutputStream(FILE);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            for (Person person : people) {
                oos.writeObject(person);
            }
        }
    }
}
