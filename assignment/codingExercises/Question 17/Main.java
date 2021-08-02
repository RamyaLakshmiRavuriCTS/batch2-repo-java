package com.cts.MaxDiff;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] integerArray = new int[size];

		for (int i = 0; i < size; i++) {
			integerArray[i] = scanner.nextInt();
		}
		System.out.println(UserMainCode.findMaxDistance(integerArray, size));
	}
}
