/*Duke has a Bike
 * Duke implemented Bike interfaces
 * Duke can implement unimplemented methods in bike and also override default methods in Bike*/
public class Duke implements Bike {
    private int speed;

    public Duke(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
