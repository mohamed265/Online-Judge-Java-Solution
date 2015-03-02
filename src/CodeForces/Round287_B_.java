package CodeForces;
import java.util.Scanner;

public class Round287_B_ {
	static Scanner x = new Scanner(System.in);

	public static void main(String[] args) {
		int r = x.nextInt(), x1 = x.nextInt(), y1 = x.nextInt(), x2 = x
				.nextInt(), y2 = x.nextInt();
		r += r;
		double dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int diss = (int) dis;
		if (diss != dis)
			diss++;
		System.out.println(diss % r == 0 ? diss / r : (diss / r) + 1);
	}
}
