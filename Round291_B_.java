package CodeForces;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Feb 14, 2015 6:25:23 PM
 * mohamed265
 */
/*
public class Round291_B_ {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), x0 = x.nextInt(), y0 = x.nextInt(), tempX, tempY, slon = 0;
		double slop = 0;
		HashSet<Double> set = new HashSet<Double>();
		boolean flag1 = true, flag2 = true;
		for (int i = 0; i < n; i++) {
			tempX = x.nextInt();
			tempY = x.nextInt();
			if (tempY != y0)
				slop = (double) (tempX - x0) / (double) (tempY - y0);
			if (tempX == x0 && flag1) {
				slon++;
				flag1 = false;
			} else if (tempY == y0 && flag2) {
				slon++;
				flag2 = false;
			} else if (tempX != x0 && tempY != y0) {
				set.add(slop);
			}
		}
		System.out.println(slon + set.size());
	}
}*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Round291_B_ {

    static StringTokenizer st;
    static BufferedReader br;
    static PrintWriter pw;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int[]x = new int[n+1], y = new int[n+1];
        int x0 = nextInt();
        int y0 = nextInt();
        for (int i = 1; i <= n; i++) {
            x[i] = nextInt();
            y[i] = nextInt();
        }
        boolean[]used = new boolean[n+1];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                ans++;
                for (int j = 1; j <= n; j++) {
                    if ((x0-x[j]) * (y[i]-y0)==(x[i]-x0) * (y0-y[j]))
                        used[j] = true;
                }
            }
        }
        System.out.println(ans);
        pw.close();
    }
    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    private static String next() throws IOException {
        while (st==null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
}