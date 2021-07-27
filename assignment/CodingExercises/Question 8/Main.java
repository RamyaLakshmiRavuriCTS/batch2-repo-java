package com.cts.kaprekar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer");
		int n = sc.nextInt();
		int k = UserMainCode.getKaprekarNumber(n);

		if (k == 1)
			System.out.println("Kaprekar Number");

		else {
			System.out.println("Not Kaprekar Number");
		}

	}

}
