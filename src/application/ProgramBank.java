package application;

import entities.BankAccount;

import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int account = sc.nextInt();
        System.out.println("Enter the account holder name: ");
        String holder = sc.next();
        System.out.println("Is there an initial deposit? (Y/N)");
        String doInitialDeposit = sc.next();
        double amount = 0.00;
        if (doInitialDeposit.equalsIgnoreCase("Y")) {
            System.out.println("Enter the amount to deposit: ");
            amount = sc.nextDouble();
        }

        BankAccount bankAccount = new BankAccount(account, holder, amount);
        System.out.println("Account data: Account " + bankAccount.getAccountNumber() + ", Holder " + bankAccount.getAccountHolder() + ", Balance " + bankAccount.getBalance());

        int operation;
        System.out.println("Do you want to do other operation? (1 - deposit / 2 - withdraw / 0 - exit)");
        operation = sc.nextInt();

        do{
            switch (operation) {
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = sc.nextDouble();
                    bankAccount.deposit(deposit);
                    System.out.println("Balance " + bankAccount.getBalance());
                    System.out.println("Do you want to do other operation? (1 - deposit / 2 - withdraw / 0 - exit)");
                    operation = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    bankAccount.withdraw(withdraw);
                    System.out.println("Balance " + bankAccount.getBalance());
                    System.out.println("Do you want to do other operation? (1 - deposit / 2 - withdraw / 0 - exit)");
                    operation = sc.nextInt();
                    break;
            }
        }while(operation != 0);
    }
}
