package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = sc.nextLine();
        System.out.println("enter the second string:");
        String string2 = sc.nextLine();
        System.out.println(UserMainCode.replacePlus(string1, string2));
    }

}