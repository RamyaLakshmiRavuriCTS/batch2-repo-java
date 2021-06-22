public class InterfaceExample {
    public static void main(String[] args) {
        Bike royal = new RoyalEnfield(190);
        royal.checkSpeed(((RoyalEnfield) royal).getSpeed());
        Bike hero = new Honda(-50);
        hero.checkSpeed(((Honda) hero).getSpeed());
        Bike activa = new Activa(80);
        activa.checkSpeed(((Activa) activa).getSpeed());
    }
}