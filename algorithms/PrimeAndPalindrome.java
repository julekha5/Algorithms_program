package com.bridgelabz.algorithms;

import java.util.ArrayList;
import static com.bridgelabz.algorithms.PrimeNumbers.primeNumber;
import static com.bridgelabz.algorithms.ReverseNumber.reverseNumber;

/*
 * Prime and palindrome Class
 */
public class PrimeAndPalindrome {
	static ArrayList<Integer> palindromePrime = new ArrayList<>();
	/*
	 * palindrome method
	 */
	public static void palindrome() {
		for (int i : primeNumber) {
			if (i > 10) {
				if (i == reverseNumber(i)) {
					palindromePrime.add(i);
				}
			}
		}
	}

	/**
	 * Main method is used to call all the functions
	 */
	public static void main(String[] args) {
		primeNumber(1000);
		System.out.println("All the prime numbers in the range from 1 to 1000 : ");
		System.out.println(primeNumber);
		palindrome();
		System.out.println("All the Palindrome prime numbers in the range 1 to 1000 : ");
		System.out.println(palindromePrime);
		
	}
}