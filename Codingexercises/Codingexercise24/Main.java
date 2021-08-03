package Zigzag;

import java.util.Scanner;

//main class
public class Main {
    //main method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        System.out.println(UserMainCode.getLastDayOfMonth(scanner.next()));
    }
}