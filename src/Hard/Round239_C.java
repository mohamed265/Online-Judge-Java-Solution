package Hard;
import java.util.Scanner;

/*
 * Feb 13, 2015 8:22:53 PM
 * mohamed265
 */

public class Round239_C {

	static class point {
		point(double _X, double _Y) {
			x = _X;
			y = _Y;
		}

		point() {
		}

		public double x, y;

		public boolean isValid() {
			int xx = (int) x, yy = (int) x;
			if (xx == x && yy == y)
				return true;
			return false;
		}

		public boolean notEqual(point t) {
			if (t.x == x || t.y == y || t.y == 0 || t.x == 0 || y == 0
					|| x == 0)
				return false;
			return true;
		}
	}

	static point rotae(point old, double angle) {
		double rad = (angle * Math.PI) / 180.;
		point ne = new point();
		ne.x = old.x * Math.cos(rad) - old.y * Math.sin(rad);
		ne.y = old.y * Math.cos(rad) + old.x * Math.sin(rad);
		return ne;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		point a = new point(x.nextInt()  , 0), b = new point(0,
				x.nextInt()  );
		for (int i = 1; i <= 360; i++) {
			point neA = rotae(a, (double)i);
			point neB = rotae(b, (double)i);
			// System.out.println(neA.x + " " + neA.y);
			// System.out.println(neB.x + " " + neB.y);
			System.out.println(neA.isValid());
			if (neA.isValid() && neB.isValid() && neA.notEqual(neB)) {
				System.out.println("YES");
				System.out.println(1 + " " + 1);
				System.out.println(neA.x + " " + neA.y);
				System.out.println(neB.x + " " + neB.y);
				return;
			}
		}
		System.out.println("NO");
	}
}
