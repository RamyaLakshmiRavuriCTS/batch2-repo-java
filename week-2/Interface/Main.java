public class Main {

    public static void main(String[]args){
        Bike honda = new Honda();
        honda.changeGear(2);
        honda.move("Honda");
        Bike royal = new RoyalEnfield();
        royal.changeGear(3);
        royal.move("Royal Enfield");
    }
}