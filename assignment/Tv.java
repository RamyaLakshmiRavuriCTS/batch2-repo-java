import java.util.Scanner;

public  interface Tv {
      void SelectTv();

public class BlackandWhiteTV implements Tv {

    @Override
    public void SelectTv() {
        System.out.println("You have selected Black and White TV");
    }

}
public class ColorTV implements Tv {
    @Override
    public void SelectTv() {
        System.out.println("You have selected Color TV");
    }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you choice of TV. \n 1.Black and White TV. \n 2.Color TV");
        int choiceInput = sc.nextInt();
        if (choiceInput == 1) {
            Tv choice = new BlackandWhiteTV();
            choice.SelectTv();
        } else if (choiceInput == 2) {
            Tv choice = new ColorTV ();
            choice.SelectTv();
        } else {
            System.out.println("Invalid option");
        }
        sc.close();
    }
}