package LiveArchive;
import java.util.Scanner;

public class Assignments_Live_Archive {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		int t = x.nextInt(), n, d, v, c, f, ship = 0;
		float time, totalFule;
		for (int T = 0; T < t; T++) {
			ship = 0;
			n = x.nextInt();
			d = x.nextInt();
			for (int i = 0; i < n; i++) {
				v = x.nextInt();
				f = x.nextInt();
				c = x.nextInt();
				time = (float) d / (float) v;
				totalFule = time * (float) c;
				// System.out.println(time + " " + totalFule );
				//
				if (totalFule <= (float) f)
					ship++;

			}
			System.out.println(ship);
		}
	}
}
