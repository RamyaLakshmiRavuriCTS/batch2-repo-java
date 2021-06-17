import java.util.Scanner;
public class TelevisionSelection {

    public static void main(String [] args){

       TelevisionSelection tel = new TelevisionSelection();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Selection Number:\n 1 - Black and White TV \n 2 - Color TV");
        int selection=scanner.nextInt();
       tel.chooseTypeOfTv(selection);
    }

    public  void chooseTypeOfTv(int selection){

        switch(selection){
            case 1:
                System.out.println("You have selected Black and White Tv");
                break;
            case 2:
                System.out.println("You have selected Color Tv");
                break;
            default :
                System.out.println("Invalid Selection");
        }
    }
}