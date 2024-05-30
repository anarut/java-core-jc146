package lesson21;

public class KartonkaSolver {

    public KartonkaSolver() {
    }

    public boolean isCovered(int a, int b, int c) {
        return false;
    }


    public static void main(String[] args) {
        KartonkaSolver kartonkaSolver = new KartonkaSolver();
        boolean covered = kartonkaSolver.isCovered(2, 3, 4);
        boolean covered1 = kartonkaSolver.isCovered(4, 5, 6);

        System.out.println(covered ? "Yes" : "No");

    }
}
