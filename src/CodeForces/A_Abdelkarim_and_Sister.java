package CodeForces;
import java.util.Scanner;

/*
 * Apr 18, 2015 6:46:17 PM
 * mohamed265
 */

public class A_Abdelkarim_and_Sister {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double n = x.nextDouble();
		double res = Math.sqrt(n / Math.PI) * 2.;
		System.out.println(String.format("%.10f", res));
	}
}
