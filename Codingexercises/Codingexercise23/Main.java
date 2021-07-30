package Dateformatconversion;

import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        System.out.println(UserMainCode.convertDateFormat(sc.next()));
    }
}