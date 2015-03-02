package CodeForces;
import java.util.Scanner;

/*
 * Feb 17, 2015 7:13:02 PM
 * mohamed265
 */

public class Round292_B_Drazil_and_His_Happy_Friends {
	static boolean[] boy = new boolean[100], girls = new boolean[100];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt();
		int b = x.nextInt();
		for (int i = 0; i < b; i++) {
			boy[x.nextInt()] = true;
		}
		int g = x.nextInt();
		for (int i = 0; i < g; i++) {
			girls[x.nextInt()] = true;
		}

		for (int i = 0; i < 10000; i++) {
			b = i % n;
			g = i % m;
			if (boy[b])
				girls[g] = true;
			else if (girls[g])
				boy[b] = true;
		}
		g = b = 0;
		for (int i = 0; i < n; i++) {
			if(boy[i])
				b++;
		}
		for (int i = 0; i <m; i++) {
			if(girls[i])
				g++;
		}
		if (b == n && g == m)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
