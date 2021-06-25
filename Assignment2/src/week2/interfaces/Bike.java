package week2.interfaces;

public interface Bike {

    String engineType = "petrol";
    int wheels = 2;
    int maxSpeedInKMPH = 90;

    default int getSpeed(){
        return this.maxSpeedInKMPH;
    }

    void engineStart();
    int accelerate();
    void engineStop();

}
