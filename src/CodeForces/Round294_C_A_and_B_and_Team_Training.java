package CodeForces;
import java.util.Scanner;

/*
 * Feb 28, 2015 2:55:55 PM
 * mohamed265
 */

public class Round294_C_A_and_B_and_Team_Training {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt();
		System.out.println(Math.min((n + m) / 3, Math.min(n, m)));

	}
}
