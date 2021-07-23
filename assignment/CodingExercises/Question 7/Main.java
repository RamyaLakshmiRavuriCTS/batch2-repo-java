package com.cts.retairment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		UserMainCode u = new UserMainCode();
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		Map<String, String> employeeMap = new HashMap<>();

		for (int i = 0; i < size; i++) {
			employeeMap.put(scanner.next(), scanner.next());
		}

		System.out.println(UserMainCode.retirementEmployeeList(employeeMap));

	}
}
