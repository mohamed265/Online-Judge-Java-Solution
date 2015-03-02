package Hard;
import java.util.Scanner;

public class Snakes {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		final long EROR = 10007;
		long t = x.nextInt(), N, M, V, A, B, len, slon = 0;

		for (int j = 1; j <= t; j++) {
			N = x.nextInt();
			M = x.nextInt();
			V = x.nextInt();
			A = x.nextInt();
			B = x.nextInt();
			len = N * M;
			slon = 0;

			for (int i = 0; i < len; i++) {
				slon += V;
				V = (V * A + B) % EROR;
			}

			System.out.println("Case " + j + ": " + slon);
		}
	}

}
