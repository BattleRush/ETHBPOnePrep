package search;

public class SearchLinear extends Search {

	public int find(int[] a, int val) {	
		for (int i = 0; i < a.length; i++) {
			if(a[i] == val)
				return i;
		}
		
		return -1;
	}
	
}
