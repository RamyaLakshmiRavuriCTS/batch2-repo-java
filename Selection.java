import java.util.Scanner;
public class Selection {
    static class BlackAndWhiteTv {
        public void selection(){
            System.out.println("You Have selected for Black and White TV");
        }
    }
    static class ColorTv extends BlackAndWhiteTv {
        @Override
        public void selection(){
            System.out.println("You Have selected for Color TV");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of TV");
        System.out.println("1. Black and White TV");
        System.out.println("2. Color TV");
        String choiceInput = sc.nextLine();
        if (choiceInput.equals("1. Black and White TV")) {
            BlackAndWhiteTv tv = new BlackAndWhiteTv();
            tv.selection();
        } else if (choiceInput.equals("2. Color TV")) {
            BlackAndWhiteTv tv = new ColorTv();
            tv.selection();
        } else {
            System.out.println("Enter from valid options : '1. Black and White TV' or '2. Color TV'");
        }
        sc.close();
    }
}
