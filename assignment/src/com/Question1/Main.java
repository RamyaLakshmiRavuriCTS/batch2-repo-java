package Question1;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String str2 = sc.nextLine();
        System.out.println(UserMainCode.replacePlus(str1,str2));
    }
}
