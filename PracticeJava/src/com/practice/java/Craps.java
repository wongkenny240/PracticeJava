package com.practice.java;

public class Craps {

	public Craps() {
		// TODO Auto-generated constructor stub
	}

	public static int roll() {
		return (int) (Math.random() * (6 + 1));
	}

	public static int rollTwice() {
		int result;
		int num1;
		int num2;
		num1 = roll();
		num2 = roll();
		result = num1 + num2;
		System.out
				.println("You rolled " + num1 + " + " + num2 + " = " + result);
		return result;
	}

	public static boolean isNatural(int result) {
		boolean isNatural = false;
		if (result == 7 || result == 11) {
			isNatural = true;
		}
		return isNatural;
	}

	public static boolean isCrap(int result) {
		boolean isCrap = false;
		if (result == 2 || result == 3 || result == 12) {
			isCrap = true;
		}
		return isCrap;
	}

	public static void main(String[] args) {
		int r = rollTwice();
		if (isNatural(r)) {
			System.out.println("You win");
		} else if (isCrap(r)) {
			System.out.println("You lose");
		} else {
			int oldR = r;
			System.out.println("point is " + oldR);
			r = rollTwice();
			while (oldR != r && r != 7) {
				oldR = r;
				System.out.println("point is " + oldR);
				r = rollTwice();
			}
			if (oldR == r) {
				System.out.println("You win");
			} else {
				System.out.println("You lose");
			}
		}
	}
}
