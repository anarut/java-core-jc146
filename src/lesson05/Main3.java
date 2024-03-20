package lesson05;

import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("max: " + max);

        int evenMax = arr[0];

        for (int i = 0; i < arr.length; i+=2) {
            if (evenMax < arr[i]) {
                evenMax = arr[i];
            }
        }

        System.out.println("even max: " + evenMax);
    }
}
