import java.util.Scanner;

public class AdjacentSwaps {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=read.nextLine();
        System.out.println("String after swapping is : "+swapPairs(input));
    }
    public static String swapPairs(String input)
    {
        StringBuilder string=new StringBuilder();
        int length=input.length();
        if(length%2!=0)length--;
        for(int i=0;i<length;i=i+2){
            string.append(input.charAt(i+1));
            string.append(input.charAt(i));
        }
        if(input.length()%2!=0)
            string.append(input.charAt(length));
        return String.valueOf(string);
    }
}
