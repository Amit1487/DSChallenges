package com.leanrtocodeinthirtydays.daytwo;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "Data Type ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int secI;
		double secD;
		String secS;
		/* Read and save an integer, double, and String to your variables. */
		System.out.print("declare second INt");
		secI = scan.nextInt();
		System.out.print("declare second double");
		secD = scan.nextDouble();
		System.out.print("declare second String");
		secS = scan.next() + scan.nextLine();
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + secI);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + secD);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s.concat(secS));

	}

}
