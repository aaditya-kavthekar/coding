package com.javaBasics.practice;

import java.util.*;

public class RepeatedAlphabetCharactersInAString {

	public static void main(String[] args) {
		
		// initialize Scanner Reference
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string = ");
		String input = scan.next();
		if (input == null) {
			return;
		}
		
		// initialize local variables
		
		input = input.toLowerCase();
		int len = input.length();
		int[] alphabetsCountArray = new int[26];
		boolean NO_REPEATED_CHARS = true;
		
		// get the count of given string characters and store them in an array
		
		for (int i = 0; i < len; i++) {
			int charInt = input.charAt(i);
			if (charInt >= 97 && charInt <= 122) {
				alphabetsCountArray[charInt-97] += 1;
			} else {
				System.out.println("Input String must have only ALPHABETS. Run the PROGRAM again!");
				return;
			}
		}
		
		// print the repeated string characters
		
		for (int i = 0; i < 26; i++) {
			if (alphabetsCountArray[i] > 1) {
				NO_REPEATED_CHARS = false;
				char tempChar = (char) (i+ 97);
				System.out.println(Character.toString(tempChar) + " = " + alphabetsCountArray[i]);
			}
		}
		if (NO_REPEATED_CHARS) {
			System.out.println("No Repeated Characters!");
		}
	}

}
