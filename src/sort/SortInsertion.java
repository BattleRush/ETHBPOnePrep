package sort;

import search.*;

public class SortInsertion extends Sort implements ISort {

	@Override
	public int[] sort(int[] a) {
		SearchBinary search = new SearchBinary();

		for (int i = 0; i < a.length - 1; i++) {
			int index = search.findInsertBestIndex(a, i, a[i + 1]);

			int temp = a[i + 1];

			for (int j = i; j >= index; j--) {
				a[j + 1] = a[j];
			}

			a[index] = temp;
		}

		return a;
	}
}
