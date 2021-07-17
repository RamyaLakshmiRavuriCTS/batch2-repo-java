import java.util.Scanner;

public class Main {

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the  Array size");
            int size = sc.nextInt();
            Integer[] arr = new Integer[size];
            System.out.println("Enter elements into Array ");
            for(int i=0;i<size;i++) {
                arr[i] = sc.nextInt();
            }
            int sum = UserMainCode.addUniqueEven(arr);
            if(sum!=-1){
                System.out.println(sum);
            }
            else
                System.out.println("no Even Numbers");
        }
    }

