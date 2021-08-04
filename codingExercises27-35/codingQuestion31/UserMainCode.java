public class UserMainCode
{
    public static double calculateProfitOrLoss(double numberOfDozens,double costOfDozen,double costOfEachToySold){
        double costOfToy=costOfDozen/12;
        System.out.println("Cost price of 1 toy : " +costOfToy);

        double gainOrLoss=costOfEachToySold-costOfToy;
        System.out.println("Gain/loss : " +gainOrLoss);

        double profitOrLoss=(gainOrLoss/costOfToy)*100;

        return profitOrLoss;
    }

}