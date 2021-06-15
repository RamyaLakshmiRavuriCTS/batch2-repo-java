package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice of TV");
        String val = sc.nextLine();
        if (val.equals("1. BlackAndWhiteTV")) {
            SelectTV tv = new BlackAndWhiteTV();
            tv.SelectTypeOfTV();
        } else if (val.equals("2. ColorTV")) {
            SelectTV tv = new ColorTV();
            tv.SelectTypeOfTV();
        } else {
            System.out.println("Invalid Input");
        }
    }
}