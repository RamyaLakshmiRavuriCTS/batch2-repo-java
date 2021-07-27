package com.cts.ArrayListAndSetOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the size of integers");
		int n = sc.nextInt();

		for (int i = 0; i < 2 * n; i++) {
			if (i < n) {
				list1.add(sc.nextInt());
			} else {
				list2.add(sc.nextInt());
			}

		}

		System.out.println("Enter the operator Type");
		String operator = sc.next();
		List<Integer> finalresult = UserMainCode.performSetOperations(list1, list2, operator);

		for (Integer i : finalresult) {
			System.out.println(i);
		}
	}
}
