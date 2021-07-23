import java.util.Scanner;
public class Main {
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the First String :");
         String s1 = s.nextLine();
         System.out.println("Enter the Second String :");
         String s2 = s.nextLine();

         System.out.println(Main.replacePlus(s1,s2));
     }
     public static String replacePlus(String s1,String s2){
         String str;
         char[] s = s1.toCharArray();
         char[] input1 = s1.toLowerCase().toCharArray();
         char[] input2 = s2.toLowerCase().toCharArray();
         char[] result = new char[input1.length];

         for(int i=0;i<input1.length;i++){
             for(int j=0;j<input2.length;j++){
                 if(input1[i] == input2[j]){
                     result[i] = s[i];
                     break;
                 }
                 if(j == input2.length -1){
                     result[i] = '+';
                 }
             }
         }
         str = String.valueOf(result);
         return str;
     }
}
