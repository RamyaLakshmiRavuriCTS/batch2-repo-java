package PANcard;

import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        int result=UserMainCode.validatePAN(sc.next());
        if(result==1){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}