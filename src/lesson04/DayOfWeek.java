package lesson04;

public class DayOfWeek {

    // 0 четверг
    // 1 пятница
    // 2 суббота
    // 3 воскресение
    // 4 понедельник
    // 5 вторник
    // 6 среда



    // 7 четврерг
    // 8 пятница
    // 9 суббота
    // 21 четверг
    // 70 четверг
    // 72 суббота
    // 113 % 7 -> [0; 6]
    public static void main(String[] args) {
        int n = -576378672;

        int d = n % 7; // [-6 ; 6]
        d = d + 7; // [1; 13]
        d = d % 7; // [0; 6];

        if (d == 0 ) {
            System.out.println("четверг");
        } else if (d == 1) {
            System.out.println("пятница");
        } else if (d == 2 ) {
            System.out.println("суббота");
        } else if (d == 3 ) {
            System.out.println("воскресение");
        } else if (d == 4 ) {
            System.out.println("понедельник");
        } else if (d == 5 ) {
            System.out.println("вторник");
        } else if (d == 6 ) {
            System.out.println("среда");
        }

        System.out.println("-----------");

        switch (n % 7) {
            case 0:
                System.out.println("четверг");
                break;
            case 1:
            case -6:
                System.out.println("пятница");
                break;
            case 2:
            case -5:
                System.out.println("суббота");
                break;
            case 3, -4:
                System.out.println("воскресение");
                break;
            case 4, -3:
                System.out.println("понедельник");
                break;
            case 5, -2:
                System.out.println("вторник");
                break;
            case 6, -1:
                System.out.println("среда");
                break;
        }

        long l = 5L;
 

    }
}
