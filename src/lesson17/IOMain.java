package lesson17;

public class IOMain {

    public static void main(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        main2(1, 2, args);
        main2(1, 2, args[0], args[1], "wow");
        main2(1, 2, args[0], args[1], args[2], args[3], "wow");
        main2(1, 2);

    }


    public static void main2(int a1, int a2, String... args) {
        String[] args1 = args;
    }
}
