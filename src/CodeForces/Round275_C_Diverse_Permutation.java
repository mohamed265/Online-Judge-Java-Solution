package CodeForces;
import java.util.Scanner;

public class Round275_C_Diverse_Permutation {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), k = x.nextInt() ,temp = 1, tempk = k + 1;
		int[] set = new int[k + 2];
		
		for (int i = 1; i <= k + 1; i += 2) {
			set[i] = temp;
			temp++;
		}

		for (int i = 2; i <= k + 1; i += 2) {
			set[i] = tempk;
			tempk--;
		}
		for (int i = 1; i <= k + 1; i++) {
			System.out.print(set[i] + " ");
		}
		for (int i = k + 2; i <= n; i++) {
			System.out.print(i + " ");
		}

	}
}
