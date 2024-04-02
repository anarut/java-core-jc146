package lesson08;

public class Modifier {
    public static final int a = 5;

    private static int b = 5;
    static int c = 5;
    protected static int d = 5;


    static int k1 = 5;
    int k2 = 55;

    public static void main(String[] args) {
        int a1 = a;
        int b1 = b;
        int c1 = c;
        int d1 = d;
//        a = 8;

        Modifier modifier = new Modifier();
        modifier.k2 = 100;
        modifier.k1 = 7;


        Modifier modifier1 = new Modifier();
        modifier1.k2 = 1000;
        modifier1.k1 = 77;


        Modifier modifier2 = new Modifier();
        modifier2.k2 = 10000;
        modifier2.k1 = 777;


        System.out.println(modifier.k2);
        System.out.println(modifier.k1);
        System.out.println(modifier1.k2);
        System.out.println(modifier1.k1);
        System.out.println(modifier2.k2);
        System.out.println(modifier2.k1);
    }
}
