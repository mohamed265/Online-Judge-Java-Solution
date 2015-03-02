package CodeForces;
import java.util.Scanner;

public class A_Initial_Bet_273 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int c1 = x.nextInt() ;
			c1 += x.nextInt() ;
			c1 += x.nextInt() ;
			c1 += x.nextInt() ;
			c1 += x.nextInt() ;
		System.out.print
		(c1 % 5 == 0 ? (c1 / 5 > 0 ? c1 / 5 : -1 ) : -1);
	}

}
