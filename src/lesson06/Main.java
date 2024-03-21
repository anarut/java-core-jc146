package lesson06;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[20];
        int count = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-50,51);
            count += arr[i];
        }
        res = count / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= res) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(res);

    }
}
