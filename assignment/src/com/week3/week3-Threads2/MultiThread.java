import java.util.Scanner;
//account class where thread acts
class Account {

    public double balance;

    void displayBalance() {

        System.out.println("Balance: " + balance);
    }

    synchronized void deposit(double amount) {

        balance = balance + amount;
        System.out.println(amount + " is deposited");
        displayBalance();
    }

    synchronized void withdraw(double amount) {

        balance = balance - amount;
        System.out.println(amount + " is withdrawn");
        displayBalance();
    }
}
//deposit class
class TransactionDeposit implements Runnable {

    double amount;
    Account accountX;

    TransactionDeposit(Account x, double amount) {

        accountX = x;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run() {

        accountX.deposit(amount);
    }
}
//withdraw class
class TransactionWithdraw implements Runnable {

    double amount;
    Account accountY;

    TransactionWithdraw(Account y, double amount) {

        accountY = y;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run() {

        accountY.withdraw(amount);
    }
}

//main class
class MultiThread {
    public static void main(String args[]) {
        Account krishna = new Account();
        Scanner sc = new Scanner(System.in);
        krishna.balance = sc.nextDouble();

        TransactionDeposit t1 = new TransactionDeposit(krishna, 500);
        TransactionWithdraw t2 = new TransactionWithdraw(krishna, 900);
    }
}