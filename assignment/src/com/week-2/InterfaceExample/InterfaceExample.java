/*Main class */
public class InterfaceExample {
    /*Main method*/
    public static void main(String[] args) {
        Bike royal = new RoyalEnfield(160);
        royal.checkSpeed(((RoyalEnfield) royal).getSpeed());

        Bike duke = new Duke(80);
        duke.checkSpeed(((Duke) duke).getSpeed());

        Bike hero = new Hero(-60);
        hero.checkSpeed(((Hero) hero).getSpeed());
    }
}
