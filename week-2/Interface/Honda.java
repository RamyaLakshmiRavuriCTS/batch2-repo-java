public class Honda implements Bike{
    int gear;
    String name;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Speed: "+speedLimit+" Gear: "+gear);
    }

    @Override
    public void move(String name) {
        System.out.println(name+" is moving with "+speedLimit+"KMPH speed");
    }
}
