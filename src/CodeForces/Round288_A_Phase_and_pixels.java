package CodeForces;
import java.util.Scanner;

public class Round288_A_Phase_and_pixels {

	static int[][] grid = new int[1002][1002];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		boolean flag = true;
		int n = x.nextInt(), m = x.nextInt(), k = x.nextInt(), slon = 0, a, b;
		for (int i = 0; i < k; i++) {
			a = x.nextInt();
			b = x.nextInt();

			if (grid[a][b] == 1)
				continue;

			grid[a][b] = 1;

			// System.out.println((a + 1) + " " + (b));
			// System.out.println((a ) + " " + (b - 1));
			// System.out.println((a + 1) + " " + (b - 1));

			if (grid[a + 1][b] == 1 && grid[a][b - 1] == 1
					&& grid[a + 1][b - 1] == 1 && flag) {
				slon = i + 1;
				flag = false;
			}

			// System.out.println((a - 1) + " " + (b));
			// System.out.println((a ) + " " + (b - 1));
			// System.out.println((a - 1) + " " + (b - 1));

			if (grid[a - 1][b] == 1 && grid[a][b - 1] == 1
					&& grid[a - 1][b - 1] == 1 && flag) {
				slon = i + 1;
				flag = false;
			}

			// System.out.println((a + 1) + " " + (b));
			// System.out.println((a ) + " " + (b + 1));
			// System.out.println((a + 1) + " " + (b +1));

			if (grid[a + 1][b] == 1 && grid[a][b + 1] == 1
					&& grid[a + 1][b + 1] == 1 && flag) {
				slon = i + 1;
				flag = false;
			}
			// System.out.println((a - 1) + " " + (b));
			// System.out.println((a ) + " " + (b + 1));
			// System.out.println((a - 1) + " " + (b + 1));

			if (grid[a - 1][b] == 1 && grid[a][b + 1] == 1
					&& grid[a - 1][b + 1] == 1 && flag) {
				slon = i + 1;
				flag = false;
			}

		}
		System.out.println(slon);
	}
}
