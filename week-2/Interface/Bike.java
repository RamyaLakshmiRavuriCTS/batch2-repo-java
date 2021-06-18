public interface Bike {

    final int speedLimit = 90;
    default int getSpeedLimit(){
        return speedLimit;
    }

    void changeGear(int a);
    void move(String name);



}