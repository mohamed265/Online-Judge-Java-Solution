package CodeForces;
import java.util.Scanner;

public class Round240_C_Mashmokh_and_Numbers {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long n = x.nextInt(), k = x.nextInt();
		if (n == 1){
			if (k == 0)
				System.out.println(12142);
			else {
				System.out.println(-1);
			}
		}
		else if (n / 2 > k)
			System.out.println(-1);
		else {
			long rest = (n / 2) - 1;
			long num = k - rest, num2 = num * 2;
			System.out.print(num + " " + (num2) + " ");
			for (int i = 0, j = 1; i < rest; i++, j += 2) {
				if (j != num && j + 1 != num && j != num2 && j + 1 != num2
						&& j != 100711433 && j + 1 != 100711433)
					System.out.print(j + " " + (j + 1) +" ");
				else
					i--;
			}
			if (n % 2 == 1) {
				System.out.println(100711433);
			}
		}

	}

}
