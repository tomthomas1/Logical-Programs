package com.logical;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		number = sc.nextInt();
		for (;number != 0; number = number / 10)
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
	
