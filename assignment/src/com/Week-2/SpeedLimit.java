public class SpeedLimit {

        public static void main(String[]args){
            Bike duke = new Duke();
            duke.getSpeedLimit("Duke");
            Bike royalenfield = new Duke.RE();
            royalenfield.getSpeedLimit("RoyalEnfield");
        }

    public interface Bike {
        final int speedLimit = 90;
          void  getSpeedLimit(String name);
    }
    public static class Duke implements Bike{
        @Override
        public void getSpeedLimit(String name) {

            System.out.println(name+" is moving with "+speedLimit+"KMPH speed");
        }
        public static class RE implements Bike{
            @Override
            public void getSpeedLimit(String name) {
                System.out.println(name+" is moving with "+speedLimit+"KMPH speed");
            }
        }

    }
}
