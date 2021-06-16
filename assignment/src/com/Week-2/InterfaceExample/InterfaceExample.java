public class InterfaceExample {

    public static void main(String[] args) {

       Bike bike= new RoyalEnfield();
        bike.Company();
        bike.SpeedLimit();
        bike = new HarleyDavidson();
        bike.Company();
        bike.SpeedLimit();
    }
}
