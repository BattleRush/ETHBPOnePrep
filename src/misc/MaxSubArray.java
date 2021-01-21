package misc;

public class MaxSubArray {

	public static int maxSubarraySum(int[] array) {
		int sum = 0;
		int localMax = 0;
		
		for(int i = 0; i < array.length; i++) {
			localMax += array[i];
			
			if(localMax > sum)
				sum = localMax;
			
			if(localMax < 0)
				localMax = 0;
		}
		
		
		return sum;
	}
	
}
