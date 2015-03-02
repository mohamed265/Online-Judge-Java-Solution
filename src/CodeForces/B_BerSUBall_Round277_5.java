package CodeForces;
import java.util.Scanner;

public class B_BerSUBall_Round277_5 {

	public static int[] boy = new int[102], girl = new int[102];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), max = 0;
		for (int i = 0; i < n; i++) {
			boy[x.nextInt()]++;
		}
		int m = x.nextInt();
		for (int i = 0; i < m; i++) {
			girl[x.nextInt()]++;
		}
		for (int i = 0; i < 101; i++) {
			if (boy[i] != 0) {
				if (girl[i - 1] > 0) {
					boy[i]--;
					girl[i - 1]--;
					max++;
					i--;
				} else if (girl[i] > 0) {
					boy[i]--;
					girl[i]--;
					max++;
					i--;
				} else if (girl[i + 1] > 0) {
					boy[i]--;
					girl[i + 1]--;
					max++;
					i--;
				}
			}
		}
		System.out.println(max);

	}

}
