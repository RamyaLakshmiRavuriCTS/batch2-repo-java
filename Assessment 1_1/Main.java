import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
	System.out.print("Please choose either 1.Black and WhilteTV or 2.Color Tv");
        TV tv=input.toLowerCase().contains("b")?new BlankAndWhite():new Color();
        tv.print();
    }
}
