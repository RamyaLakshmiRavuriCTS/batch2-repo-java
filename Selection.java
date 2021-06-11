
import java.util.Scanner;
public class Selection {


    public static class superclass {
        void print() {

            System.out.println("You have selected Black and White TV");
        }
    }

    public static class subclass extends superclass {
        @Override
        void print() {

            System.out.println("You have selected Color TV");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice :\n 1. Black and White TV. \n 2. Color TV");
        String choice = sc.nextLine();

        if(choice.equals("1.Black and White TV")){
            Selection.superclass A = new Selection.superclass();
            A.print();
        }
        else if(choice.equals("2.Color TV")){
            Selection.superclass B = new Selection.subclass();
            B.print();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
