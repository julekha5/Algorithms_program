package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Binary Search class to check String is present or not
 */
public class BinarySearch {

	private static final ArrayList<String> list = new ArrayList<>();

	/**
	 * binary search method to check the word is present or not in list
	 * 
	 * @param addArray list added by user
	 * @param search   string is the element to be searched
	 * @return integer value
	 */
	public static int binarySearch(ArrayList<String> addArray, String search) {
		int left = 0, right = addArray.size() - 1;
		while (left <= right) {
			int middle = left + (right - left) / 2; // middle element
			int res = search.compareTo(addArray.get(middle));
			if (res == 0)
				return middle;
			if (res > 0)
				left = middle + 1; // left element
			else
				right = middle - 1; // right element
		}
		return -1;
	}

	/**
	 * addListOfWords method sets all the words in the array list
	 */
	public static void addListOfWords() {
		Scanner sc = new Scanner(System.in);
		boolean choice = false;
		while (!choice) {
			System.out.println("Enter the choice :\n1.Add words in a file\n2.Exit");
			int option = sc.nextInt();
			if (option == 1)
				list.add(sc.next());
			    
			else
				break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Add the words in a array");
		addListOfWords();

		System.out.println("Words List :" + list);

		System.out.println("Enter word to search : ");
		String search = sc.nextLine();

		int searchResult = binarySearch(list, search);

		if (searchResult == -1)
			System.out.println("Word is not found");
		else
			System.out.println("Word found at " + "position " + searchResult);
	}
}