package UVA;
import java.util.Scanner;

//http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2470
public class E_Extend_to_Palindrome_UVA {

	public static void main(String[] args) {
		// System.out.print('A'-'a');
		Scanner x = new Scanner(System.in);
		String linString = "";
		final long p = 1000357, base = 201445;
		long l = 0, r = 0, start;
		while (x.hasNext()) {
			long cbase = 1;
			l = 0;
			r = 0;
			start = 0;
			linString = x.next();
			for (int i = linString.length() - 1; i >= 0; i--) {
				
				r = (linString.charAt(i) + r * base) % p;
				
				l = (cbase * linString.charAt(i) + l) % p;

				cbase = (base * cbase) % p;
				
				if (r == l)
					start = linString.length() - i + 1;
				// System.out.println(r + " " + l);
			}
			System.out.print(linString);
			for (int i = linString.length() - (int) start; i >= 0; i--)
				System.out.print(linString.charAt(i));
			System.out.println();
		
		}
		// boolean flag = false;
		// while (x.hasNext()) {
		//
		// base = -1;
		// linString = x.next();
		//
		// boolean re = true;
		// for (int i = 0, j = linString.length()-1 ; i < linString.length() / 2
		// && re ; i++,j--)
		// if ( linString.charAt(i) != linString.charAt(j) )
		// re = false;
		//
		// if (re){
		// System.out.println(linString);
		// continue;
		// }
		//
		// // StringBuffer b = new StringBuffer(linString);
		// // if (linString.equals(b.reverse().toString())) {
		// // System.out.println(linString);
		// // continue;
		// // }
		//
		// //System.out.println(linString);
		//
		// for (int i = linString.length() - 1; i > 0; i--) {
		// flag = false;
		// if (linString.charAt(i) == linString.charAt(i - 1)) {
		// int j = i+1, g = i - 2;
		// boolean tag = true;
		// for (; j < linString.length() && g >= 0; j++, g--) {
		// if (linString.charAt(j) != linString.charAt(g)) {
		// tag = false;
		// break;
		// }
		// }
		// if (j == linString.length() && tag){
		// base = g;
		// flag = true;
		// }
		// }
		// //}
		//
		// if (flag) {
		// break;
		// }
		//
		// if (i > 1 && linString.charAt(i) == linString.charAt(i - 2)) {
		// //System.out.print(i+"*");
		// int j = i+1, g = i - 3;
		// boolean tag = true;
		// for (; j < linString.length() && g >= 0; j++, g--) {
		// if (linString.charAt(j) != linString.charAt(g)) {
		// tag = false;
		// break;
		// }
		// }
		//
		// if (tag && j == linString.length() ){
		// base = g;
		// flag = true;
		// }
		// }
		//
		// if (flag) {
		// break;
		// }
		//
		// }
		//
		// if (base == -1){
		// //StringBuffer bu = new StringBuffer(linString.subSequence(0,
		// linString.length()-1));
		// System.out.print(linString);
		// for (int i = linString.length()-2; i >= 0; i--)
		// System.out.print(linString.charAt(i));
		// System.out.println();
		// } else {
		// //StringBuffer bu = new StringBuffer(linString.subSequence(0,
		// base+1));
		// System.out.print(linString);
		// for (int i = base; i >= 0; i--)
		// System.out.print(linString.charAt(i));
		// System.out.println();
		// }
		//
		// }

	}
}
