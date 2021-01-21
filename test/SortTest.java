
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;


import sort.*;


public class SortTest {

	@Rule
	public Timeout globalTimeout= Timeout.seconds(1);

	@Test
	public void heapSort() {	
		SortHeap sort = new SortHeap();	
		int[] array = sort.getUnsortedArray(1000);
		int[] expexted = Arrays.copyOf(array, array.length);	
		
		Arrays.parallelSort(expexted);
		int[] sorted = sort.sort(array);
		assertArrayEquals(expexted, sorted);
	}
	

	@Test
	public void selectionSort() {	
		SortSelection sort = new SortSelection();	
		int[] array = sort.getUnsortedArray(1000);
		int[] expexted = Arrays.copyOf(array, array.length);	
		
		Arrays.parallelSort(expexted);
		
		//sort.print(expexted, -1);	
		int[] sorted = sort.sort(array);
		//sort.print(sorted, -1);
		assertArrayEquals(expexted, sorted);
	}
	
	
	@Test
	public void bubbleSort() {	
		SortBubble sort = new SortBubble();	
		int[] array = sort.getUnsortedArray(1000);
		int[] expexted = Arrays.copyOf(array, array.length);	
			
		Arrays.parallelSort(expexted);
		
		int[] sorted = sort.sort(array);
		assertArrayEquals(expexted, sorted);
	}
	
	
	@Test
	public void insertionSort() {	
		SortInsertion sort = new SortInsertion();	
		int[] array = sort.getUnsortedArray(1000);
		int[] expexted = Arrays.copyOf(array, array.length);	

		Arrays.parallelSort(expexted);	
		//sort.print(expexted, -1);
		int[] sorted = sort.sort(array);
		//sort.print(sorted, -1);
		
		assertArrayEquals(expexted, sorted);
	}
	
	/*
	@Test
	public void mergeIterativeSort() {	
		SortMergeNatural sort = new SortMergeNatural();	
		int[] array = sort.getUnsortedArray(10);
		int[] expexted = Arrays.copyOf(array, array.length);	

		Arrays.parallelSort(expexted);	
		//sort.print(expexted, -1);
		int[] sorted = sort.sort(array);
		//sort.print(sorted, -1);
		
		assertArrayEquals(expexted, sorted);
	}*/
	

	@Test
	public void mergeRecursiveSort() {	
		SortMergeRecursive sort = new SortMergeRecursive();	
		int[] array = sort.getUnsortedArray(1000);
		int[] expexted = Arrays.copyOf(array, array.length);	

		Arrays.parallelSort(expexted);	
		//sort.print(expexted, -1);
		int[] sorted = sort.sort(array);
		//sort.print(sorted, -1);
		
		assertArrayEquals(expexted, sorted);
	}
	
	/*
	@Test
	public void mergeStraightSort() {	
		SortMergeStraight sort = new SortMergeStraight();	
		int[] array = sort.getUnsortedArray(10);
		int[] expexted = Arrays.copyOf(array, array.length);	

		Arrays.parallelSort(expexted);	
		sort.print(expexted, -1);
		int[] sorted = sort.sort(array);

		sort.print(sorted, -1);
		assertArrayEquals(expexted, sorted);
	}*/
	
	
	@Test
	public void mergeQuick() {	
		SortQuick sort = new SortQuick();	
		int[] array = sort.getUnsortedArray(1000);
		int[] expexted = Arrays.copyOf(array, array.length);	

		Arrays.parallelSort(expexted);	
		int[] sorted = sort.sort(array);

		
		assertArrayEquals(expexted, sorted);
	}
	
	
	
	

	
}