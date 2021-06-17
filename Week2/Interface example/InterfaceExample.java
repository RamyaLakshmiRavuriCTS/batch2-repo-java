public class InterfaceExample {

    public static void main(String[] args) {
        
        Bike bike= new RoyalEnfield();
        bike.Company();
        bike.SpeedLimit();
        bike = new Honda();
        bike.Company();
        bike.SpeedLimit();
    }
}