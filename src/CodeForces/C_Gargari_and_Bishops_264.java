package CodeForces;
import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C_Gargari_and_Bishops_264 {
	private static BufferedReader br;
	private static StringTokenizer st;
	
	 public static String nextToken() throws IOException {
	        while (st == null || !st.hasMoreTokens()) {
	            st = new StringTokenizer(br.readLine().trim());
	        }
	        return st.nextToken();
	    }
	    public static double nextDouble() throws IOException {
	        return Double.parseDouble(nextToken());
	    }
	    public static long nextLong() throws IOException {
	        return Long.parseLong(nextToken());
	    }
	    public static int nextInt() throws IOException {
	        return Integer.parseInt(nextToken());
	    }
	    
	    
	static int n;
	static long[][] grid = new long[2001][2001],
			cmulGrid = new long[2001][2001];

	static long fMax1(int x, int y, long to) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return 0;
		long res = grid[x][y];

		res += fMax1(x + 1, y + 1, to + grid[x][y]);

		// cmulGrid[x][y] += to ;
		cmulGrid[x][y] += res + to;

		return res;
	}

	static long fMax2(int x, int y, long to) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return 0;

		long res = grid[x][y];

		res += fMax2(x - 1, y + 1, to + grid[x][y]);

		// cmulGrid[x][y] += to ;
		cmulGrid[x][y] += res - grid[x][y] + to;

		return res;
	}

	public static void main(String[] args) throws Exception {
		
		InputStream in = System.in;
        
        br = new BufferedReader(new InputStreamReader(in));
        
		//Scanner x = new Scanner(System.in);
		
		/*n = 2000;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				grid[i][j] = 1000000000;*/
		
		n = nextInt(); //x.nextInt();

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				grid[i][j] =  nextLong();// x.nextLong();

		for (int i = 0; i < n; i++)
			fMax1(0, i, 0);
		for (int i = 1; i < n; i++)
			fMax1(i, 0, 0);

		for (int i = n - 1; i >= 0; i--)
			fMax2(i, 0, 0);
		for (int i = n - 1; i >= 1; i--)
			fMax2(n - 1, i, 0);

		int   xx = 0, yy = 0, xx1 = 1, yy1 = 0;
		
		for (int i = 0 ; i < n ; i++ ){
			for (int j = 0; j < n; j++) {
				if ( (i+j) % 2 == 0 && cmulGrid[xx][yy] < cmulGrid[i][j]){
					xx = i;
					yy = j;
				}
				else if ( (i+j) % 2 == 1 && cmulGrid[xx1][yy1] < cmulGrid[i][j]){
					xx1 = i;
					yy1 = j;
				}
				
			}
		}

		System.out.println(cmulGrid[xx][yy] + cmulGrid[xx1][yy1]);
		//System.out.println(cmulGrid[xx][yy] +" "+ cmulGrid[xx1][yy1]);
		System.out.println( (xx + 1) +" "+ (yy + 1) + " "+ (xx1 + 1) + " "+ (yy1 + 1));
//"%d %d %d %d\n",
		/*
		 * for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++)
		 * System.out.print(grid[i][j] + " "); System.out.println();
		 * 
		 * }
		 */

		/* for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print((cmulGrid[i][j]) + " ");
			System.out.println();

		}*/
		br.close();
	}

}
//static boolean flag = true;
/*static void Max(int x, int y) {

if (x < 0 || x >= n || y < 0 || y >= n)
	return;

// System.out.println(xx + " " + yy + " " + xx1 + " " + yy1 +" "+ flag);
Max(x - 1, y + 1);

if (cmulGrid[xx][yy] < cmulGrid[x][y] && (xx != x || y != yy)) {
	if (xx == x || yy == y) {
		xx1 = xx;
		yy1 = yy;
		xx = x;
		yy = y;
		flag = false;
	} else if (Math.abs(yy - y) % Math.abs(xx - x) == 0) {
		xx = x;
		yy = y;
	} else {
		xx1 = xx;
		yy1 = yy;
		xx = x;
		yy = y;
		flag = false;
	}
} else if ((xx != x || y != yy)
		&& cmulGrid[xx][yy] == cmulGrid[x][y]
		&& (xx == x || yy == y || (double) Math.abs(yy - y)
				/ (double) Math.abs(xx - x) != 1)) {
	xx1 = x;
	yy1 = y;
	flag = false;
}

if (flag && cmulGrid[xx1][yy1] <= cmulGrid[x][y] && x != xx && y != yy
		&& (xx1 != x || y != yy1)) {
	if (xx == x || yy == y) {
		xx1 = x;
		yy1 = y;
	} else if (Math.abs(yy - y) % Math.abs(xx - x) == 0) {
	} else {
		xx1 = x;
		yy1 = y;
	}
}

}*/
/*for (int i = 0; i < n; i++)
Max(i, 0);
for (int i = 1; i < n; i++)
Max(n - 1, i);*/