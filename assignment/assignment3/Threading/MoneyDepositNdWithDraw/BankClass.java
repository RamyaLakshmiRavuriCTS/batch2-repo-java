

public class BankClass implements Runnable {

    private double value=100 ;
    private AccountClass account= new AccountClass();

    public static void main(String[] args) {
        BankClass bank = new BankClass();
        Thread t1 = new Thread(bank);
        t1.setName("Account Holder");
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
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
