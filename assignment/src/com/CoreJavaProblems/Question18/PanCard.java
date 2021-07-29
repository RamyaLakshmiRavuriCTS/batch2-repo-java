import java.util.Scanner;

public class PanCard {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String pan= read.nextLine();
        int result=validatePan(pan);
        if(result==1)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    public static int validatePan(String pan)
    {
        if(pan.matches("[A-Z]{3}\\d{4}[A-Z]{1}"))
            return 1;
        else return 0;
    }
}
