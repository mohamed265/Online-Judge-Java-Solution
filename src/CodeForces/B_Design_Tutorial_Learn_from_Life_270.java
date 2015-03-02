package CodeForces;
import java.util.Scanner;

public class B_Design_Tutorial_Learn_from_Life_270 {

	static int grid[] = new int[2001];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), k = x.nextInt(), temp, max = 0, tiems;
		long slon = 0;
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			grid[temp]++;
			max = Math.max(max, temp);
		}
		temp = 0;
		for (int i = max; i >= 1; i--) {
			if (grid[i] != 0) {

				if (grid[i] % k != 0) {
					tiems = grid[i] / k + 1;
					temp = grid[i] % k;
					temp = k - temp;
					for (int j = i - 1; j >= 1 && temp != 0; j--) {
						if (grid[j] != 0) {
							if (grid[j] >= temp) {
								grid[j] -= temp;
								temp = 0;
							} else {
								temp -= grid[j];
								grid[j] = 0;
							}
						}

					}
				} else
					tiems = grid[i] / k;
				
				slon += 2 * (i - 1) * tiems;
			}
		}
		System.out.println(slon);

	}
}
