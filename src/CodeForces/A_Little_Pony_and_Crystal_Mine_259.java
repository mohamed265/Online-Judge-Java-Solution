package CodeForces;
import java.util.Scanner;

public class A_Little_Pony_and_Crystal_Mine_259 {
	static public void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		for (int i = 0; i < n / 2; i++) {
			int va = i * 2 + 1, af = (n - va) / 2;
			for (int j = 0; j < n; j++) {
				if (j < af)
					System.out.print('*');
				else {
					if (va != 0) {
						va--;
						System.out.print('D');
					} else
						System.out.print('*');
				}

			}
			System.out.println();
		}

		for (int j = 0; j < n; j++)
			System.out.print('D');
		System.out.println();
		for (int i = 0; i < n / 2; i++) {
			int va = n -  i * 2 - 2 , af = (n - va) / 2;
			for (int j = 0; j < n; j++) {

				if (j < af)
					System.out.print('*');
				else {
					if (va != 0) {
						va--;
						System.out.print('D');
					} else
						System.out.print('*');
				}

			}
			System.out.println();

		}

	}

}
