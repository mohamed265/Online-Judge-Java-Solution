package CodeForces;

import java.util.Scanner;

public class C_Bits_Round276 {

	public static long list[] = new long[60];

	public static void main(String[] args) {
		list[0] = 1;
		for (int i = 1; i < 60; i++) {
			list[i] = list[i - 1] + list[i - 1];
		}
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		long l, r, tempNum;
		String temp;
		for (int i = 0; i < n; i++) {
			l = x.nextLong();
			r = x.nextLong();

			tempNum = (long) (Math.log10(r) / Math.log10(2));

			temp = Long.toBinaryString(l);

			for (int j = temp.length(); j <= tempNum; j++)
				temp = "0" + temp;

			for (int j = temp.length() - 1, j2 = 0; j >= 0; j--, j2++) {
				if (temp.charAt(j) == '0') {
					if (l + list[j2] <= r)
						l += list[j2];
					else {
						break;
					}
				}
			}
			System.out.println(l);

		}

	}
}
