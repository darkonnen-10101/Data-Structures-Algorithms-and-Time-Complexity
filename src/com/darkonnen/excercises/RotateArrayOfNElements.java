package com.darkonnen.excercises;

import java.util.Arrays;



public class RotateArrayOfNElements {
	
	public int[] rotate(int[] myArray, int kSteps) {
		
		int[] newArray = Arrays.copyOfRange(myArray, kSteps, myArray.length);
		int[] anotherArray = Arrays.copyOfRange(myArray, 0, kSteps);
		int[] result = new int[myArray.length];

		System.arraycopy(newArray, 0, result, 0 , newArray.length);
		System.arraycopy(anotherArray, 0, result, newArray.length , anotherArray.length);

		return result;
	}

	public static void main(String[] args) {
		RotateArrayOfNElements ex = new RotateArrayOfNElements();

		int[] array = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(ex.rotate(array, 2)));
		
	}

}
