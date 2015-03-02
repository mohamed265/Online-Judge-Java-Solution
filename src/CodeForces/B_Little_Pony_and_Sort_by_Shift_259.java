package CodeForces;
import java.util.Scanner;

public class B_Little_Pony_and_Sort_by_Shift_259 {
	static public void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), eq1, sq1, eq2 = 0, sq2 = 0  , temp , count = 0;
		boolean flag = true, one = true , first = true;
		eq1 = sq1 = x.nextInt();
		for (int i = 1; i < n; i++) {
			temp = x.nextInt();
			if (temp >= eq1 && first)
				eq1 = temp;
			else if (temp <= sq1)
			{	
				if (one)
				{
					first = one = false;
					eq2 = sq2 = temp;
					count = n - i;
					continue;
				}
				if (temp >= eq2)
					eq2 = temp;
				else
					flag  = false;
			}
			else
				flag  = false;
			 
		}
		if (flag)
			System.out.print(count);
		else
			System.out.print(-1);
	}
}
/*
 * int n = x.nextInt(), a; Queue<Integer> list = new LinkedList<Integer>();
 * boolean flag = true; for (int i = 0; i < n; i++) { list.a(x.nextInt()); if (i
 * != 0) if (list.get(i) < list.get(i - 1)) flag = false; } if (flag)
 * System.out.println(0); else { int min = 0 , temp; for (int i = 0 ; i < n ;
 * i++) { min++; list.add(0, list.get(n-1)); list = list.subList(0,
 * n-1);//(list.get(n-1)); for (int i1 = 0 ; i1 < n ; i1++)
 * System.out.print(list.get(i1)+" "); if (ch(list)) { System.out.println(min);
 * return; } }
 * 
 * 
 * System.out.println(-1); } } static boolean ch (java.util.List<Integer> list)
 * { for (int i = 0; i < list.size(); i++) { {
 * 
 * if (i != 0)
 * 
 * if (list.get(i) < list.get(i - 1)) return false; }} return true; } }
 */
