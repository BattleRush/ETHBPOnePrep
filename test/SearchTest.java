
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import search.*;

public class SearchTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(5);

	@Test
	public void binarySearch() {
		SearchBinary binarySearch = new SearchBinary();
		int[] array = binarySearch.getSortedArray(1000, true);

		Random r = new Random();

		// all should be found
		for (int i = 0; i < 10; i++) {
			int index = r.nextInt(array.length);
			assertEquals(index, binarySearch.find(array, array[index]));
		}

		// some should not be found
		for (int i = 0; i < 10; i++) {
			int index = r.nextInt(array.length - 1);

			boolean missing = array[index + 1] != array[index] + 1;
			int expect = -1;

			if (!missing) {
				expect = index + 1;
			}
			
			assertEquals(expect, binarySearch.find(array, array[index] + 1));
		}
	}
	
	@Test
	public void linearSearch() {
		SearchLinear linearSearch = new SearchLinear();
		int[] array = linearSearch.getUnsortedArray(1000);

		Random r = new Random();

		// all should be found
		for (int i = 0; i < 10; i++) {
			int index = r.nextInt(array.length);
			assertEquals(index, linearSearch.find(array, array[index]));
		}

		// some should not be found
		for (int i = 0; i < 10; i++) {
			int index = r.nextInt(array.length - 1);

			boolean missing = array[index + 1] != array[index] + 1;
			int expect = -1;

			if (!missing) {
				expect = index + 1;
			}
			
			assertEquals(expect, linearSearch.find(array, array[index] + 1));
		}
	}
}