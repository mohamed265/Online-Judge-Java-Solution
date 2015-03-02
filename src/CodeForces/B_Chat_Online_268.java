package CodeForces;
import java.util.Scanner;

public class B_Chat_Online_268 {

	static int[] a = new int[51], b = new int[51], c = new int[51],
			d = new int[51];

	static void print(int q) {
		for (int i = 0; i < q; i++)
			System.out.println(c[i] + " " + d[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		 
		int p = x.nextInt(), q = x.nextInt(), l = x.nextInt(), r = x.nextInt();
		long slon = 0, temp = 0;
		for (int i = 0; i < p; i++) {
			a[i] = x.nextInt();
			b[i] = x.nextInt();
		}
		for (int i = 0; i < q; i++) {
			c[i] = x.nextInt() + l;
			d[i] = x.nextInt() + l;
		}
		for (int t = l; t <= r; t++) {
			temp = 0;
			for (int i = 0; i < p; i++) {

				for (int j = 0; j < q; j++) {
					if (d[j] < a[i] || c[j] > b[i])
						continue;
					// System.out.print(t+" " + a[i] + " " + b[i]+"    "
					// +c[j]+" " + d[j] +"\n");
					if (a[i] == c[j] && d[j] == b[i])
						temp += (b[i] - a[i] + 1);
					else if (a[i] == d[j] || c[j] == b[i])
						temp++;
					else if (a[i] <= c[j] && d[j] <= b[i])
						temp += (d[j] - c[j] + 1);
					else if (c[j] <= a[i] && b[i] >= d[j])
						temp += (d[j] - a[i] + 1);
					else if (a[i] <= c[j] && d[j] >= b[i])
						temp += (b[i] - c[j] + 1);
					else if (c[j] <= a[i] && d[j] >= b[i])
						temp += (b[i] - a[i] + 1);

					// System.out.println(slon);
				}

			}
			if (temp > 0)
				slon++;
			// print(q);
			for (int i = 0; i < q; i++) {
				c[i]++;
				d[i]++;
			}
		}
		System.out.print(slon);
	}

}
