package CodeForces;
import java.util.Scanner;

public class A_Laptops_260 {
	// int [] a = new int [100000] , b
	static Scanner x = new Scanner(System.in);

	public static void main(String arr[]) {
		int n = x.nextInt(), a, b;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			a = x.nextInt();
			b = x.nextInt();
			if (a != b)
				flag = false;
		}

		if (flag)
			System.out.print("Poor Alex");
		else
			System.out.print("Happy Alex");

	}

}
/*
 * int n = x.nextInt() , a = 0 , b = 0 , tempa , tempb; boolean flag = true;
 * tempa = x.nextInt(); tempb = x.nextInt(); for (int i = 1 ; i < n ; i++) { a =
 * x.nextInt(); b = x.nextInt(); if (a > tempa && b < tempb) flag = false; else
 * if (a < tempa) { if (b > tempb) flag = false; else { tempa = a; tempb = b; }
 * } } if (flag) System.out.print("Poor Alex"); else
 * System.out.print("Happy Alex");
 */
/*
 * ArrayList<Integer> lista = new ArrayList<Integer>(n), listb = new
 * ArrayList<Integer>( n);
 * 
 * for (int i = 0; i < n; i++) { lista.add( x.nextInt() );// a = x.nextInt();
 * listb.add( x.nextInt() );// b = x.nextInt(); } for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) { if (lista.get(i) > lista.get(j) &&
 * listb.get(i) < listb.get(j)) { System.out.print("Happy Alex"); return; } else
 * if (lista.get(j) > lista.get(i) && listb.get(j) < listb.get(i)) {
 * System.out.print("Happy Alex"); return; } } }
 * 
 * // if (flag) System.out.print("Poor Alex"); // else
 */