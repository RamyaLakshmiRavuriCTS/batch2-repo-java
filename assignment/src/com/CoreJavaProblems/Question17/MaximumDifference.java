import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= read.nextInt();
        int[] array=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
        {
            array[i]= read.nextInt();
        }
        System.out.println("maximum difference found at index :"+findMaxDistance(array));
    }
    public static int findMaxDistance(int[] array)
    {
        int max=0,index=0;
        for(int i=0;i< array.length-1;i++)
        {
            if(Math.abs(array[i]-array[i+1])>max)
            {
                max=Math.abs(array[i]-array[i+1]);
                if(array[i]>=array[i+1])
                    index=i;
                else index=i+1;
            }
        }
        return index;
    }
}
