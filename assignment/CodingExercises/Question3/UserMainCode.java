import java.util.StringTokenizer;

public class UserMainCode {
	
	public static int countNoOfWords(String sentence1,String sentence2) {
		
		int count = 0;
		StringTokenizer str = new StringTokenizer(sentence2, " ");
		String word1 = str.nextToken();
		String word2 = str.nextToken();
		
		StringTokenizer string = new StringTokenizer(sentence1, " ");

		while (string.hasMoreTokens()) {
			String str1words = string.nextToken();

			if (word2.equals(str1words)) {
				count++;
			}
		}

		return count;
		
	}

}
