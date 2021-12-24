package com.bridgelabz.algorithms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Permutations of a string
 */
public class Permutations {
	// set not allow duplicate entry
	static Set<String> hs = new HashSet<>();

	/**
	 * permutations method is a recursive function
	 * 
	 * @param oldString string is
	 * @param newString string is the updated string
	 */
	private static void permutations(String oldString, String newString) {
		if (newString == null) {
			return;
		}
		if (newString.length() == 0) {
			hs.add(oldString);
		}
		for (int i = 0; i < newString.length(); i++) {
			String oldStringupdated = newString + newString.charAt(i);
			String newStringUpdated = newString.substring(0, i) + newString.substring(i + 1);
			permutations(oldStringupdated, newStringUpdated);

		}
	}

	/**
	 * main method to implement the permutations of the given string
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check all permutations : ");
		String string = sc.nextLine();
		permutations("", string);
		System.out.println("All permutations of given String:" + hs);
	}
}