package com.cts.Password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isValid = UserMainCode.validatePassword(scanner.next());

		if (isValid) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
	}
}
