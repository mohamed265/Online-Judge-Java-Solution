package CodeForces;
import java.util.Scanner;

public class B_Little_Pigs_and_Wolves_87 {

	static String[] grid = new String[10];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt(), slon = 0;
		for (int i = 0; i < n; i++)
			grid[i] = x.next();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (grid[i].charAt(j) == 'W') {
					if (i - 1 >= 0 && grid[i - 1].charAt(j) == 'P')
						slon++;
					else if (i + 1 < n && grid[i + 1].charAt(j) == 'P')
						slon++;
					else if (j + 1 < m && grid[i].charAt(j + 1) == 'P')
						slon++;
					else if (j - 1 >= 0 && grid[i].charAt(j - 1) == 'P')
						slon++;
				}
		System.out.print(slon);
	}

}
