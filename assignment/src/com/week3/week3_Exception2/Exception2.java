import java.util.Scanner;
//main class
public class Exception2 {
    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        while (true) {
            int x = sc.nextInt();
            System.out.println("Enter array index");
            try {
                System.out.println(a[x]);
            } catch (Exception e) {
                System.out.println("End of Main");
                break;
            }
        }
    }
}
