package lesson06;

public class Main2 {
    public static void main(String[] args) {
        int [] arr = {1, 4, 27, 16, 20};
        boolean result = true;
        for (int i = 0; i < arr.length - 1 && result; i++) {
            result = arr[i] < arr[i + 1];
//            if (arr[i] < arr[i + 1]) {
//                System.out.println("true");
//            } else {
//                System.out.println("false");
//            }
        }
        System.out.println(result);
    }
}
