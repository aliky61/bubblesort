package com.acn;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

	private BubbleSort sorter = new BubbleSort();

	@Test
	public void shouldDoNothingWithEmptyArray() {
		int[] values = {};

		sorter.bubblesort(values, SortType.ASC);
	}

	@Test
	public void shouldDoNothingWithOneElementArray() {
		int[] values = { 42 };

		sorter.bubblesort(values, SortType.ASC);

		assertArrayEquals(new int[] { 42 }, values);
	}

	@Test
	public void shouldSortValuesASC() {
		int[] values = { 9, -3, 5, 0, 1 };
		int[] expectedOrder = { -3, 0, 1, 5, 9 };

		assertArrayEquals(expectedOrder, sorter.bubblesort(values, SortType.ASC));
	}

	@Test
	public void shouldSortValuesDESC() {
		int[] values = { 9, -3, 5, 0, 1 };
		int[] expectedOrder = { 9, 5, 1, 0, -3 };

		assertArrayEquals(expectedOrder, sorter.bubblesort(values, SortType.DESC));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentException() {
		
	}
	
	
//    @Test
//    public void 

}
