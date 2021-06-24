/*Bike is an interface
 * MAX_SPEED is a final static constant*/

import java.util.Collections;


public interface Bike {
    final int MAX_SPEED = 90;

    /*checkSpeed is a default method
     *It checks the speed of bike and display a warning message*/
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
