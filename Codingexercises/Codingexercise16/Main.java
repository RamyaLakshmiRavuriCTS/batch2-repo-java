package Dateformat;

import java.util.Scanner;

// main class
public class Main {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date");
        String date1 = sc.next();
        System.out.println("Enter second date");
        String date2 = sc.next();
        System.out.println(UserMainCode.findOldDate(date1, date2));
    }
}