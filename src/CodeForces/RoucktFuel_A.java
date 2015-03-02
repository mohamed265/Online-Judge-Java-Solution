package CodeForces;
import java.util.Scanner;

/*
 * Feb 7, 2015 6:53:29 PM
 * mohamed265
 */

public class RoucktFuel_A {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n1 = x.nextInt(), n2 = x.nextInt(), k1 = x.nextInt(), k2 = x
				.nextInt();
		while (n1 != 0 && n2 != 0) {
			n1--;
			n2--;
		}
		if (n1 == 0)
			System.out.println("Second");
		else
			System.out.println("First");
	}
}
