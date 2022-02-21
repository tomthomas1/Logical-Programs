package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine {
	public static int minimumNotes = 0;

	public static void calculateMinimumNotes(int amount) {
		if (amount == 0) {
			return;
			// System.err.println("Amount given is Rs 0");
		}

		if (amount >= 1000) {
			minimumNotes += amount / 1000;
			System.out.println("Number of Rs1000 notes : " + amount / 1000);
			if (amount / 1000 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 1000);
			}
		}

		else if (amount >= 500) {
			minimumNotes += amount / 500;
			System.out.println("Number of Rs500 notes : " + amount / 500);
			if (amount / 500 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 500);
			}
		}

		else if (amount >= 100) {
			minimumNotes += amount / 100;
			System.out.println("Number of Rs100 notes : " + amount / 100);
			if (amount / 100 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 100);
			}
		}

		else if (amount >= 50) {
			minimumNotes += amount / 50;
			System.out.println("Number of Rs50 notes : " + amount / 50);
			if (amount / 50 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 50);
			}
		}

		else if (amount >= 10) {
			minimumNotes += amount / 10;
			System.out.println("Number of Rs10 notes : " + amount / 10);
			if (amount / 10 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 10);
			}
		}

		else if (amount >= 5) {
			minimumNotes += amount / 5;
			System.out.println("Number of Rs5 notes : " + amount / 5);
			if (amount / 5 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 5);
			}
		}

		else if (amount >= 2) {
			minimumNotes += amount / 2;
			System.out.println("Number of Rs2 notes : " + amount / 2);
			if (amount / 2 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 2);
			}
		}

		else if (amount >= 1) {
			minimumNotes += amount / 1;
			System.out.println("Number of Rs1 notes : " + amount / 1);
			if (amount / 1 == 0) {
				return;
			} else {
				calculateMinimumNotes(amount % 1);
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Change amount");
		int changeInRupees = scanner.nextInt();
		calculateMinimumNotes(changeInRupees);
		scanner.close();

		System.out.println("Total number of notes to be given: " + minimumNotes);

	}

}
