public class InterfaceExample {

    public static void main(String[] args) {

       Bike bike= new RoyalEnfield(160);
        bike.checkSpeed(((RoyalEnfield) bike).getSpeed());
        bike = new HarleyDavidson(80);
        bike.checkSpeed(((HarleyDavidson) bike).getSpeed());
    }
}
