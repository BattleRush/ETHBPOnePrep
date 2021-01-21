package sort;

public class SortHeap extends Sort  implements ISort {

	private void heapify(int[] a, int i, int m) {
		while (2 * i+1 <= m) {
			int j = 2 * i+1;

			// not outside of the array
			if (j + 1 <= m) {
				// check if the right node is bigger
				if (a[j] < a[j + 1]) {
					j++;
				}
			}

			if (a[i] >= a[j])
				return; // heap correct as we are building max heap

			// can be switched without extra memory
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;

			i = j;
		}
	}

	public int[] sort(int[] a) {
		for (int i = a.length / 2; i >= 0; i--) {
			heapify(a, i, a.length - 1);
		}

		for (int i = a.length - 1; i > 0; i--) {
			// swap can be done without extra memory
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			heapify(a, 0, i - 1);
		}

		return a;
	}
}
