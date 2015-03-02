package CodeForces;
import java.util.ArrayList;
import java.util.Scanner;

public class B_Little_Dima_and_Equation_262 {
	static boolean test(int i, double b) {
		
		if (b <= 0 || b >= 1000000000)
			return false;
		
		long  te = (long) b , res = 0;
		
		while ( te > 0) {
			res += te%10 ;
			te /= 10;
		}
		
		//System.out.println(i + " " + res + " " + b);
		
		if (res == i)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner (System.in);
		double x, c = 8, b = 2, a = 3;
		a = cin.nextDouble();
		b = cin.nextDouble();
		c = cin.nextDouble(); 
		ArrayList<Long> list = new ArrayList<Long>();
		for (int i = 0; i <= 81; i++) {
			// System.out.println(Math.pow(((i-c)/b),1.0/a));
			x = b * Math.pow(i, a) + c;
			test(i, x);
			if (test(i, x))
				list.add((long)x);
				//System.out.println(x);
		}
		System.out.println(list.size());
		for (int i = 0 ; i < list.size() ; i++)
			System.out.print(list.get(i) + " ");
	}

}
