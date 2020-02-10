package com.acn;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

@Service
public class App {

	public App() {
		// TODO Auto-generated constructor stub
=======
import java.util.Arrays;
import java.util.List;

public class App {
 

	ListChunking listChunker;
	ISort sorter;
	
	void doSortAndThenChunking(int[] array) {
		int[] sortedArray=
				sorter.bubblesort(array, SortType.DESC);
		List<List> lists=listChunker.listDivider(Arrays.asList(sortedArray), 3, false);
		
>>>>>>> bfd3827c0c66019c396a7d538d2eb5cff134063e
	}

}
