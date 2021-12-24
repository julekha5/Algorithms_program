package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * bubble sort class
 */
public class BubbleSort {

	private static final ArrayList<Integer> list = new ArrayList<>();

	/**
	 * bubble sort method used to sort the elements in the array
	 * 
	 * @param arr is an integer array
	 */
	public static void bubbleSort(ArrayList<Integer> list) {
		if (list.size() > 1) // check if the number of orders is larger than 1
		{
			for (int x = 0; x < list.size(); x++) // bubble sort outer loop
			{
				for (int i = 0; i < list.size() - i; i++) {
					if (list.get(i).compareTo(list.get(i + 1)) > 0) {
						int temp = list.get(i);
						list.set(i, list.get(i + 1));
						list.set(i + 1, temp);
					}
				}
			}
		}
	}

	/**
	 * add a number in a list
	 *
	 */

	public static void addListOfNumber() {
		Scanner sc = new Scanner(System.in);
		boolean choice = false;
		while (!choice) {
			System.out.println("Enter\n1.Add Number in list\n2.To exit");
			int num = sc.nextInt();
			if (num == 1)
				list.add(sc.nextInt());
			else
				break;
		}
	}

	/*
	 * Main method
	 */
	public static void main(String[] args) {
		System.out.println("Add the numbers in a array");
		addListOfNumber();
		System.out.println("List before sorting : ");
		System.out.println(list);
		System.out.println("List after sorting : ");
		bubbleSort(list); // calling bubbleSort method
		System.out.println("The sorted list is: " + list);
	}
}