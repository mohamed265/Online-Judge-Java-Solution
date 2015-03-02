package CodeForces;
import java.util.Scanner;

/*
 * Feb 17, 2015 6:40:04 PM
 * mohamed265
 */

public class Round292_A_Drazil_and_Date {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long a = Math.abs(x.nextInt()), b = Math.abs(x.nextInt()), s = x
				.nextInt();
		if (a + b > s)
			System.out.println("No");
		else if (a + b == s)
			System.out.println("Yes");
		else {
			//System.out.println("Yes");
			long temp = s - a - b;
			if (s % 2 == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}
}
