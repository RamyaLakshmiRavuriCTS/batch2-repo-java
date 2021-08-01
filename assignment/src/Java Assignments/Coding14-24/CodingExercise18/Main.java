import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int result=validatePAN(scanner.next());
        if(result==1){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    //returns 1 if valid PAN number otherwise 2
    public static int validatePAN(String pan){
        boolean isValid=pan.matches("^(?=.*[A-Z]).{3}(?=.*[0-9]).{4}(?=.*[A-Z]).$");
        if(isValid){
            return 1;
        }
        return 2;
    }
}
