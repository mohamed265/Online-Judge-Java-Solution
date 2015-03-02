package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Round250_B_The_Child_and_Set {

	public static class elem implements Comparator<elem> {
		int ele, bitmask;

		elem() {
		}

		elem(int e, int b) {
			ele = e;
			bitmask = b;
		}

		public String toString() {
			return ele + " " + bitmask + "\n";
		}

		@Override
		public int compare(elem arg0, elem arg1) {
			return -(arg0.bitmask - arg1.bitmask);
		}

	}

	public static int bitMask(int num) {
		if (num % 2 == 1)
			return 1;

		int index = 0;
		String temp = Integer.toBinaryString(num);
		for (int i = temp.length() - 1; i >= 0; i--) {
			if (temp.charAt(i) == '0')
				index++;
			else
				break;
		}
		return (int) Math.pow(2, index);
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int sum = x.nextInt(), limit = x.nextInt();
		ArrayList<elem> list = new ArrayList<elem>();
		for (int i = 1; i <= limit; i++) {
			// System.out.println(i + " " + bitMask(i));
			list.add(new elem(i, bitMask(i)));
		}
		Collections.sort(list, new elem());
		// System.out.println(list);
		ArrayList<Integer> set = new ArrayList<Integer>();
		int tempSum = 0;
		for (int i = 0; i < limit && tempSum != sum; i++) {
			if (tempSum + list.get(i).bitmask <= sum) {
				set.add(list.get(i).ele);
				tempSum += list.get(i).bitmask;
			}
		}
		if (tempSum != sum)
			System.out.println(-1);
		else {
			System.out.println(set.size());
			for (int i = 0; i < set.size(); i++) {
				System.out.print(set.get(i) + " ");
			}
		}
	}
}
