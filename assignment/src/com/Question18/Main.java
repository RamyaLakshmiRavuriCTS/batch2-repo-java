package Question18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = UserMainCode.validatePAN(scanner.next());
        if(result == 1){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
