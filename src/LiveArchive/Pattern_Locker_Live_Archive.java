package LiveArchive;
import java.util.Scanner;

public class Pattern_Locker_Live_Archive {
	static long co = (long) (1E13 + 7);

	static long tabadel(long l, long m) {
		long slon = 1;
		while (m-- > 0) {
			slon = slon * l % co ;
			l--;
		}
		return slon;
	}

	public static void main(String[] args) {
		// System.out.print(co);
		Scanner x = new Scanner(System.in);
		long t = x.nextInt(), l, m, n;
		long slon = 0, pre;
		for (int i = 1; i <= t; i++) {
			slon = 0;
			l = x.nextInt();
			m = x.nextInt();
			n = x.nextInt();
			l *= l;
			slon = pre = tabadel(l, m);
			l -= m;
			for (int j = (int) m + 1; j <= n; j++) {
				pre = pre * l % co;
				slon = (slon + pre) % co;
				l--;
			}

			System.out.println("Case " + i + ": " + slon);

		}
	}

}
