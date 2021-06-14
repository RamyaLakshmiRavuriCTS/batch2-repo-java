import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //System.out.print(input);
        TV tv=input.toLowerCase().contains("b")?new BlankAndWhite():new Color();
        tv.print();
    }
}
