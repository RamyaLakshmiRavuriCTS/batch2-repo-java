import java.util.Scanner;
import java.util.StringTokenizer;

public class StringOccurence {
	
	public static void main(String[] args) {		
		
		UserMainCode u=new UserMainCode();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first sentence");
		String sentence1 = scanner.nextLine();
		System.out.println("Enter second sentence");
		String sentence2 = scanner.nextLine();
		System.out.println("COUNT :"+u.countNoOfWords(sentence1,sentence2));
		
	}

}
