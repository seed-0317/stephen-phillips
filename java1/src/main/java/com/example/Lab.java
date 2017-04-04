package com.example;

import java.util.*;

public class Lab {

	/*
	 * 1. Cast from double to int
	 *
	 * labels:[primitives, casting]
	 *
	 * f(0.0) = 0
	 * f(3.1) = 3
	 */
	public static int castToInt(double n) {
		return (int) n;
	}

	/*
	 * 2. Cast from short to byte
	 *
	 * labels:[primitives, casting]
	 *
	 * f(2) = 2
	 * f(128) = -128
	 */
	public static byte castToByte(short n) {
		return (byte) n;
	}

	/*
	 * 3. Division
	 *
	 * labels:[operators, exceptions, control statements]
	 *
	 * f(10,2) = 5.0
	 * f(3,2) = 1.5
	 * f(1,0) = throw IllegalArgumentException
	 */
	public static double divide(double operandOne, double operandTwo) {
		if (operandTwo == 0) {
			IllegalArgumentException myIE = new IllegalArgumentException();
			throw myIE;
		}
		else {
			return operandOne / operandTwo;
	}
	}

	/*
	 * 4. Even
	 *
	 * labels:[operators, control statements]
	 *
	 * f(2) = true
	 * f(3) = false
	 */
	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}


	/*
	 * 5. All even
	 *
	 * labels:[operators, arrays, control statements]
	 *
	 * f([2]) = true
	 * f([2,4,6,8,10]) = true
	 *
	 * f([3]) = false
	 * f([2,4,6,8,11]) = false
	 */
	public static boolean isAllEven(int[] array) {
		boolean evenOrNot = true;
		int lengthArr = array.length;
		for (int i = 0; i < lengthArr; i ++) {
			if (array[i] % 2 != 0) {
				evenOrNot = false;
				break;
			}
			else {
				evenOrNot = true;
			}
		}
		return evenOrNot;
	}



	/*
	 * 6. Average
	 *
	 * labels:[arrays, operators, control statements, exceptions]
	 *
	 * f([2]) = 2.0
	 * f([2,3]) = 2.5
	 * f(null) = throw IllegalArgumentException
	 */
	public static double average(int[] array) {
		double average = 0;

		if (array == null) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < array.length; i++) {
				average += array[i];
		}
		return average / array.length;
	}

	/*
	 * 7. Palindrome
	 *
	 * labels:[strings]
	 *
	 * f("a") = true
	 * f("aba") = true
	 * f("abba") = true
	 *
	 * f("ab") = false
	 */
	public static boolean isPalindrome(String str) {

		String backwords = "";
		for (int i = str.length()-1; i >= 0; i--) {
			backwords += str.charAt(i);
		}
		return (backwords.equals(str));
	}
}
