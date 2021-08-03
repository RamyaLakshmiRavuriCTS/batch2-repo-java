import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string corresponds to the PAN number");
        int result=UserMainCode.validatePAN(sc.next());

        if(result==1)
        {
            System.out.println("Valid");
        }
        else
            {
            System.out.println("Invalid");
        }
    }

}