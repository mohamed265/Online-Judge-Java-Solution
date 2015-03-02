package CodeForces;
import java.util.Scanner;

public class Round134_A_Ice_Skating {

	static int size;
	final static int MAX_SIZE = 101;
	static int[] X = new int[MAX_SIZE], Y = new int[MAX_SIZE];
	static boolean[] temp = new boolean[MAX_SIZE];

	static void dfs(int i) {
		if (i == MAX_SIZE)
			return;
		temp[i] = true;
		for (int j = 1; j < size; j++) {
			if ((X[i] == X[j] || Y[i] == Y[j]) && !temp[j]) {
				dfs(j);
			}
		}
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		size = x.nextInt();
		for (int i = 0; i < size; i++) {
			X[i] = x.nextInt();
			Y[i] = x.nextInt();
		}
		int slon = -1;
		for (int i = 0; i < size; i++) {
			if (!temp[i]) {
				slon++;
				dfs(i);
			}
		}
		System.out.println(slon);
	}
}