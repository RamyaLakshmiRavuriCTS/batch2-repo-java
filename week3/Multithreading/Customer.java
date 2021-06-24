public class Customer {
    double amount;
    synchronized void withdraw(double amount){
        if(this.amount<amount){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        this.amount=this.amount-amount;
        System.out.println("withdrawing " +amount+ ";" +" new balance is "+this.amount);
    }
    synchronized void deposit(double money){
        this.amount=this.amount+money;
        System.out.println("depositing " +amount+ ";"+" new balance is "+this.amount);
        notify();
    }
}

