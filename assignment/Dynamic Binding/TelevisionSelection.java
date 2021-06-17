import java.util.Scanner;

public class TelevisionSelection {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Selection Number:\n 1 - Black and White TV \n 2 - Color TV");
        int selection=scanner.nextInt();
        switch(selection){
            case 1:
                Tv tv = new BlackAndWhiteTv();
                tv.chooseTypeOfTv();
                break;
            case 2:
                Tv tv1 = new ColorTv();
                tv1.chooseTypeOfTv();
                break;
            default :
                System.out.println("Invalid Selection");
        }
    }

}