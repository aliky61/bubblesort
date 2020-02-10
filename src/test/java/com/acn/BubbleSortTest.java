package com.acn;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class BubbleSortTest {

	private BubbleSort sorter = new BubbleSort();
	 
    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};
 
        sorter.bubblesort(values);
    }
 
    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};
 
        sorter.bubblesort(values);
 
        assertArrayEquals(new int[] {42}, values);
    }
 
    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};
 
        assertArrayEquals(expectedOrder, sorter.bubblesort(values));
    }

    @Rule()
    
}
