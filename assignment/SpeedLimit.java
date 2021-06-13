public class SpeedLimit {
    public static class Main {
        public static void main(String[]args){
            KtmDuke duke = new KtmDuke();
            duke.changeGear(2);
            duke.move("Duke200");
            KtmDuke.RE royalenfield = new KtmDuke.RE();
            royalenfield.changeGear(3);
            royalenfield.move("Royal Enfield");
        }
    }
    public interface Bike {
        final int speedLimit = 90;
        default int getSpeedLimit(){
            return speedLimit;
        }
        void changeGear(int a);
        void move(String name);
    }
    public static class KtmDuke implements Bike{
        int gear;
        String name;
        @Override
        public void changeGear(int newGear) {
            gear = newGear;
            System.out.println("Speed: "+speedLimit+ "\n" + "Gear: "+gear);
        }
        @Override
        public void move(String name) {
            System.out.println(name+" is moving with "+speedLimit+"KMPH speed");
        }
        public static class RE implements Bike{
            int gear;
            String name;
            @Override
            public void changeGear(int newGear) {
                gear= newGear;
                System.out.println("Speed: "+speedLimit+ "\n" +"Gear: "+gear);
            }
            @Override
            public void move(String name) {
                System.out.println(name+" is moving with "+speedLimit+"KMPH speed");
            }
        }

    }
}
