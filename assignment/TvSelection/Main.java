import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you choice of TV. \n 1.Black and White TV. \n 2.Color TV");
        int choiceInput = sc.nextInt();
        if (choiceInput == 1) {
            Tv choice = new BlackandWhiteTv();
            choice.selectTv();
        } else if (choiceInput == 2) {
            Tv choice = new ColorTV ();
            choice.selectTv();
        } else {
            System.out.println("Invalid option");
        }
        sc.close();
    }
}
