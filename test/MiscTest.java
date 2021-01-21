import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import misc.*;



public class MiscTest {

	@Test
	public void maximumSubarraySumTest() {
		int[] a = new int[] { 7, -11, 15, 110, -23, -3, 127, -12, 1 };		
		int calcMaxSum = MaxSubArray.maxSubarraySum(a);	
		assertEquals(226, calcMaxSum);
		
		a = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};	
		calcMaxSum = MaxSubArray.maxSubarraySum(a);	
		assertEquals(6, calcMaxSum);
	}	
	
	
	@Test
	public void fiboTestNormal() throws Exception {	
		int[] expexted = new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269 };
		
		Fibonacci fibo = new Fibonacci();	
		var normal = fibo.calcNormal(30);

		assertArrayEquals(expexted, normal);
	}
	
	@Test
	public void fiboTestBottom() throws Exception {	
		int[] expexted = new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269 };
		
		Fibonacci fibo = new Fibonacci();	
		var bottom = fibo.calcBottom(30);			
		
		assertArrayEquals(expexted, bottom);
	}
	
	
	
	@Test
	public void longestCommonSubString() {	
		LongestCommonSubString longestCommonSubString = new LongestCommonSubString();	

		String a = "TIGER";
		String b = "ZIEGE";
		
		
		int length = longestCommonSubString.getLongestSubString(a, b);

		

		assertEquals(3, length);
	}
	
	
	@Test
	public void minimalEditDistanceString() {	
		MinimalEditDistance minimalEditDistance = new MinimalEditDistance();	

		String a = "TIGER";
		String b = "ZIEGE";
		
		
		int length = minimalEditDistance.getMinimalEditDistance(a, b);

		

		assertEquals(3, length);
	}

	
	
	
	
	
	
	
	public void print2d(int[][] a)
	{		
		System.out.println("Printing 2D");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	
	
	
	// duplicate code from Sort
	public void print(int[] a, int max) {
		
		int length = max == 0 ? a.length : max;
		
		if(max > a.length || max <= 1)
			length = a.length;
		
		System.out.println("Printing array of size: "+ a.length + " max: "+ length);
		
		System.out.print(a[0]);

		for (int i = 1; i < length; i++) {
			System.out.print(", " + a[i]);
		}
		
		System.out.println();
	}
}
