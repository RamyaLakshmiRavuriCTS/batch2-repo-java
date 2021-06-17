public interface Bike {
    public final int SpeedLimitOfBike = 90;

    default void SpeedLimit() {
        System.out.println("Speed is " + SpeedLimitOfBike);
    }

    public void Company();
}