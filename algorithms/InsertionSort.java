package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Of Insertion Sort
 */
public class InsertionSort {

	private static final ArrayList<String> list = new ArrayList<>();

	/**
	 * insertion method used to sort the strings in the array
	 * 
	 * @param wordList is the list of strings in array list
	 */
	public static void insertion(ArrayList<String> wordList) {
		for (int i = 0; i < wordList.size() - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (wordList.get(j).compareTo(wordList.get(j - 1)) < 0) {
					String temp = wordList.get(j);
					wordList.set(j, wordList.get(j - 1));
					wordList.set(j - 1, temp);
				}
			}
		}
	}

	/**
	 * addListOfWords method sets all the words in the array list
	 */
	public static void addListOfWord() {
		Scanner sc = new Scanner(System.in);
		boolean choice = false;
		while (!choice) {
			System.out.println("Enter\n1.Add String in list\n2.To exit");
			int num = sc.nextInt();
			sc.nextLine();
				if (num == 1)
					list.add(sc.nextLine());
				else 
					break;
            }
	}

	public static void main(String[] args) {
		System.out.println("Add the words in a array");
		addListOfWord();
		System.out.println("List before sorting : ");
		System.out.println(list);
		System.out.println("List after sorting : ");
		insertion(list); // calling insertion method
		System.out.println("The sorted list is: " + list);
	}
}