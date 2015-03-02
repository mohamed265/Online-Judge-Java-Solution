package CodeForces;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_Queue_Round279 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), ff, tt;
		int[] list = new int[1000010], res = new int[n + 1];

		Set<Integer> f = new HashSet<>(200010), s = new HashSet<>(200010);
		for (int i = 0; i < n; i++) {
			ff = x.nextInt();
			tt = x.nextInt();
			list[ff] = tt;
			f.add(ff);
			s.add(tt);
		}

		f.removeAll(s);
		String secTemp = f.toString();

		int temp = 0, j = 2;
		while (list[temp] != 0) {
			temp = list[temp];
			res[j] = temp;
			j += 2;
		}

		temp = Integer.parseInt(secTemp.substring(1, secTemp.length() - 1));
		j = 1;
		while (temp != 0) {
			res[j] = temp;
			j += 2;
			temp = list[temp];
		}

		for (int i = 1; i < n + 1; i++) {
			System.out.print(res[i] + " ");
		}

	}

}
/*
 * 7 9 70 55 73 60 55 5 9 0 60 70 99 73 0
 */