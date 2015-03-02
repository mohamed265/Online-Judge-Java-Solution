package CodeForces;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Round78_A_Party {

	public static class node {
		public int number;
		Vector<node> ch = new Vector<>();

		node(int n) {
			number = n;
		}
	}

	public static class Pair<F, S> implements
			Comparator<Pair<Integer, Integer>> {
		public F first;
		public S second;

		Pair() {
		}

		Pair(F f, S s) {
			first = f;
			second = s;
		}

		@Override
		public int compare(Pair<Integer, Integer> arg0,
				Pair<Integer, Integer> arg1) {
			return arg0.first - arg1.first;
		}

	}

	public static boolean add(node temp, int parent, int num) {

		if (parent == temp.number) {
			temp.ch.add(new node(num));
			return true;
		}

		for (int i = 0; i < temp.ch.size(); i++) {
			if (add(temp.ch.get(i), parent, num))
				return true;
		}

		return false;
	}

	public static int calc(node temp, int count) {
		if (temp.ch.size() == 0)
			return count;
		int cou = 0;
		for (int i = 0; i < temp.ch.size(); i++) {
			cou = Math.max(cou, calc(temp.ch.get(i), count + 1));
		}
		return cou;
	}

	public static void main1(String[] args) {
		node start = new node(-1);
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		Vector<Pair<Integer, Integer>> temp = new Vector<Pair<Integer, Integer>>();
		int t;
		for (int i = 0; i < n; i++) {
			t = x.nextInt();
			if (!add(start, t, i + 1)) {
				temp.add(new Pair<Integer, Integer>(t, i + 1));
			}
		}

		Collections.sort(temp, new Pair<Integer, Integer>());
		/*
		 * int size = temp.size();
		 * 
		 * while (size != 0) { for (int i = 0; i < temp.size(); i++) {
		 * System.out .println(temp.get(i).first + " " + temp.get(i).second); if
		 * (temp.get(i).first != -2 && temp.get(i).second != -2 && add(start,
		 * temp.get(i).first, temp.get(i).second)) { size--; temp.get(i).first =
		 * temp.get(i).second = -2; } } }
		 */
		Vector<Pair<Integer, Integer>> temp2;
		while (temp.size() != 0) {
			temp2 = new Vector<Pair<Integer, Integer>>(temp.size());
			for (int i = 0; i < temp.size(); i++) {
				// System.out
				// .println(temp.get(i).first + " " + temp.get(i).second);
				if (!add(start, temp.get(i).first, temp.get(i).second)) {
					temp2.add(temp.get(i));
				}
			}
			temp = temp2;
		}
		int count = calc(start, 0);
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = x.nextInt();
		}
		int slon = 0;
		for (int i = 1; i <= n; i++) {
			int temp = 1;
			for (int j = i; arr[j] > -1;) {
				temp++;
				j = arr[j];
			}
			slon = Math.max(slon, temp);
		}
		System.out.print(slon);
	}
}
