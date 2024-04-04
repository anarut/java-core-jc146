package lesson10;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.getName());
        System.out.println(phone.getPrice());
        phone.setName("test");
        phone.setPrice(100);
        phone.setPrice(-10);

        Date date = new Date(12, 6, 1999);
        System.out.println(date);

        Date nextDate = new Date(13, 6, 1999);
        System.out.println(nextDate);
    }
}
