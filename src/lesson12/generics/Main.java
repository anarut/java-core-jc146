package lesson12.generics;

import lesson12.ClassA;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Account petrovII = new Account("Petrov I I", 33.0);
        Account belovAM = new Account("Belov A M", 222);

        int a = 5;

        petrovII.setBalance(100);

        Account[] accounts = {petrovII, belovAM};

        IntAccount ivanovII = new IntAccount("Ivanov I I", 100);

        var bigDecimalAccount = new BigDecimalAccount("Rembo IV", new BigDecimal("3333.5524763"));

        GenericAccount<Integer, BigDecimal> genericAccount1 = new GenericAccount<>("Rembo IV", 66);
//        GenericAccount<String> genericAccount2 = new GenericAccount<>("Rembo IV", "6masjhkasjhk6");
        GenericAccount<Double, Byte> genericAccount3 = new GenericAccount<>("Rembo IV", 66.3);
//        GenericAccount<ClassA> genericAccount4 = new GenericAccount<>("Rembo IV", new ClassA());
//        GenericAccount<Main> genericAccount5 = new GenericAccount<>("Rembo IV", new Main());
        GenericAccount<BigDecimal, Short> genericAccount6 = new GenericAccount<>("Rembo IV", BigDecimal.TWO);
        Integer balance = (Integer) genericAccount1.getBalance();

        Object object = new BigDecimal("213.12312");

        BigDecimal bd = (BigDecimal) object;
//        BigDecimal bd2 = object;



    }
}
