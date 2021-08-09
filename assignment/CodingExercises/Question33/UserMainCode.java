package com.cts.Question33;

public class UserMainCode {

	public static void IntegerWrapperClassMethodsExample(String binary, String octal, String hexadecimal) {
		System.out.println("The integer value of the binary number " + binary + " is " + Integer.parseInt(binary, 2));
		System.out.println("The integer value of the octal number " + octal + " is " + Integer.parseInt(octal, 8));
		System.out.println("The integer value of the hexadecimal number " + hexadecimal + " is "
				+ Integer.parseInt(hexadecimal, 16));
	}

}
