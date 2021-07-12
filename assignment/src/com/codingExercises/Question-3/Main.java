import java.util.Scanner;

//main class
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        String sentence1 = SCANNER.nextLine();
        String sentence2 = SCANNER.nextLine();

        System.out.println(UserMainCode.countNoOfWords(sentence1, sentence2));
    }

}
