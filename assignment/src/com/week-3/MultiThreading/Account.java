package MultiThreading;

/*This Account class have two synchronized methods
 * withdraw method and deposit method
 * based on transaction balance will modify */
public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    /*Uses to withdraw the amount
     * subtraction amount from balance*/
    public synchronized void withdraw(int value) {
        this.balance = this.balance - value;

        System.out.println(Thread.currentThread().getName() + " is withdrawing ");
        System.out.println("withdraw, " + value + " ,new balance " + balance);
    }

    /*Uses to deposit the amount
     * add amount to balance*/
    public synchronized void deposit(int value) {
        this.balance = this.balance + value;

        System.out.println(Thread.currentThread().getName() + " is depositing ");
        System.out.println("deposit, " + value + " ,new balance " + balance);
    }
}
