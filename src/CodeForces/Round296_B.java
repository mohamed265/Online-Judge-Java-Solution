package CodeForces;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mar 17, 2015 6:23:39 PM
 * mohamed265
 */

public class Round296_B {

	static class pair {
		public char c, exp;
		public int index;

	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		String s = x.next(), t = x.next();
		ArrayList<pair> list = new ArrayList<pair>();
		for (int i = 0; i < num; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				pair p = new pair();
				p.c = s.charAt(i);
				p.exp = t.charAt(i);
				p.index = i + 1;
				list.add(p);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).exp == list.get(j).c
						&& list.get(j).exp == list.get(i).c) {
					System.out.println(list.size() - 2);
					System.out.println(list.get(i).index + " "
							+ list.get(j).index);
					return;
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).exp == list.get(j).c) {
					System.out.println(list.size() - 1);
					System.out.println(list.get(i).index + " "
							+ list.get(j).index);
					return;
				}
			}
		}

		System.out.println(list.size());
		System.out.println("-1 -1");

	}
}
