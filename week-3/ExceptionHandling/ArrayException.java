import java.util.Scanner;
public class ArrayException {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the values of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array index");
        int x= sc.nextInt();
        System.out.println("Enter the array index");
        int y = sc.nextInt();
        System.out.println("Array of Index- "+x+"/"+y);
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