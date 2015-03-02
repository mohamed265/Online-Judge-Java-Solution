package Hard;
import java.util.Scanner;

public class Round286_C_ {
	static Scanner x = new Scanner(System.in);

	static int[] gem = new int[30010];
	static int[] dpp = new int[30010];

	static int dp(int cur, int l) {
		// System.out.println(cur + " " + l);
		// x.next();
		if (cur > 30000) {
		//	System.out.println(l);
			return 0;
		}
		//
		if (l == 3) {
			int temp1 = 0;
			for (int i = cur; i < 30001; i++)
				if (gem[i] != 0)
					temp1++;
			int temp = 0;
			for (int i = cur; i < 30001; i += 2) {
				if (gem[i] != 0)
					temp++;
			}
			dpp[cur] = Math.max(temp1, temp);
			return Math.max(temp1, temp);
		}

		if (dpp[cur] != 0)
			return dpp[cur];

		int t1 = 0, t2 = 0, t3 = 0;
		
		t3 = dp(cur + l + 1, l + 1);
		
		if (l != 0)
			t2 = dp(cur + l, l);

		

		if (l > 1)
			t1 = dp(cur + l - 1, l - 1);

		dpp[cur] = Math.max(t1, Math.max(t2, t3));

		if (gem[cur] != 0)
			dpp[cur] += gem[cur];

		return dpp[cur];

	}

	public static void main(String[] args) {

		int n = x.nextInt(), d = x.nextInt();
		for (int i = 0; i < n; i++) {
			gem[x.nextInt()]++;
		}
		System.out.println(dp(0, d));
	}

}
