package com.bridgelabz;

import java.util.Scanner;

public class MonthlyPayment {
	public static double generateMonthlyPayment(double principal, int years, double rate) {

		double n = 12 * years;
		double r = rate / 12 / 100;
		double monthlyPayment = (principal * r) / (1 - Math.pow(1 + r, -n));
		return monthlyPayment;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the principal loan amount : ");
		double principal = scanner.nextDouble();
		System.out.println("Enter the Years : ");
		int years = scanner.nextInt();
		System.out.println("Enter the Interest Compound monthly :");
		double rate = scanner.nextDouble();

		double payment = generateMonthlyPayment(principal, years, rate);
		System.out.println("The monthly Payment is: " + payment);
	}

}
