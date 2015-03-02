package CodeForces;
import java.util.Scanner;

/*
 * Jan 28, 2015 6:39:30 PM
 * mohamed265
 */

public class Round247_B_Shower_Line {
	static long slon = 0 , t = 0;
	static int[][] grid = new int[6][6];

	public static void next_permutation(int[] arr, int l) {
		
		if (l == arr.length) {
			slon = Math.max(slon, grid[arr[0]][arr[1]] + grid[arr[1]][arr[0]]
					+ 2 * (grid[arr[2]][arr[3]] + grid[arr[3]][arr[2]])
					+ grid[arr[2]][arr[1]] + grid[arr[1]][arr[2]] + 2
					* (grid[arr[4]][arr[3]] + grid[arr[3]][arr[4]]));
			return;
		}
		 t++;
		int num = arr[l];
		for (int i = l; i < arr.length; i++) {
			int temp = arr[i];
			arr[l] = temp;
			arr[i] = num;
			next_permutation(arr, l + 1);
			arr[i] = temp;
		}
		arr[l] = num;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5 };
		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				grid[i][j] = x.nextInt();
			}
		}
		next_permutation(arr, 0);
		System.out.println(slon) ;
	}
}
