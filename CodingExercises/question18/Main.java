package question18;

import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int result=UserMainCode.validatePAN(scanner.next());
        if(result==1){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
