package CodeForces;

import java.util.Scanner;

public class C_Secrets_194 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long n = x.nextLong(), slon = (long) (Math.log(n) / Math.log(3));
		/*slon = (long) Math.pow(3, slon);
		System.out.print(n / slon + (n % slon > 0 ? 1 : 0));*/
		  while (n % 3 == 0) { n/=3; } System.out.print( n/3 + 1);
		 

	}
}
