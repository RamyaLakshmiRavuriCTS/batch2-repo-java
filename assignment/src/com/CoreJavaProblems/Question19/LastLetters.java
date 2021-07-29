import java.util.Scanner;

public class LastLetters {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence= read.nextLine();
        System.out.println(getLastLetter(sentence));
    }
    public static String getLastLetter(String sentence){
        String[] array=sentence.split(" ");
        StringBuilder builder=new StringBuilder();
        for(int i=0;i< array.length;i++){
            builder.append(array[i].toUpperCase().charAt(array[i].length()-1));
            builder.append("$");
        }
        builder.deleteCharAt(builder.length()-1);
        return  String.valueOf(builder);
    }
}
