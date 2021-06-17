import java.util.Scanner;

 abstract class TV {
    abstract void chooseTypeOfTv();
}

 class BlackandWhiteTv extends TV{

    @Override
    public void chooseTypeOfTv() {
        System.out.println("You have selected Black and White TV");
    }
}


 class ColorTv extends TV{

    @Override
    public void chooseTypeOfTv() {
        System.out.println("You have selected Color TV");
    }
}


public class TelevisionSelection {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Selection Number:\n 1 - Black and White TV \n 2 - Color TV");
        int selection=scanner.nextInt();
        switch(selection){
            case 1:
                TV tv = new BlackandWhiteTv();
                tv.chooseTypeOfTv();
                break;
            case 2:
                TV tv1 = new ColorTv();
                tv1.chooseTypeOfTv();
                break;
            default :
                System.out.println("Invalid Selection");
        }
    }

}