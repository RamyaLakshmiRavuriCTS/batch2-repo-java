package MultiThreading;

/*Account is a class having withdraw and deposit methods*/
public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    /*Withdraws the amount and
     *subtract the amount from balance*/
    public synchronized void withdraw(int value) {
        this.balance = this.balance - value;
        System.out.println("Withdrawing " + value + " ,new balance is " + balance);
    }

    /*Deposits the amount and
     *Add the amount to balance*/
    public synchronized void deposit(int value) {
        this.balance = this.balance + value;
        System.out.println("Depositing " + value + " ,new balance is " + balance);
    }
}
