import java.util.ArrayList;
import java.util.Scanner;

public class MaxScorer {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("Enter the size of input");
        int size=read.nextInt();
        read.nextLine();
        ArrayList<String> array=new ArrayList<String>();
        System.out.println("Enter the input in format 'name-mark1-mark2-mark3'");
        for(int i=0;i<size;i++){

            array.add(read.nextLine());
        }
        System.out.println("The student with highest score was "+highestScore(array));

    }
    public static String highestScore(ArrayList<String> list){
        int max=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<list.size();i++){
            int sum=0;
            String[] array=list.get(i).split("-");
            sum=Integer.parseInt(array[1])+Integer.parseInt(array[2])+Integer.parseInt(array[3]);
            if(max<sum)
            {
                max=sum;
                result=new StringBuilder(array[0]);
            }
        }
        return String.valueOf(result);
    }
}
