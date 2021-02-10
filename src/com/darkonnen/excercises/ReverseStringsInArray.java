package com.darkonnen.excercises;

public class ReverseStringsInArray {
	
	public static void main(String[] args) {
		
		String stringToReverse = "reverse words in a string";
		
		ReverseStringsInArray ex = new ReverseStringsInArray();

		System.out.println(ex.reverse(stringToReverse));
	}


	public String reverse(String stringToReverse) {
		
		String[] wordsArray = stringToReverse.split(" ");
		
		String reversedString = "";

		for(int word = wordsArray.length -1; word >= 0; word--) {
			reversedString += wordsArray[word] + " ";
		}
		
		return reversedString = reversedString.substring(0, reversedString.length() -1);
		
		// Time complexity = O(n) -> Linear time

	}
	

}
