package CodeForces;
import java.util.Scanner;

public class Round240_D_Mashmokh_and_ACM {

	long n, k, slon = 0, MAX = 1000000007;
	long[][] grid = new long[2001][2001];

	long dp(int seqSize, int ele) {

		if (seqSize == k)
			return 1;
		else if (ele > n)
			return 0;

		if (grid[seqSize][ele] == -1) {
			grid[seqSize][ele]++;

			for (int i = ele; i <= n; i += ele)
				grid[seqSize][ele] += dp(seqSize + 1, i);

		}
		grid[seqSize][ele] %= MAX;
		return grid[seqSize][ele];
	}

	public void solve(int nn, int kk) {
		for (int i = 0; i < 2001; i++) {
			for (int j = 0; j < 2001; j++) {
				grid[i][j] = -1;
			}
		}
		n = nn;
		k = kk;
		for (int i = 1; i <= n; i++) {
			slon = (slon + dp(1, i)) % MAX;
		}

		System.out.println(slon);

	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		new Round240_D_Mashmokh_and_ACM().solve(x.nextInt(), x.nextInt());
	}

}
