package com.cts.MaxScorer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> Students = new ArrayList<>();
		System.out.println("Enter the size");
		int N =sc.nextInt();

		for (int i = 0; i < N; i++) {
			Students.add(sc.next());
		}
		System.out.println(UserMainCode.highestScorer(Students));

	}

}
