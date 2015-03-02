package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Sort_the_Array_258 {
	public static void main(String ar[]) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), pre, temp, indexS = -1, s = 0, indexE = -1, e = 0;
		boolean flag = true, end = false;
		ArrayList<Integer> list = new ArrayList<Integer>(n);

		for (int i = 0; i < n; i++) {
			list.add(x.nextInt());
		}

		pre = list.get(0);

		for (int i = 1; i < n; i++) {
			temp = list.get(i);
			if (pre < temp && indexS != -1) {
				end = true;
			} else if (pre > temp) {
				if (end)
					flag = false;

				if (indexS == -1) {
					indexS = i;
					s = pre;
				} 
				
				indexE = i + 1;
				e = temp;
			}
			pre = temp;
		}
		if (flag) {
			if (indexE == -1 && indexS == -1)
				System.out.print("yes\n1 1");
			else if (indexE == n && indexS == 1)
				System.out.print("yes\n1 " + n);
			else if (indexS == 1 && s < list.get(indexE) )
				System.out.print("yes\n" + indexS + " " + indexE);
			else if (indexE == n && e > list.get(indexS - 2))
				System.out.print("yes\n" + indexS + " " + indexE);
			else if (indexE != n && indexS != 1 && s < list.get(indexE) && e > list.get(indexS - 2))
				System.out.print("yes\n" + indexS + " " + indexE);
			else
				System.out.print("no");
		} else
			System.out.print("no");

	}
}
/*
 * ArrayList<Integer> list = new ArrayList<Integer>(); list.add(temp); boolean
 * flag = true, flag2 = true; for (int i = 1; i < n; i++) { temp = x.nextInt();
 * if (temp > list.get(i - 1)) flag = false; if (temp < list.get(i - 1)) flag2 =
 * false; list.add(temp); } if (flag) System.out.print("yes\n1 " + n); else if
 * (flag2) System.out.print("yes\n1 1"); else { ArrayList<Integer> list2 = new
 * ArrayList<Integer>(list); Collections.sort(list2); boolean solve = true , end
 * = false; int f = 0, s = 0; for (int i = 0; i < n; i++) { if (list.get(i) !=
 * list2.get(i)) { if (end) { solve = false; continue; }
 * 
 * if (list.get(i-1) == list2.get(i-1) && list2.get(s) > list2.get(i-1) ) s = i;
 * 
 * if (f == 0 && s == 0) f = s = (i+1); else { if (list2.get(s) > list2.get(i))
 * s = (i+1); else end = true; }
 * 
 * }
 * 
 * } if (solve) System.out.print("yes\n" + f + " " + s); else
 * System.out.print("no"); }
 * 
 * }
 * 
 * } /* if (f == 0) f = (i + 1); else if (s == 0) s = (i + 1); else {
 * 
 * if (list.get(i-1) == list2.get(i-1) )//&& list2.get(i-1) > list2.get(i) ) s =
 * i;
 * 
 * if (s - f == 1 && list2.get(s) < list2.get(f)) s = (i + 1); else solve =
 * false; }
 */