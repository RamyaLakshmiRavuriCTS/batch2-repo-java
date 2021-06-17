import java.util.Scanner;
class ReverseString
{
    public static void main(String[] args)
    {
        String s;
        int count =0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=sc.nextLine();                    //reading string from user

        System.out.print("After reverse string is: ");
        for(int i=s.length();i>0;--i)                //i is the length of the string
        {
            System.out.print(s.charAt(i-1));            //printing the character at index i-1
        }
        for (int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println("\nNumber of vowels in the given sentence is " +count);

    }
}
