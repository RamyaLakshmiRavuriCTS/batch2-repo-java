import java.util.Scanner;
public class ArrayException {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();             //Enter the size of array
        int [] arr = new int[n];
        for(int i=0;i<n;i++){            //Enter the values of array
            arr[i]=sc.nextInt();
        }
        int x= sc.nextInt();            //Enter the array index
        int y = sc.nextInt();           //Enter the array index
        System.out.println("Array of Index-"+x+"/"+y);
        try{
            System.out.print("Index is "+x+" = ");
            System.out.println(arr[x]);
            System.out.print("Index is "+y+" = ");
            System.out.println(arr[y]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("End of Main");
        }
    }
}