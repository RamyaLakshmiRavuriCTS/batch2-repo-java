package src.threads.second;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Bank12345678", 0D);

        Thread thread1 = new Thread(() -> {

            account1.deposit(100D);
            account1.withdrawl(100D);

        });

        thread1.start();

        Thread thread2 = new Thread(() -> {

            account1.deposit(100D);
            account1.withdrawl(100D);

        });
        
        thread2.start();
    }
}
