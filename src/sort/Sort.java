package sort;
import java.util.Random;

public class Sort {

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
	
	
	public int[] getUnsortedArray(int size) {
		int[] a = new int[size];
		
		Random r = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(size*2);
		}
		
		return a;
	}
}
