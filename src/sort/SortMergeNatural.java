package sort;

public class SortMergeNatural extends Sort implements ISort {
	
	// i dont have time for this reeeee
	@Override
	public int[] sort(int[] a) {
		int left = 0;
		do {
			int right = 0;
			while (right < a.length) {
				left = right + 1;
				int middle = left;
				while (middle < a.length && a[middle + 1] >= a[middle]) {
					middle++;
				}

				if (middle < a.length) {
					right = middle + 1;
					while (right < a.length && a[right + 1] >= a[right]) {
						right++;
					}
					SortMerge.merge(a, left, middle, right);
				} else {
					right = a.length;
				}
			}

		} while (left >= 0);

		return a;
	}

}
