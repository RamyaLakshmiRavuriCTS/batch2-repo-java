/*RoyalEnfield has a Bike
 * RoyalEnfield implemented Bike interfaces
 * RoyalEnfield can implement unimplemented methods in bike and also override default methods in Bike*/
public class RoyalEnfield implements Bike {
    private int speed;

    public RoyalEnfield(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
