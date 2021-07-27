package com.cts.Vowels;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");		
		String sentence = sc.nextLine();
		System.out.println(UserMainCode.storeMaxVowelWord(sentence));
		
	}

}
