package sort;

public class SortMerge {

	public static int[] merge(int[] a, int l, int m, int r) {
		int[] aux = new int[r - l + 1];
		int i = l;
		int j = m + 1;
		int k = 0;

		while (i <= m && j <= r) {
			if (a[i] <= a[j]) {
				aux[k] = a[i];
				i++;
			} else {
				aux[k] = a[j];
				j++;
			}
			k++;
		}

		// leftover from left side
		while (i <= m) {
			aux[k] = a[i];
			i++;
			k++;
		}

		// leftover from right side
		while (j <= r) {
			aux[k] = a[j];
			j++;
			k++;
		}

		for (int n = l; n <= r; n++) {
			a[n] = aux[n-l];
		}

		// only needed because of the interface -> shrug
		return aux;
	}

}
