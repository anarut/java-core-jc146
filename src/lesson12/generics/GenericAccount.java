package lesson12.generics;

import lesson10.animal.Animal;
import lesson10.animal.Flyable;

public class GenericAccount<K extends Number, T> {

    private String fullName;
    private K balance;
    private T annualPayment;

    public GenericAccount(String fullName, K balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    public <M extends Animal> M todo(M animal) {
        System.out.println(animal);
        return animal;
    }

    public void todo(GenericAccount<?, ?> acc) {
        System.out.println(acc);

        Number balance1 = acc.getBalance();
        String fullName1 = acc.getFullName();

    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public K getBalance() {
        return balance;
    }

    public void setBalance(K balance) {
        this.balance = balance;
    }
}
