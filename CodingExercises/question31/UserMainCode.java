package question31;

public class UserMainCode {
    public static double calculateProfitOrLoss(double numberOfDozens,double costOfDozen,double costOfEachToySold){
        double costOfToy=costOfDozen/12;
        System.out.println(costOfToy);
        double gainOrLoss=costOfEachToySold-costOfToy;
        System.out.println(gainOrLoss);
        double profitOrLoss=(gainOrLoss/costOfToy)*100;
        return profitOrLoss;
    }
}
