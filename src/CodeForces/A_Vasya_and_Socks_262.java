package CodeForces;
import java.util.Scanner;

public class A_Vasya_and_Socks_262 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt(), res = 0;
		for (int i = 1; i <= n; res++, i++)
			if (i % m == 0)
				n++;

		System.out.print(res);
	}

}
/*
 * if (n == m) System.out.print(1+n); else if (n < m ) System.out.print(n); else
 * { while (n / m > 0) { // System.out.println(n); res += n; n = n / m; rem += n
 * % m; } System.out.print(res + rem); }
 */