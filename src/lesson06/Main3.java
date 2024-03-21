package lesson06;

import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int[][] b = new int[5][];
        int[][] c =
                {
                        {1, 2, 3},
                        {1, 2, 3, 5,6,7},
                        {0}
                };

        int[][] a = new int[5][6];
        System.out.println(a.length); // 5
        int[] ints = a[0];
        int anInt = ints[0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(i + "-" + j + "   ");
                a[i][j] = new Random().nextInt(10);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(i + "-" + j + "   ");

            }
            System.out.println();
        }

        int[] ints1 = a[0];
        int i = a[0][3];
    }
}
