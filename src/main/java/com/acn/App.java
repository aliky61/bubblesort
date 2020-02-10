package com.acn;

import java.util.Arrays;
import java.util.List;

public class App {
 

	ListChunking listChunker;
	ISort sorter;
	
	void doSortAndThenChunking(int[] array) {
		int[] sortedArray=
				sorter.bubblesort(array, SortType.DESC);
		List<List> lists=listChunker.listDivider(Arrays.asList(sortedArray), 3, false);
		
	}

}
