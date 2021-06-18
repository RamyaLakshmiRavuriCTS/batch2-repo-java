public class RoyalEnfield implements Bike{
    int gear;
    String name;
    @Override
    public void changeGear(int newGear) {
        gear= newGear;
        System.out.println("Speed: "+getSpeedLimit()+" Gear: "+gear);
    }



    @Override
    public void move(String name) {
        System.out.println(name+" is moving with "+getSpeedLimit()+"KMPH speed");



    }



}