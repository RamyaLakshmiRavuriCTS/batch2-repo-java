
import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        String choice = scanner.nextLine();
        if(choice.equals("1.Black and White")){
            BlackAndWhite  selection=new BlackAndWhite();
            selection.select();
        }
       else if(choice.equals("2.ColorTv")){
            BlackAndWhite  selection=new ColorTv();
            selection.select();
        }
       else{
            System.out.println("Invalid Selection");
        }
    }

}




