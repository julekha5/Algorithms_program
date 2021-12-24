package com.bridgelabz.algorithms;
public class ReverseNumber {
    /**
     * Reverse of a number method reverse the given number
     */
    public static int reverseNumber(int number) {
        int result = 0;
        while (number > 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }
        return result;
    }
}