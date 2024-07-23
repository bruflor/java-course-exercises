package entities;

public class BankAccount {
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = holderName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String holder) {
        this.accountHolder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount - 5.00;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}
