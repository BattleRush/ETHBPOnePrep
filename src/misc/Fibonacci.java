package misc;

public class Fibonacci {

	
	private int calc(int n) {
		if(n <= 1) {
			return 1;
		}
		
		return calc(n-1)+calc(n-2);
	}
	
	
	public int[] calcNormal(int n) throws Exception {
		if(n > 30)
			throw new Exception("DONT");
		
		
		int[] a = new int[n + 1];


		for (int i = 0; i < a.length; i++) {
			a[i] = calc(i);
		}

		return a;
	}
	
	
	public int[] calcBottom(int n) {
		int[] a = new int[n + 1];

		a[0] = 1;
		a[1] = 1;

		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}

		return a;
	}
	
}
