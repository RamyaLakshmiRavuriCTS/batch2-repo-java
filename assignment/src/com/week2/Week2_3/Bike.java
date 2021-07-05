//inteface
public interface Bike {

    static int speedLimit = 90;
    //default method
    public default void getSpeedLimit() {
        System.out.println("The maximum speed limit is " + speedLimit + "kmph");
    }

    //abstract method
    public void getCompany();
}
