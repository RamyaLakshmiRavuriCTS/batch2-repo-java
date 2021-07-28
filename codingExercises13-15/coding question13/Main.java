import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        if (sentence.length() > 100)
        {
            sentence = sentence.substring(0, 100);
        }
        System.out.println(UserMainCode.swapPairs(sentence));
    }
}