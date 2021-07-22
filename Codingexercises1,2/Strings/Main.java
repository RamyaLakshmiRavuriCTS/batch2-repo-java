package Strings;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String strg1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String strg2 = sc.nextLine();
        System.out.println(UserMainCode.replacePlus(strg1,strg2));
    }
}


