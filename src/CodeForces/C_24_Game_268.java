package CodeForces;
import java.util.Scanner;

public class C_24_Game_268 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		if (n < 4)
			System.out.print("NO");
		else if (n % 2 == 0) {
			System.out.println("YES");
			int space = (n - 4) / 2 + 1;
			for (int i = n; i != 4; i -= 2)
				System.out.println(i + " - " + (i - 1) + " = 1");
			System.out.println("4 * 3 = 12");
			for (int i = 0; i < space; i++)
				System.out.println("12 * 1 = 12");
			System.out.println("12 * 2 = 24");
		} else {
			System.out.println("YES");
			int space = (n - 5) / 2;
			for (int i = n; i != 5; i -= 2)
				System.out.println(i + " - " + (i - 1) + " = 1");
			System.out.print("5 + 1 = 6\n6 - 3 = 3\n3 * 4 = 12\n");
			for (int i = 0; i < space; i++)
				System.out.println("12 * 1 = 12");
			System.out.println("12 * 2 = 24");

		}

	}
}
