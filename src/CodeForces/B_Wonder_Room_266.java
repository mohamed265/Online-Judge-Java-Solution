package CodeForces;
import java.util.*;

public class B_Wonder_Room_266 {
	static long a1, a2, b1, b2;

	static void slove1(long a, long b, long tar) {
		long temp = Math.min(a, b), temp2 = Math.max(a, b);
		while (tar % temp != 0 && temp * temp2 < tar)
			temp++;
		temp2 = tar / temp;

		// while (temp * temp2)

		if (temp >= a && temp2 >= b) {
			a1 = temp;
			b1 = temp2;
		} else if (temp2 >= a && temp >= b) {
			a1 = temp2;
			b1 = temp;
		} else if (temp >= a) {
			a1 = temp;
			b1 = b;
		} else if (temp2 >= a) {
			a1 = temp2;
			b1 = b;
		} else if (temp >= b) {
			b1 = temp;
			a1 = a;
		} else if (temp2 >= b) {
			b1 = temp2;
			a1 = a;
		}
	}

	static void slove2(long a, long b, long tar) {

		long temp = Math.max(a, b), temp2 = Math.min(a, b);
		while (tar % temp != 0 && temp * temp2 < tar)
			temp++;
		temp2 = tar / temp;

		if (temp >= a && temp2 >= b) {
			a2 = temp;
			b2 = temp2;
		} else if (temp2 >= a && temp >= b) {
			a2 = temp2;
			b2 = temp;
		} else if (temp >= a) {
			a2 = temp;
			b2 = b;
		} else if (temp2 >= a) {
			a2 = temp2;
			b2 = b;
		} else if (temp >= b) {
			b2 = temp;
			a2 = a;
		} else if (temp2 >= b) {
			b2 = temp2;
			a2 = a;
		}
	}

	public static void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		long n = x.nextInt(), a = x.nextInt(), b = x.nextInt(), tar = (n * (long) 6);
		if (tar <= a * b)
			System.out.println(a * b + "\n" + a + " " + b);
	 
			else {
				/*boolean f = false;
		        if (a > b)
		        {
		            long h = b ;
		            b = a; 
		            a = h;
		            f = true;
		        }
		        
		        long SQ = (long) 1e18, a1 = 0, b1 = 0, tmpb;
		        for( long i = a; i*i <= 6*n; ++i) {
		            tmpb = 6*n / i;
		            if (tmpb * i < 6*n) tmpb++;
		            
		            if (tmpb < b) continue;
		            
		            if (tmpb * i < SQ) {
		                SQ = tmpb * i;
		                a1 = i;
		                b1 = tmpb;
		            }
		        }
		        if (f){
		        	long h = a1;
		        	a1 = b1;
		        	b1 = h;
		        }
		         System.out.println(SQ + "\n" + a1 + " " + b1);
		        */
				//System.out.println(tar+ " " + Math.sqrt(tar));
				a1 = a ;
				b1 = b;
				while (a1 <= Math.sqrt(tar) && (a1 * b1) < tar) {
					a1++;
					b1 = tar / a1;
				}
				if ( b1 < b)
					b1 = b;
				//while ((a+1) * b < )
				/*
				 * slove1(a, b, tar); slove2(a, b, tar); if (a1 * b1 < a2 * b2
				 * && a1 * b1 >= tar) { a = a1; b = b1; } else if (b2 * a2 >=
				 * tar) { a = a2; b = b2; } else{ a = a1; b = b1; }
				 */
		        System.out.println(a1*b1 + "\n" + a1 + " " + b1);
			}
			
			// System.out.println(a1 * b1 + "\n" + a1 + " " + b1);
			// System.out.println(a2 * b2 + "\n" + a2 + " " + b2);

		 
	}
}
