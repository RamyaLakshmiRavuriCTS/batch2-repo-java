package Mathclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first integer");
        Integer integer1=scanner.nextInt();
        System.out.println("Enter the second integer");
        Integer integer2=scanner.nextInt();
        UserMainCode.checkStaticAndNonStaticMethods(integer1,integer2);
    }

}
