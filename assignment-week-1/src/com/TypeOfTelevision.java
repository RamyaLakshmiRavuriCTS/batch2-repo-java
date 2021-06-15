import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you choice of TV. \n 1.Black and White TV. \n 2.Color TV");
        String choice = sc.nextLine();

        if (choice.equals("1. Black and White TV")) {
            BlackandWhiteTV tv = new BlackandWhiteTV();
            tv.chooseTypeOfTv();
        } else if (choice.equals("2. Color TV")) {
            BlackandWhiteTV tv = new ColorTV();
            tv.chooseTypeOfTv();
        } else {
            System.out.println("Invalid Input");
        }
    }
}
