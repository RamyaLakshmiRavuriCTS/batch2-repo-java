package Assignment31;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfDozens;
        double costPerDozen;
        double sellingPricePerItem;
        double costPricePerItem;
        double profitPercent;

        System.out.println("Enter the number of dozens of toys purchased");
        noOfDozens = scanner.nextInt();

        System.out.println("Enter the price per dozen");
        costPerDozen = scanner.nextDouble();

        System.out.println("Enter the selling price of 1 toy");
        sellingPricePerItem = scanner.nextDouble();

        costPricePerItem = costPerDozen / 12;
        profitPercent = ((sellingPricePerItem - costPricePerItem) * 100) / costPricePerItem;

        System.out.println(String.format("Sam's profit percentage is %.2f percent", profitPercent));

    }
}
