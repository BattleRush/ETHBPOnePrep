package sort;

public class SortSelection extends Sort implements ISort {
	
	
	// array is by ref but still giving it back incase i change to do a copy
	public int[] sort(int[] array) {
		
		for (int i = array.length-1; i > 0; i--) {
			int largestIdx = 0;
			int largestVal = array[0];
			
			for (int j = 1; j < i; j++) {
				if(array[j] > largestVal) {
					largestVal = array[j];
					largestIdx = j;
				}
			}
			
			// swap a[i] with a[largest]
			
		
			
			int temp = array[i]; // swap can be done without extra memory

			if(temp > largestVal)
				continue; // we are sorted
			
			array[i] = array[largestIdx];
			array[largestIdx] = temp;
			
		}
		
		return array;
	}

}
