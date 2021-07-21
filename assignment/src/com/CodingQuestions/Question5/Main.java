import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input:");
        int input=sc.nextInt();
        HashMap<Integer,Integer> map = getValues(input);
        int output = UserMainCode.getAverageOfOdd(map);
        System.out.println(output);

    }
    static HashMap<Integer,Integer> getValues(int input)
    {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> number = new HashMap<Integer,Integer>();
        for(int i=1;i<=input;i++)
        {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            number.put(input1, input2);

        }
        System.out.println("Average output is:");
        return number;


    }
}

