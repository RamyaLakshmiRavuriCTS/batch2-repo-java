/*Suzuki has Bike
 *Suzuki implements Bike interfaces
 * It also overrides default methods in Bike*/
public class Suzuki implements Bike {
    private int speed;

    public Suzuki(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

