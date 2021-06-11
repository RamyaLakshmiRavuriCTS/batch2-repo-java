package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice of TV");
        String val = sc.nextLine();
        if(val.equals("1. BlackandWhiteTV")) {
            BlackandWhiteTV tv = new BlackandWhiteTV();
            tv.selectTypeOfTv();
        }
        else if(val.equals("2. ColorTV")){
            BlackandWhiteTV tv = new ColorTV();
            tv.selectTypeOfTv();
        } else{
            System.out.println("Invalid Input");

        }
    }
}
