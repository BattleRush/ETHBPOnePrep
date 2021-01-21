package sort;

public class SortQuick extends Sort implements ISort {

	private int partition(int[] a, int l, int r) {
		int i = l + 1;
		int j = r;
		int p = a[l];

		while (i < j) {
			while (i < r && a[i] < p) {
				i++;
			}

			while (j > l && a[j] >= p) {
				j--;
			}

			if (i < j) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}

		}

		if (a[j] < p) {
			a[l] = a[j];
			a[j] = p;
		}

		return j;
	}

	private void quickSort(int[] a, int l, int r) {
		if (r - l <= 0)
			return;

		if (l < r) {
			int k = partition(a, l, r);
			quickSort(a, l, k - 1);
			quickSort(a, k + 1, r);
		}
	}

	public int[] sort(int[] a) {
		quickSort(a, 0, a.length - 1);

		// oh well here we go again, dont judge me
		return a;
	}

}
