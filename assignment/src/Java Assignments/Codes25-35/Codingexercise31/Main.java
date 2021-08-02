import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimalFormat=new DecimalFormat("#.##");

        double numberOfDozens=scanner.nextDouble();

        double costOfDozen=scanner.nextDouble();

        double costOfToySold=scanner.nextDouble();
        double profitOrLoss=calculateProfitOrLoss(numberOfDozens,costOfDozen,costOfToySold);
        if(profitOrLoss<0){
            System.out.println("Sam's loss percentage is "+decimalFormat.format(Math.abs(profitOrLoss))+" percent");
        }
        else{
            System.out.println("Sam's profit percentage is "+decimalFormat.format(profitOrLoss)+" percent");
        }
    }
    public static double calculateProfitOrLoss(double numberOfDozens,double costOfDozen,double costOfEachToySold){
        double costOfToy=costOfDozen/12;
        System.out.println(costOfToy);
        double gainOrLoss=costOfEachToySold-costOfToy;
        System.out.println(gainOrLoss);
        double profitOrLoss=(gainOrLoss/costOfToy)*100;
        return profitOrLoss;
    }
}