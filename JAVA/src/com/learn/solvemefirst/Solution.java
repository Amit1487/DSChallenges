package com.learn.solvemefirst;

import java.util.Scanner;

/**
 * @author Amit Dubey
 *
 */

/**
 * Complete the function solveMeFirst to compute the sum of two integers.
 * 
 * Function prototype:
 * 
 * int solveMeFirst(int a, int b);
 * 
 * where,
 * 
 * a is the first integer input. b is the second integer input Return values
 * 
 * sum of the above two integers Sample Input
 * 
 * a = 2 b = 3 Sample Output
 * 
 * 5 Explanation
 * 
 * The sum of the two integers and is computed as: .
 */


public class Solution {

	static int solveMeFirst(int a, int b) {
		// Hint: Type return a+b; below
		return (a + b);
	}

	public static void main(String[] args) {
		//we can also use scanner to get the user input
//		Scanner in = new Scanner(System.in);
		int a =2;
//		a = in.nextInt();
		int b=3;
//		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
