import java.util.Scanner;
class InterThread {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter deposit money");
        double money=sc.nextDouble();
        System.out.println("Enter withdraw amount");
        double amount=sc.nextDouble();

        final Customer customer = new Customer();
        new Thread() {
            public void run() {
                customer.withdraw(amount);
            }
        }.start();
        new Thread() {
            public void run() {
                customer.deposit(money);
            }
        }.start();
    }
}