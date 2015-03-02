package CodeForces;
import java.util.Scanner;

public class C_Given_Length_and_Sum_of_Digits_Round277_5 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int m = x.nextInt(), s = x.nextInt();

		if (m == 1 && s == 0)
			System.out.println("0 0");
		else if (s <= m * 9 && s != 0) {
			int temp = s;
			int[] num = new int[m];
			for (int i = m - 1; i >= 0; i--) {

				if (s > 9) {
					num[i] = 9;
					s -= 9;
				} else {
					if (i == 0)
						num[i] = s;
					else {
						num[i] = (s - 1);
						num[0] = 1;
						break;
					}
				}

			}
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]);
			}
			System.out.print(" ");

			for (int i = 0; i < m; i++) {
				if (temp >= 9) {
					System.out.print(9);
					temp -= 9;
				} else {
					System.out.print(temp);
					temp -= temp;
				}
			}
			System.out.println();
		} else
			System.out.println("-1 -1");

	}

}
