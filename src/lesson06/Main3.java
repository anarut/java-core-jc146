package lesson06;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int[][] c =
                {
                        {1, 2, 3},
                        {1, 2, 3, 5, 6, 7},
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


        int[][] b = new int[5][];
        b[0] = new int[10];
        b[1] = new int[]{1, 2, 3};
        b[2] = new int[]{1, 2, 3};
        b[3] = new int[]{1, 2, 3};
        b[4] = new int[]{1, 2, 3};

        int[][][] d = new int[2][][];
        d[0] = a;
        d[1] = b;

        int i1 = d[0][0][0];


        int n = 1000;

        // int   4 byte?
        int[] ints2 = new int[n]; // 4 000 byte ~  4kb
        int[][] ints3 = new int[n][n]; // 4000kb ~ 4mb
        int[][][] ints4 = new int[n][n][n]; // 4000 mb ~ 4gb
        int[][][][] ints5 = new int[n][n][n][n]; // 4000 gb ~ 4tb
        byte[][][][] ints6 = new byte[n][n][n][n]; // 1tb


        Arrays.asList(ints2);

        Arrays.fill(ints2, 555);

//        for (int k = 0, len = ints2.length; k < len; k++)
//            ints2[k] = 555;

//        int i2 = ints2[2];
//        int i3 = ints2[3];

        ints2[3] = ints2[2];

        int temp = ints2[3];
        ints2[3] = ints2[2];
        ints2[2] = temp;
    }
}
