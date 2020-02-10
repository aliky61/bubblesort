package com.acn;

public class BubbleSort implements ISort{

	public int[] bubblesort(int[] unsortedArray, SortType sortType) {
		int temp;
		
			for (int i = 1; i < unsortedArray.length; i++) {
				for (int j = 0; j < unsortedArray.length - i; j++) {
					
					int diff = 0;
					diff = unsortedArray[j] - unsortedArray[j + 1];
					
					if(sortType == SortType.DESC) {
						diff *= -1;
					}
					
					if (diff > 0) {
						temp = unsortedArray[j];
						unsortedArray[j] = unsortedArray[j + 1];
						unsortedArray[j + 1] = temp;
					}
				}
			}

		return unsortedArray;
	}
}
