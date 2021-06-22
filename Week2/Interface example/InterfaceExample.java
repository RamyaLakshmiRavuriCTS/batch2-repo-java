public class InterfaceExample {
    public static void main(String[] args) {
        Bike royal = new RoyalEnfield(160);
        royal.checkSpeed(((RoyalEnfield) royal).getSpeed());
        Bike hero = new Honda(-60);
        hero.checkSpeed(((Honda) hero).getSpeed());
        Bike Duke = new Duke(80);
        hero.checkSpeed(((Duke) Duke).getSpeed());

    }
}