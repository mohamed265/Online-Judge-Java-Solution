package CodeForces;

import java.util.Scanner;

/*
 * Jan 30, 2015 11:02:22 AM
 * mohamed265
 */

public class Round186_B_Ilya_and_Queries {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String line = x.next();
		long[] temp = new long[line.length() + 1];

		for (int i = 0; i < line.length() - 1; i++) {
			temp[i + 1] = temp[i]
					+ (line.charAt(i) == line.charAt(i + 1) ? 1 : 0);
		}
		// temp[line.length()] = temp[line.length() - 1];
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		int m = x.nextInt();
		for (int i = 0; i < m; i++) {
			System.out.println(-temp[x.nextInt() - 1] + temp[x.nextInt() - 1]);
		}
	}
}

// for(cin>>m; m--; cout<<d[r-1]-d[l-1]<<endl)
// cin>>l>>r;