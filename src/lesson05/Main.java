package lesson05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 0;
        int a = 200;
        while (x < a) {
//            System.out.println(x);
            x += 7;
//            if (x % 7 == 0) {
            System.out.print(x + " ");
//            }
        }


        System.out.println();


        a = 3;
        for (int i = 0; i < 15; i++) {
            System.out.print(a + " ");
            a *= 3;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite n:");
        int n = scanner.nextInt();
        System.out.println("Vvedite m:");
        int m = scanner.nextInt();
        System.out.println();
        //int n = 5;
        //int m = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("Vvedite k");
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
