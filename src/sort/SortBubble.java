package sort;

public class SortBubble extends Sort implements ISort {

	public int[] sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {
					// switch these 2
					// there is a way to flip without extra memory
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}
