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
	
	public int[] rotate(int[] input, int rotateBy, int size) {
		
		int index;
		int savedIndex;
		int rotateByIndex;
		int temporary;
		
		rotateBy = rotateBy % size;
		
		int greatestCommonDivisor = findGreatestCommonDivisor(rotateBy, size);
		
		for(int i = 0; i < greatestCommonDivisor; i++) {
			temporary = input[i];
			savedIndex = i;
			
			while(true) {
				rotateByIndex = savedIndex + rotateBy;
				
				if(rotateByIndex >= size) {
					rotateByIndex = rotateByIndex - size;
				}
				
				if(rotateByIndex == i) {
					break;
				}
				
				input[savedIndex] = input[rotateByIndex];
				savedIndex = rotateByIndex;
				input[savedIndex] =  temporary;

			}
		}
		
		return input;
	}

	private int findGreatestCommonDivisor(int rotateBy, int size) {
		
		if(size == 0) {
			return rotateBy;
		} else {
			return findGreatestCommonDivisor(size, rotateBy % size);
		}
	}

	public static void main(String[] args) {
		RotateArrayOfNElements ex = new RotateArrayOfNElements();

		int[] array = {1,2,3,4,5,6,7};
		
//		System.out.println(Arrays.toString(ex.rotate(array, 2)));
		System.out.println(Arrays.toString(ex.rotate(array, 2, 7)));

	}

}
