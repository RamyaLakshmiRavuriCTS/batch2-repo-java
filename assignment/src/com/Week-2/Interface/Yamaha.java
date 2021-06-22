/*Yamaha has Bike
 *Yamaha implements Bike interfaces
 * It also overrides default methods in Bike*/
public class Yamaha implements Bike {
    private int speed;

    public Yamaha(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

