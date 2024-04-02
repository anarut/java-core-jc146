package lesson08;

public class Main {

    public static void main(String[] args) {
        String text = "a b c d ef";
        String[] arr = text.split(" ");
        String join = String.join(" - ", arr);
        System.out.println(join);


        StringBuilder builder = new StringBuilder();
        builder.append(66);
        builder.append(" ");
        builder.append(55.3);
        builder.append(" ");
        builder.append("hello");
        builder.append("12345678890903");
        System.out.println(builder.toString());

        builder.append("ggg")
                .append("sdsd")
                .reverse()
                .append(" Dog")
                .delete(3, 6);

        System.out.println(builder);

        System.out.println();
        int n = 1000000;

        long start = System.currentTimeMillis();
        String s = "";

        for (int i = 0; i < n; i++) {
            s = s + i;
        }

        System.out.println(s);
        long end = System.currentTimeMillis();
        String s1 = "Время: " + (end - start) + " милисекунд";
        System.out.println(s1);


        start = System.currentTimeMillis();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < n; i++) {
            b.append(i);
        }
        System.out.println(b);
        end = System.currentTimeMillis();
        System.out.println("Время: " + (end - start) + " милисекунд");

        System.out.println(s1);

        StringBuffer stringBuffer = new StringBuffer();

        String asdasd = "asd\"asd";

    }
}
