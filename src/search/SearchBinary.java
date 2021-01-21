package search;

public class SearchBinary extends Search {
	public int find(int[] array, int value) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {

			int middle = Math.floorDiv((left + right), 2);

			if (array[middle] == value)
				return middle;

			if (array[middle] < value) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}

		return -1;
	}

	public int findInsertBestIndex(int[] a, int right, int value) {
		int left = 0;
		// int right = a.length - 1;
		int lastMiddle = -1;

		if (a[0] > value)
			return 0;

		if (a[right] < value)
			return right + 1;

		while (left <= right) {

			int middle = (left + right) / 2;
			lastMiddle = middle;

			if (a[middle] == value)
				return middle + 1;
			else if (a[middle] < value)
				left = middle + 1;
			else
				right = middle - 1;
			
			if(a[middle] < value && a[middle+1] > value)
				return middle+1;
		}

		return lastMiddle + 1;
	}
}
