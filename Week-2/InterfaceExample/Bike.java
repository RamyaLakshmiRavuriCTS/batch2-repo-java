public interface Bike {
        int MAX_SPEED = 90;
        default void checkSpeed(int speed) {
            if (speed < 0) {
                System.out.println("Invalid input");
            } else {
                if (speed >= MAX_SPEED) {
                    System.out.println("You are crossed the maximum speed");
                } else {
                    System.out.println("Your speed is " + speed+" KM/H");
                }
            }
        }
    }


