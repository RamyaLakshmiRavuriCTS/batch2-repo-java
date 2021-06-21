package week2.interfaces;

public class TestBike {

    public static void main(String[] args) {

        Bike bike1 = new Pulsar();

        bike1.engineStart();
        System.out.println("Accelerating at " + bike1.accelerate() + " meters/square second");
        System.out.println("Max Speed: " + bike1.getSpeed() + " KMPH");
        bike1.engineStop();

        System.out.println("");

        Bike bike2 = new Hero();
        bike2.engineStart();
        System.out.println("Accelerating at " + bike2.accelerate() + " meters/square second");
        System.out.println("Max Speed: " + bike2.getSpeed() + " KMPH");
        bike2.engineStop();

        System.out.println();
        System.out.println("Default Max Speed of Bikes: " + Bike.maxSpeedInKMPH + " KMPH");

    }
}
