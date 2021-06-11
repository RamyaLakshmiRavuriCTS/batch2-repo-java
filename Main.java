import java.util.Scanner;
import java.lang.String;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array:");
            String s= sc.nextLine();
            ArrayReversalAndNoOfVowels(s);

        }

        public static void ArrayReversalAndNoOfVowels(String s) {
            int count = 0;

            if(s.isEmpty()) System.out.println("Invalid String");
            else{
                String lc=s.toLowerCase();
                for(int i=0;i<lc.length();i++) {
                    char v=lc.charAt(i);
                    if(v=='a' || v=='e' ||v=='i' || v=='o' || v=='u'){
                        count++;
                    }
                }
                char[] w=new char[s.length()];
                int n=w.length;
                for(int i=0;i<w.length;i++){
                    w[n-1-i]=s.charAt(i);
                }

                String reverse=String.copyValueOf(w);
                System.out.println("Reversed Array:"+reverse);
                System.out.println("Number of Vowels: "+count);
            }
        }
    }
