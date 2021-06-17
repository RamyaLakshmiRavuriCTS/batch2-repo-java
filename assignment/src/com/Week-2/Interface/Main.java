public class Main {
    public static void main(String[] args) {
        Bike royal = new KTM(90);
        royal.checkSpeed(((KTM) royal).getSpeed());
        Bike yamaha = new Yamaha(60);
        yamaha.checkSpeed(((Yamaha) yamaha).getSpeed());
        Bike suzuki = new Suzuki(-80);
        suzuki.checkSpeed(((Suzuki) suzuki).getSpeed());
    }
}
