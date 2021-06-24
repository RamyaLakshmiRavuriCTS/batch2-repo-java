/*Hero has a Bike
 * Hero implemented Bike interfaces
 * Hero can implement unimplemented methods in bike and also override default methods in Bike*/
public class Hero implements Bike {
    private int speed;

    public Hero(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
