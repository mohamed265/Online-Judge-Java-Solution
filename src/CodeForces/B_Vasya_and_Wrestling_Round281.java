package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Vasya_and_Wrestling_Round281 {

	public static ArrayList<Integer> f = new ArrayList<Integer>(),
			s = new ArrayList<Integer>();

	public static int lexicographicallyLarger() {

		for (int i = 0; i < Math.min(f.size(), s.size()); i++) {
			if (f.get(i) > s.get(i))
				return 1;
			else if (f.get(i) < s.get(i))
				return 2;
		}
		// if (f.size() > s.size()) {
		// for (int i = 0; i < s.size(); i++) {
		// if (f.get(i) < s.get(i))
		// return 2;
		// else if (s.get(i) < f.get(i))
		// return 1;
		// }
		// } else if (f.size() < s.size()) {
		// for (int i = 0; i < f.size(); i++) {
		// if (f.get(i) > s.get(i))
		// return 1;
		// else if (f.get(i) < s.get(i))
		// return 2;
		// }
		// } else {
		// for (int i = 0; i < s.size(); i++) {
		// if (f.get(i) > s.get(i))
		// return 1;
		// else if (f.get(i) < s.get(i))
		// return 2;
		// }
		//
		// }
		return 0;
	}

	public static void main(String[] args) {
		// String a1 = "1221";
		// String a2 = "123";
		// System.out.println(a1.compareTo(a2));
		Scanner x = new Scanner(System.in);
		long ff = 0, ss = 0;
		int n = x.nextInt(), temp = 0, cho;
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			if (temp > 0) {
				ff += temp;
				f.add(temp);
			} else {
				ss += (-1 * temp);
				s.add(-1 * temp);
			}

		}
		if (ff > ss)
			System.out.println("first");
		else if (ss > ff)
			System.out.println("second");
		else {
			cho = lexicographicallyLarger();
			if (cho == 1)
				System.out.println("first");
			else if (cho == 2)
				System.out.println("second");
			else {
				if (temp > 0)
					System.out.println("first");
				else
					System.out.println("second");
			}
		}
	}

}
