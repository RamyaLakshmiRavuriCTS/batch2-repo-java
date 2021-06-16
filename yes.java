import java.util.Scanner;

public class yes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your selection:" +
                "\n1. Black and White TV" +
                "\n2. Color TV");
        int select = sc.nextInt();

        if (select == 1) {
            BlackandWhite tv = new BlackandWhite();
            tv.selectionofTv();
        } else if (select == 2) {
            Color tv = new Color();
            tv.selectionofTv();
        } else {
            System.out.println("Invalid");
        }
    }
}

 class BlackandWhite extends TV {

    @Override
    public void selectionofTv() {
        System.out.println("You have selected Black and White TV");
    }
}

 class Color extends TV {

    @Override
    public void selectionofTv() {
        System.out.println("You have selected Color TV");
    }
}

 class TV {

    public void selectionofTv() {
        System.out.println("You have selected a TV");
    }
 }

