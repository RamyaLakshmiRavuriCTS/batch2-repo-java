import java.util.Scanner;

public class Reverse {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter data");
            String data=scanner.nextLine();

            System.out.println(ReverseAString(data));
            System.out.println(CountVowels(data));
        }
        public static String ReverseAString(String data){
            String output="";
            for(int i=data.length()-1;i>=0;i--){
                output=output+data.charAt(i);
            }
            return output;
        }
        public static int CountVowels(String data) {
            int count = 0;
            for (int i = 0; i < data.length(); i++) {
                char c = data.toLowerCase().charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }
    }


