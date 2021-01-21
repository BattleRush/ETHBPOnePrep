package sort;

public class SortMergeStraight extends Sort implements ISort {

	// i dont have time for this reeeee
	@Override
	public int[] sort(int[] a) {
		int length = 1;

		while (length < a.length) {
			int right = 0;

			while (right + length < a.length) {
				int left = right;
				int middle = left + length;
				right = Math.min(left + length*2-1, a.length-1);

				SortMerge.merge(a, left, middle, right);
				
			}
			length *= 2;
		}

		return a;
	}

}
