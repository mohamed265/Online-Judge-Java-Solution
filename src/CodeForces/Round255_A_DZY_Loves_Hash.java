package CodeForces;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Feb 9, 2015 7:04:18 PM
 * mohamed265
 */

public class Round255_A_DZY_Loves_Hash {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int p = x.nextInt(), n = x.nextInt(), temp, soln = -1;
		HashSet<Integer> set = new HashSet<>();
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			if (set.contains(temp % p) && flag) {
				flag = false;
				soln = i + 1;
			} else {
				set.add(temp % p);
			}
		}
		System.out.println(soln);
	}

}
