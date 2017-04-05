package com.example;

import java.util.Arrays;
import java.util.Stack;


public class Lab {

	/*
	  1. Return the nth fibonacci number
	  f(0) = 0
	  f(1) = 1
	  f(10) = 55
	*/
	public static int fibonacci(int n) {

		int fib1 = 0;
		int temp = 0;
		int fib2 = 1;

		for (int i = 0; i < n; i++) {
			//if (i != 0) {
			temp = fib1 + fib2;
			fib1 = fib2;
			fib2 = temp;
			System.out.println(fib1);
			//}
		}
		return fib1;
	}

	/*
	  2. Sort array of integers
	  f([2,4,5,1,3,1]) = [1,1,2,3,4,5]
	  Don't use built-in sort() method... that would be lame.
	*/
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int x = i + 1; x < array.length; x++) {
				if (array[i] > array[x]) {
					int temp = array[i];
					array[i] = array[x];
					array[x] = temp;
				}
			}
		}
		return array;
	}

	/*
	  3. Return the factorial of n
	  f(0) = 1
	  f(1) = 1
	  f(3) = 6
	*/
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				fact = 1;
			} else {
				fact *= i;
			}
		}
		return fact;
	}

	/*
	  4. Rotate left
	  Given array, rotate left n times and return array
	  f([1,2,3,4,5], 1) = [2,3,4,5,1]
	  f([1,2,3,4,5], 6) = [2,3,4,5,1]
	  f([1,2,3,4,5], 3) = [4,5,1,2,3]
	*/
	public static int[] rotateLeft(int[] array, int n) {
		for (int i = 0; i < n; i++) {
			int temp = array[0];
			for (int x = 0; x < array.length - 1; x++) {
				array[x] = array[x + 1];
			}
			array[array.length - 1] = temp;
		}
			return array;

	}

	/*
	  5. Balanced Brackets
	  A bracket is any one of the following: (, ), {, }, [, or ]
	  The following are balanced brackets:
	    ()
	    ()()
	    (())
	    ({[]})
	  The following are NOT balanced brackets:
	  (
	  )
	  (()
	  ([)]
	  Return true if balanced
	  Return false if not balanced
	*/
	public static boolean balancedBrackets(String bracketsString) {


			int len = bracketsString.length();
			if (len == 0 || bracketsString == null)
				return true;
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < bracketsString.length(); i++) {
				if (bracketsString.charAt(i) == '(' || bracketsString.charAt(i) == '[' || bracketsString.charAt(i) == '{')
					stack.push(bracketsString.charAt(i));
				else if (bracketsString.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
					stack.pop();
				else if (bracketsString.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
					stack.pop();

				else if (bracketsString.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
					stack.pop();
				else
					return false;

			}
			return stack.empty();

	}
}