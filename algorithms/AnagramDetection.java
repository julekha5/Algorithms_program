package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
 * Anagram class to detect the given string
 */
public class AnagramDetection {
    /*
     * This method checks the two strings and converts string to char array
     * replaceAll method replaces spaces with empty string
     * strings are converted to characters and stored in array
     */
    private static void Anagram(Scanner sc){
        System.out.print("Enter first string : ");
        String s1 = sc.nextLine();
        String string1 = s1.replaceAll("\\s","");
        System.out.print("Enter second string : ");
        String s2 = sc.nextLine();
        String string2 = s2.replaceAll("\\s","");
        boolean result;
        if(string1.length()!=string2.length()){
            result = false;
        }
        else {
            char[] s1Array = string1.toLowerCase(Locale.ROOT).toCharArray();
            char[] s2Array = string2.toLowerCase(Locale.ROOT).toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            result = Arrays.equals(s1Array,s2Array);
        }
        if(result) System.out.println(string1+" and "+string2+" are anagrams");
        else System.out.println(string1+" and "+string2+" are not anagrams");
    }

    /**
     * Main method implements isAnagram method to check
     * @param args command line argument
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Anagram(sc);
    }
}