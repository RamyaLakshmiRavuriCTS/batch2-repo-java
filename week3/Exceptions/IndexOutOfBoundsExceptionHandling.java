import java.util.Scanner;
class IndexOutOfBoundsExceptionHandling
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the array:");
       int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for(int i = 0; i< size; i++ )
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("Enter index of an element");

        try {
            while (true) {
                int index = sc.nextInt();

                System.out.println("Element at Index  " + index + "=" + arr[index]);
            }
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println ("End of main");
        }
    }
    }