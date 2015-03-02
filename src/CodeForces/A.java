package CodeForces;
import java.util.Scanner;

/*
 * Jan 31, 2015 1:27:15 PM
 * mohamed265
 */

public class A {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int grid[][] = new int[n + 1][n + 1];
		for (int i = 1; i < n + 1; i++) {
			grid[i][1] = 1;
		}
		for (int i = 1; i < n + 1; i++) {
			grid[1][i] = 1;
		}
		for (int i = 2; i < n + 1; i++) {
			for (int j = 2; j < n + 1; j++) {

				grid[i][j] += grid[i - 1][j] + grid[i][j - 1];
			}
		}
		System.out.println(grid[n][n]);
	}
}
