package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @FunctionalInterface
    public interface Operation {
        int operate(int a, int b);

//        int operate(int a, int b, int c);
    }

    public static void main(String[] args) {
        List<Operation> operations = new ArrayList<>();

//        Operation sumOperation = new Operation() {
//            @Override
//            public int operate(int a, int b) {
//                return a + b;
//            }
//        };

//        Operation sumOperation1 = (a, b) -> {
//            System.out.println(a);
//            System.out.println(b);
//            return a + b;
//        };

//        Operation sumOperation = (a, b) -> a + b;

        Operation sumOperation = Integer::sum;

        operations.add(sumOperation);
        operations.add(new MultiplyOperation());

        for (Operation operation : operations) {
            System.out.println(operation.operate(5, 8));
            System.out.println(operation.operate(0, 1));
            System.out.println(operation.operate(10, 10));
            System.out.println();
        }

//        operations.forEach(System.out::println);
    }
}
