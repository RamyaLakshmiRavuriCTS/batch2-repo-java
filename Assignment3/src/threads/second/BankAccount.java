package src.threads.second;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        this.balance += amount;
        System.out.println("Depositing " + amount + ", new balance is " + this.balance);
    }

    public synchronized void withdrawl(double amount) {
        this.balance -= amount;
        System.out.println("Withdrawing " + amount + ", new balance is " + this.balance);
    }
}
