public class AccountClass {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public synchronized void withdraw(double value){
        this.balance=this.balance-value;
        System.out.println(Thread.currentThread().getName()+" is withdrawing ");
        System.out.println("withdraw "+value+" ,new balance "+balance);
    }

    public synchronized void deposit(double value){
        this.balance=this.balance+value;
        System.out.println(Thread.currentThread().getName()+" is depositing ");
        System.out.println("deposit "+value+" ,new balance "+balance);
    }

}
