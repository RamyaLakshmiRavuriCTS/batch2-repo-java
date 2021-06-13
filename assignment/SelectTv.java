import java.util.Scanner;
public class SelectTv {
    static class BlackAndWhiteTv {
        public void selection(){
            System.out.println("You have selected  Black and White TV");
        }
    }
    static class ColorTv extends BlackAndWhiteTv {
        @Override
        public void selection(){
            System.out.println("You Have selected  Color TV");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice of TV");
        System.out.println("1. Black and White TV");
        System.out.println("2. Color TV");
        int choiceInput = sc.nextInt();
        if (choiceInput == 1) {
            BlackAndWhiteTv tv = new BlackAndWhiteTv();
            tv.selection();
        } else if (choiceInput == 2) {
            BlackAndWhiteTv tv = new ColorTv();
            tv.selection();
        } else {
            System.out.println("Choose valid options : " +"\n" + "'1. Black and White TV'" +"\n" + "or" +"\n" + "'2. Color TV'");
        }
        sc.close();

    }
}