package com.cts.Password;

public class UserMainCode {

	public static boolean validatePassword(String password) {
		return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*+-]).{8,}");
	}
}