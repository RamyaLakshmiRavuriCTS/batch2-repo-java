import java.util.Scanner;

public class UniqueAndExistingCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First String");
		String msg1 = sc.nextLine();
		System.out.println("Enter your Second String");
		String msg2 = sc.nextLine();

		String input2 = msg1.toLowerCase();
		String input3 = msg2.toLowerCase();

		StringBuffer output = new StringBuffer();

		for (int i = 0; i < msg1.length(); i++) {
			char character = input2.charAt(i);
			if (input3.indexOf(character) == -1)
				output.append("+");
			else
				output.append(msg1.charAt(i));
		}
		System.out.println(output.toString());

	}
}
