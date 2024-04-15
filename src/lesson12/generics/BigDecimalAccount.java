package lesson12.generics;

import java.math.BigDecimal;

public class BigDecimalAccount {

    private String fullName;
    private BigDecimal balance;

    public BigDecimalAccount(String fullName, BigDecimal balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
