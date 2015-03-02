package CodeForces;
import java.util.ArrayList;
import java.util.Scanner;

public class RoundGoodBY_A_New_Year_Transportation {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), t = x.nextInt(), c = 1;
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		list.add(0);
		for (int i = 1; i < n; i++) {
			list.add(x.nextInt());
		}
		for (int i = 1; i <= n;) {
			if (c < t) {
				c += list.get(i);
				i = c;
			} else 
				break;
			if (c == t) {
				System.out.println("YES");
				return;
			} 

		}

		System.out.println("NO");
	}
}
