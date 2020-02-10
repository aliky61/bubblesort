package com.acn;

public class BubbleSort {

	public int[] bubblesort(int[] unsortedArray) {
		int temp;
		for (int i = 1; i < unsortedArray.length; i++) {
			for (int j = 0; j < unsortedArray.length - i; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1]) {
					temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j + 1];
					unsortedArray[j + 1] = temp;
				}

			}
		}
		return unsortedArray;
	}
}
