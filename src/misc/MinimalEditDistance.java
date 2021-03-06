package misc;

public class MinimalEditDistance {

	public int getMinimalEditDistance(String a, String b) {

		int[][] dp = new int[a.length() + 1][b.length() + 1];

		for (int i = 1; i <= a.length(); i++) {
			dp[i][0] = i;
			for (int j = 1; j <= b.length(); j++) {
				dp[0][j] = j;

				int same = a.charAt(i - 1) == b.charAt(j - 1) ? 1 : 0;

				dp[i][j] = Math.min(dp[i - 1][j - 1] + 1 - same, Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1));

			}
		}

		print2d(dp);
		
		return dp[a.length()][b.length()];
	}
	
	
	
	// duplicate from test
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
}
