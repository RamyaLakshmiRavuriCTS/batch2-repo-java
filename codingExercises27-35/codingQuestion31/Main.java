import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        DecimalFormat decimalFormat=new DecimalFormat("#.##");
        System.out.println("Enter the number of dozens of toys purchased");
        double numberOfDozens= sc.nextDouble();

        System.out.println("Enter the price per dozen");
        double costOfDozen= sc.nextDouble();

        System.out.println("Enter the selling price of 1 toy");
        double costOfToySold= sc.nextDouble();

        double profitOrLoss=UserMainCode.calculateProfitOrLoss(numberOfDozens,costOfDozen,costOfToySold);

        if(profitOrLoss<0)
        {
            System.out.println("Sam's loss percentage is "+decimalFormat.format(Math.abs(profitOrLoss))+" percent");
        }

        else{
            System.out.println("Sam's profit percentage is "+decimalFormat.format(profitOrLoss)+" percent");
        }
    }

}
