package com.cts.anagram;

import java.util.Arrays;

public class UserMainCode {

	public static int getAnagram(String str1, String str2) {

		if (str1.length() == str2.length()) {

			char[] charset1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
			char[] charset2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

			Arrays.sort(charset1);
			Arrays.sort(charset2);

			if (Arrays.equals(charset1, charset2)) {

				return 1;
			}

		}
		return -1;

	}
}
