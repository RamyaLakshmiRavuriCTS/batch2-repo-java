package com.cts.kaprekar;

public class UserMainCode {
	public static int getKaprekarNumber(int n) {
		int sq = n * n;
		int temp = n, right = 0, left = 0;
		int power = 0;
		int digit;

		while (temp != 0) {
			power++;
			temp = temp / 10;
		}

		digit = (int) Math.pow(10, power);
		right = sq % digit;
		left = sq / digit;

		if (n == right + left) {
			return 1;
		}
		return -1;
	}

}
