package CodeForces;
import java.util.Scanner;

public class A_Counterexample_275 {

	static boolean fun(long x, long y) {
		while (x != 0 && y != 0) {
			long c = y;
			y = x % y;
			x = c ;
		}
		return x+y != 1 ? false : true;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long l = x.nextLong(), r = x.nextLong();
//System.out.print(l + " " + r);
		if (r - l < 2)
			System.out.println(-1);
		else {
			for (long a = l; a < r - 1; a++) {
				for (long b = a + 1; b < r; b++) {
					for (long c = b + 1; c <= r; c++) {
						if (fun(a, b) && fun(b, c) && (!fun(a, c))) {
							System.out.println(a + " " + b + " " + c);
							return;
						}
					}
				}
			}
			System.out.println(-1);
		}
		
	}

}
