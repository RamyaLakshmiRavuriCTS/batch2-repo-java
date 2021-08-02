package com.cts.dateFormate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String date1 = scanner.next();
		String date2 = scanner.next();
		System.out.println(UserMainCode.findOldDate(date1, date2));
	}
}
