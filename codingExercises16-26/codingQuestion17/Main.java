import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter integers into array");
        int[] integerArray = new int[size];

        for (int i = 0; i < size; i++)
        {
            integerArray[i] = sc.nextInt();
        }

        System.out.println(UserMainCode.findMaxDistance(integerArray, size));
    }

}