package main;

import java.math.BigDecimal;

public class BankClient {
    public BigDecimal balance = new BigDecimal(5000);
    public BigDecimal withdraw(BigDecimal salary) {
        if (balance.compareTo(salary) > 0) {
            balance = balance.subtract(salary);
        }
        return balance;
    }
}