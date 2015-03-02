package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Vanya_and_Lanterns_Round280 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), l = x.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(n + 1);
		for (int i = 0; i < n; i++) {
			list.add(x.nextInt());
		}
		Collections.sort(list);
		int d = 0;
		for (int j = 1; j < list.size(); j++) {
			d = Math.max(d, list.get(j) - list.get(j - 1));
		}
		int mi = list.get(0) - 0;
		int ma = l - list.get(list.size() - 1);
		double rad = (double) d / 2.;
		System.out.println(Math.max(rad, Math.max(mi, ma)));
	}

}
