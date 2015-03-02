package CodeForces;
import java.util.Scanner;

/*
 * Jan 28, 2015 6:39:30 PM
 * mohamed265
 */

public class Round247_C_K_tree {
	static long slon = 0;
	static int n = 0, k, d, MAX = 1000000007;

	static long[][] grid = new long[101][2];

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		n = x.nextInt();
		k = x.nextInt();
		d = x.nextInt();
		grid[0][0] = 1;
		grid[0][1] = 0;
		for (int i = 1; i <= n; i++) {
			grid[i][0] = grid[i][1] = 0;
			for (int j = 1; j <= k; j++) {
				if (i - j < 0)
					break;
				if (j < d) {
					grid[i][0] = (grid[i][0] + grid[i - j][0]) % MAX;
					grid[i][1] = (grid[i][1] + grid[i - j][1]) % MAX;
				} else {
					grid[i][1] = (grid[i][1] + grid[i - j][1] + grid[i - j][0])
							% MAX;
				}

			}
		}
		System.out.println(grid[n][1]);
	}
}
