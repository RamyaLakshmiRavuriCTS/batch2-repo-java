package com.cts.question22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of HashMap");
		int size = sc.nextInt();
		Map<Integer, String> hashMap = new HashMap<>();

		for (int i = 0; i < size; i++) {
			hashMap.put(sc.nextInt(), sc.next());
		}
		List<String> names = UserMainCode.getName(hashMap);
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
