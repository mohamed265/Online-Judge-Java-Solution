package Hard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D_CGCDSSQ_Bayan {
	static public class Pair<L, R> {
		public L l;
		public R r;

		public Pair(L l, R r) {
			this.l = l;
			this.r = r;
		}
	}

	static long gdc(long x, long y) {
		Pair<Long, Long> c = new Pair<Long, Long>(x, y);
		Pair<Long, Long> h = new Pair<Long, Long>(y, x);

		if (ma.containsKey(c))
			return ma.get(c);
		if (ma.containsKey(h))
			return ma.get(h);

		// while (x != y) {
		// if (x > y)
		// x -= y;
		// else
		// y -= x;
		// }

		while (x != 0 && y != 0) {
			long c1 = y;
			y = x % y;
			x = c1;
		}

		ma.put(c, x + y);
		// System.out.print(x + " ");
		return x + y;
	}

	static ArrayList<Long> list = new ArrayList<Long>(),
			gg = new ArrayList<Long>();
	static HashMap<Long, Long> map = new HashMap<Long, Long>();
	static HashMap<Pair<Long, Long>, Long> ma = new HashMap<Pair<Long, Long>, Long>();

	static void con(int tar) {
		// System.out.println("tar" + tar);
		long temp, num;
		ArrayList<Long> lo = new ArrayList<Long>();
		for (int i = 0; i + tar < list.size(); i++) {
			temp = gdc(gg.get(i), list.get(i + tar));
			lo.add(temp);
			num = map.containsKey(temp) ? map.get(temp) : 0;
			map.put(temp, num + 1);
		}
		gg = lo;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		long temp, num;
		for (int i = 0; i < n; i++) {
			temp = 500;//x.nextInt();
			list.add((long) temp);

			num = map.containsKey(temp) ? map.get(temp) : 0;
			map.put(temp, num + 1);

			if (i != 0) {
				temp = gdc(list.get(i), list.get(i - 1));
				gg.add(temp);
				num = map.containsKey(temp) ? map.get(temp) : 0;
				map.put(temp, num + 1);
			}
		}
		for (int i = 3; i <= n; i++)
			con(i - 1);
		// for (int i = 0 ; i < 10 ;i++)
		// {
		// System.out.println(i + " " + map.get((long)i));
		// }
		//System.out.println(gg);
		n = x.nextInt();
		for (int i = 0; i < n; i++) {
			temp = x.nextLong();
			System.out.println(map.containsKey(temp) ? map.get(temp) : 0);
		}

	}

}
