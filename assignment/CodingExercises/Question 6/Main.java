package com.cts.anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		UserMainCode u = new UserMainCode();

		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		int result = u.getAnagram(str1, str2);

		if (result == 1) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

	}

}
