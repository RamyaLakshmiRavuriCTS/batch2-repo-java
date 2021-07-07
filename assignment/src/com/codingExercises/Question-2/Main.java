import java.util.Scanner;

//main class
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = SCANNER.nextInt();
        }

        //calling static method
        int result = UserMainCode.addUniqueEven(arr);
        if (result == -1) {
            System.out.println("no even numbers");
        } else {
            System.out.println(result);
        }
    }

}
