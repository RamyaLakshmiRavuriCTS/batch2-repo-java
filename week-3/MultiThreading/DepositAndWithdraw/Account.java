public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int value) {
        this.balance = this.balance - value;

        System.out.println(Thread.currentThread().getName() + " is withdrawing ");
        System.out.println("withdraw, " + value + " ,new balance " + balance);
    }

    public synchronized void deposit(int value) {
        this.balance = this.balance + value;

        System.out.println(Thread.currentThread().getName() + " is depositing ");
        System.out.println("deposit, " + value + " ,new balance " + balance);
    }
}