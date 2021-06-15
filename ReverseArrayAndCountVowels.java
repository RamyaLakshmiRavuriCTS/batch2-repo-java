import java.util.Scanner;
import java.lang.String;
public class ReverseArrayAndCountVowels
{
    public static void main(String[] args)
    {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //Logic l=new Logic();
        //l.reverseArrayAndNoOfVowels(input);
        ReverseArrayAndCountVowels reverse = new ReverseArrayAndCountVowels();
        reverse.reverseArrayAndNoOfVowels(input);
    }
   public void reverseArrayAndNoOfVowels(String input)
    {
        int count = 0;
        if (input.isEmpty())
        {
            System.out.println("Invalid Input");
        } else
        {
            String InLowerCase = input.toLowerCase();
            for (int index = 0; index < InLowerCase.length(); index++)
            {
                char ch = InLowerCase.charAt(index);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    count++;
                }
            }

            char chars[] = input.toCharArray();
            char result[]= new char[input.length()];
            for (int index = chars.length - 1; index >= 0; index--)
            {
                result[result.length-1- index]=chars[index];
            }
            // System.out.println(Arrays.toString(result)); chars seperated by comma

            String reverse=String.copyValueOf(result);//converting array to string
            System.out.println("Reversed String : "+reverse);
            System.out.println("\nNumber of Vowels: " + count);
        }
    }
}