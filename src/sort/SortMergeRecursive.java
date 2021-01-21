package sort;

public class SortMergeRecursive extends Sort implements ISort {

	@Override
	public int[] sort(int[] a) {
		return mergeSort(a, 0, a.length - 1);
	}

	private int[] mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			SortMerge.merge(a, l, m, r);
		}

		// anything is by reference anyway
		return a;
	}

}
