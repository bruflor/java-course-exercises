package entities;

public class BankAccount {
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.accountHolder = holderName;
        balance = 0;
    }

    public BankAccount(int accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = holderName;
        deposit(initialDeposit);
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
        this.balance -= amount + 5.00;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}
