package search;

import java.util.Random;

import sort.Sort;

public class Search extends Sort {
	

	public int[] getSortedArray(int size, boolean preventDupes) {
		int[] a = new int[size];
		
		Random r = new Random();
		int val = r.nextInt(10);
		for (int i = 0; i < a.length; i++) {
			a[i] = val;
			val += r.nextInt(10);
			
			if(preventDupes)
				val+= 1;
		}
		
		return a;
	}
	
	/*public  int find(int value) {
		
		return -1;
	}*/
}
