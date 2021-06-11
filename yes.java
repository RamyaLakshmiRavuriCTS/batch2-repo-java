import java.util.Scanner;
public class yes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your selection:");
        String select = sc.nextLine();
        if (select.equals("1. Black and White TV")) {
            A tv = new A();
            tv.selectionofTv();
        }
        else if (select.equals("2. Color TV")) {
            A tv = new B();
            tv.selectionofTv();
        }
        else {
            System.out.println("Invalid");
        }
    }
}

    class A {
        public void selectionofTv() {

            System.out.println("You have selected Black and White TV");
        }
    }

    class B extends A {
        public void selectionofTv() {

            System.out.println("You have selected Color TV");
        }
    }

