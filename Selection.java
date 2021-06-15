import java.util.Scanner;
public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice :\n 1. Black and White TV. \n 2. Color TV");
        String choice = sc.nextLine();
        
        if(choice.equals("1.Black and White TV"))
        {
             TV select = new BlackAndWhiteTV();
            select.print();
        }
        else if(choice.equals("2.Color TV"))
        {
            TV select = new ColorTV();
            select.print();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
