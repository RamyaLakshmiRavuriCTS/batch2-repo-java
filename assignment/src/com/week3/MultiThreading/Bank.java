package MultiThreading;


public class Bank implements Runnable {
    private Account account = new Account();
    private int value = 100;

    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread t1 = new Thread(bank);
        Thread t2 = new Thread(bank);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            account.deposit(value);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.withdraw(value);
        }

    }
}
