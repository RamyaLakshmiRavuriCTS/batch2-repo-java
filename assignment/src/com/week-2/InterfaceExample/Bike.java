/*Bike is interface .So,MAX_SPEED must be final static variable(constant)*/
public interface Bike {
    int MAX_SPEED = 90;

    /*checkSpeed is a default method which is introduced in java8
     * it is like instant method in class
     * it has method body and subclass can override the behaviour of default method also
     * it checks speed of the bike according to speed it display message */
    default void checkSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Invalid input");
        } else {
            if (speed >= MAX_SPEED) {
                System.out.println("You are crossed the maximum speed");
            } else {
                System.out.println("Your speed is " + speed + " KM/H");
            }
        }
    }
}
