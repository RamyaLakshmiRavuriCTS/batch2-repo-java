package week2.interfaces;

public class Pulsar implements Bike{

    private int acceleration = 60;

    @Override
    public void engineStart() {
        System.out.println("Pulsar engine started.");
    }

    @Override
    public int accelerate() {
        return this.acceleration;
    }

    @Override
    public void engineStop() {
        System.out.println("Pulsar engine stopped");
    }
}
