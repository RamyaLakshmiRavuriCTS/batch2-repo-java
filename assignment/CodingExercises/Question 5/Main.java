package com.cts.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		UserMainCode u = new UserMainCode();
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		Map<Integer, Integer> numberMap = new HashMap<>();

		for (int i = 0; i < size; i++) {
			numberMap.put(scanner.nextInt(), scanner.nextInt());
		}

		System.out.println(u.getAverageOfOdd(numberMap));

	}

}
