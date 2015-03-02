package CodeForces;
import java.util.Scanner;

public class Round288_C_Anya_and_Ghosts {

	static int[] start = new int[300];
	static int m, t, r;

	static int calc(int com) {
		int slon = 0, temp = 1;
		for (int i = 0; i < r; i++) {

			if (start[i] + t < com || start[i] == -1000000) {
				slon++;
				start[i] = com - temp;
				//System.out.println(start[i]);
				temp++;
			}
		}
		// System.out.println();
		return slon;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		m = x.nextInt();
		t = x.nextInt();
		r = x.nextInt();
		for (int i = 0; i < 300; i++) {
			start[i] = -1000000;
		}
		int slon = 0;
		if (r > t)
			System.out.println(-1);
		else {

			for (int i = 0; i < m; i++) {
				slon += calc(x.nextInt());
			}
			System.out.println(slon);
		}
	}

}
