import java.util.Scanner;
public class TV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //System.out.print(input);
        BlankAndWhite w=input.toLowerCase().contains("2")?new Color():new BlankAndWhite();
        w.print();
    }
}
