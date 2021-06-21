package week2.interfaces;

public class Hero implements Bike{

    private int acceleration = 40;
    int maxSpeedInKMPH = 70;

    @Override
    public int getSpeed() {
        return maxSpeedInKMPH;
    }

    @Override
    public void engineStart() {
        System.out.println("Hero engine started");
    }

    @Override
    public int accelerate() {
        return this.acceleration;
    }

    @Override
    public void engineStop() {
        System.out.println("Hero engine stopped");
    }
}
