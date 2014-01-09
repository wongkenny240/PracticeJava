/**
 * 
 */
package com.practice.java;

import java.util.Scanner;

/**
 * @author Kenny
 * 
 */
public class CalSum {

	/**
	 * 
	 */
	public CalSum() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		double input = sc.nextDouble();
		double sum = 0;
		while (input >= 0) {
			sum = sum + input;
		}

		sc.close();
	}

}
