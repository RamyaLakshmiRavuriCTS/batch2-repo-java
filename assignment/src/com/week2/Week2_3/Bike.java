public interface Bike {

    static int speedLimit = 90;

    public default void getSpeedLimit() {
        System.out.println("The maximum speed limit is " + speedLimit + "kmph");
    }

    public void getCompany();
}
