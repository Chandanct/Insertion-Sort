package insertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int unsortedArray = 1; unsortedArray < intArray.length; unsortedArray++) {
			int newElement = intArray[unsortedArray];
			int i;
			for (i = unsortedArray; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;
		}
		System.out.println(Arrays.toString(intArray));
	}

}
