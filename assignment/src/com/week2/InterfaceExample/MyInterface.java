public interface MyInterface {
     public final int speed=90;
    default void speedLimit()
    {
        System.out.println("Speed limit is "+speed+" KMPH");
    }
    public abstract void company();
}
class Bike1 implements MyInterface
{
    @Override
    public void company()
    {
        System.out.println("From Royal Enfield");
    }
}

class Bike2 implements MyInterface
{
    @Override
    public void company()
    {
        System.out.println("From KTM");
    }
}
class interfaceDemo implements MyInterface
{
    @Override
    public void company()
    {
        System.out.println("Manufacturing companies");
    }

    public static void main(String[] args) {
        interfaceDemo id = new interfaceDemo();
        id.company();
        Bike1 b1 = new Bike1();
        b1.company();
        b1.speedLimit();
        Bike2 b2 = new Bike2();
        b2.company();
        b2.speedLimit();
    }
}