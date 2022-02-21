package com.bridgelabz;

import java.util.Scanner;

public class BinaryToDecimal {
	public static int toDecimal(int binary) {

		int baseValue = 1, decimal = 0;
		int number = binary;
		int temporary = number;

		while (temporary > 0) {
			int lastDigit = temporary % 10;
			temporary = temporary / 10;
			decimal += lastDigit * baseValue;
			baseValue *= 2;
		}
		return decimal;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Binary Number: ");
		int binaryNumber = scanner.nextInt();
		int decimalRepresenatation = toDecimal(binaryNumber);
		System.out.println("The Decimal representation of " + binaryNumber + " is : " + decimalRepresenatation);

	}

}