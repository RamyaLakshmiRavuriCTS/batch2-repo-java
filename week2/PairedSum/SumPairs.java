import java.util.*;
public class SumPairs{

   public void printPairs(int arr[], int size, int sum)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i< size; i++)
        {
            int difference = sum - arr[i];
            if (map.containsKey(difference))
            {
                int count = map.get(difference);
                for(int j = 0; j < count; j++)
                    System.out.print("(" + difference + " + "+arr[i] + " = "  +sum+ ")" + "\n");
            }
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size =sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter elements into array");
        for(int index = 0; index < size; index++)
        {
            arr[index]=sc.nextInt();
        }
        System.out.println("Enter the number (sum)");
        int sum=sc.nextInt();
        SumPairs pairs=new SumPairs();
        pairs.printPairs(arr, size, sum);

    }
}


