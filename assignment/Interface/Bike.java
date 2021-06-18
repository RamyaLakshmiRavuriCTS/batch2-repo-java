public interface Bike {
    final int speedLimit = 90;
    public void bike(String name);

    default void getSpeedLimit() {
        System.out.println("moving with "+speedLimit+ "KMPH speed"+ "\n");
    }
}