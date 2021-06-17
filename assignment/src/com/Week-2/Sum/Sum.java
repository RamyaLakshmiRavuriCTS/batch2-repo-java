import java.util.Scanner;

public class Sum {
    public static void pairs(int[] Arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Number:");
        int inputNumber = sc.nextInt();
        System.out.println("Pairs of elements whose sum is:" + inputNumber);

        for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] + Arr[j] == inputNumber) {
                    System.out.println(Arr[i] + " + " + Arr[j] + " =  " + inputNumber);
                }
            }
        }
    }

    public static void main(String[] args) {

        pairs(new int[]{4, 6, 5, -10, 8, 5, 20});
    }
}
