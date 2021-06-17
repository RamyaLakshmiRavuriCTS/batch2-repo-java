import java.util.Collections;

public interface Bike {
    final int MAX_SPEED = 90;

    public default void checkSpeed(int speed) {
        if (speed < 0) {
            System.out.println("None");
        } else {
            if (speed >= MAX_SPEED) {
                System.out.println("Danger:You have crossed the max limit");
            } else {
                System.out.println("Your current speed is " + speed);
            }
        }
    }
}
