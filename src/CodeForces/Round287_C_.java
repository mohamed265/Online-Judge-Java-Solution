package CodeForces;
import java.util.Scanner;

public class Round287_C_ {
	static Scanner x = new Scanner(System.in);

	static long calculate(long level) {
		return (long) (Math.pow(2, level) - 1);
	}

	public static void main(String[] args) {
		long level = x.nextLong(), n = x.nextLong(), slon = 0, mid = (long) Math
				.pow(2, level) / 2, q = mid;

		boolean turn = false;
		while (level != 0) {
			q /= 2;
			if (n <= mid) {
				if (turn) {
					slon += calculate(level);
				}
				mid -= q;
				turn = true;
			} else if (n > mid) {
				if (!turn) {
					slon += calculate(level);
				}
				mid += q;
				turn = false;
			}
			slon++;
			level--;
		}
		System.out.println(slon);
	}
}