import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you choice of TV");
        String choice = sc.nextLine();

        if ("Black and White TV".equals(choice)) {
            TV tv = new BlackandWhiteTV();
            tv.chooseTypeOfTv();
        } else if ("Color TV".equals(choice)) {
            TV tv = new ColorTV();
            tv.chooseTypeOfTv();
        } else {
            System.out.println("Invalid Input");
        }

    }
}

