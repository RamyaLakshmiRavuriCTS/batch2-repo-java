/*KTM has Bike
 *KTM implements Bike interfaces
 * It also overrides default methods in Bike*/
public class KTM implements Bike {

    private int speed;

    public KTM(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
