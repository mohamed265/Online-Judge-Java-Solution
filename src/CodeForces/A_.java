package CodeForces;
import java.util.Scanner;

/*
 * Mar 26, 2015 6:29:48 PM
 * mohamed265
 */

public class A_ {

	public static void main(String[] args) {
		int[] key = new int[26];
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), max = 2 * n - 2, slon = 0;
		String line = x.next();
		for (int i = 0; i < max; i += 2) {
			key[line.charAt(i) - 'a']++;
			if (key[line.charAt(i + 1) - 'A'] > 0)
				key[line.charAt(i + 1) - 'A']--;
			else
				slon++;

		}
		System.out.println(slon);

	}
}
