package CodeForces;
import java.util.ArrayList;
import java.util.Scanner;

//8
//6 -3 0 3 -3 3 -3 6
public class C_Number_of_Ways_266 {

	static long fact(long x) {
		return ((x * x) / 2 - (x / 2));
	}

	public static void main(String[] args) {
		// System.out.print(fact (8));
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		long tar3 = 0, tar6 = 0, slon = 0;
		long[] cmul = new long[n];
		ArrayList<Long> li3 = new ArrayList<Long>(), li6 = new ArrayList<Long>();
		cmul[0] = x.nextLong();
		for (int i = 1; i < n; i++)
			cmul[i] = (long) x.nextInt() + cmul[i - 1];

		// for (int i = 0;i < n ; i++ )
		// System.out.print(cmul[i] + " ");

		if (n < 3 || cmul[n - 1] % 3 != 0)
			System.out.print(0);
		else {
			tar3 = (long) cmul[n - 1] / (long) 3;

			tar6 = (long) tar3 * (long) 2;

			// System.out.println( tar3 + "  " + tar6);
			if (tar3 == 0 && tar6 == 0) {
				int temp1 = 0;
				for (int i = 0; i < n; i++)
					if (cmul[i] == 0)
						temp1++;
				if (temp1 >= 3)
					System.out.print(fact(temp1-1));
				else
					System.out.print(0);
			} else {
				long temp3 = 0, temp6 = 0;
				for (int i = 0; i < n; i++)
					if (cmul[i] == tar3) {
						if (temp6 != 0) 
							li6.add(temp6);
						temp6 = 0;
						temp3++;
					} else if (cmul[i] == tar6
							&& (li3.size() != 0 || temp3 != 0)) {
						if (temp3 != 0)
							li3.add(temp3);
						temp3 = 0;
						temp6++;
					}
				if (temp6 != 0)
					li6.add(temp6);

				if (li3.size() == 0 || li6.size() == 0)
					System.out.print(0);
				else {
						/*for (int i = 0; i < li3.size(); i++)
							System.out.print(li3.get(i) + " ");
						System.out.println();
						for (int i = 0; i < li6.size(); i++)
							System.out.print(li6.get(i) + " ");
						System.out.println();*/
					for (int i = 0; i < li3.size(); i++)
						for (int j = i; j < li6.size(); j++)
							slon += (li3.get(i) * li6.get(j));
					System.out.print(slon);
				}
			}
		}
	}
}
// for (int i = 1 ;i < n ; i++ )
// System.out.print(cmul[i] + " ");