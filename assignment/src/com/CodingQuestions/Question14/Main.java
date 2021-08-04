import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input password:");
        String string = sc.nextLine();
        int result = UserMainCode.validatePassword(string);
        if(result==1){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }
}