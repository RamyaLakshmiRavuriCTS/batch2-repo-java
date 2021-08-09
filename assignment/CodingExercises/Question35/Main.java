package com.cts.Question35;

import java.util.Scanner;

import com.cts.Question29.Card;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Cards :");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter card " + (i + 1));
			Card card = new Card(scanner.next(), scanner.nextInt());
			UserMainCode.insert(card);
		}
		UserMainCode.display();
	}

}
