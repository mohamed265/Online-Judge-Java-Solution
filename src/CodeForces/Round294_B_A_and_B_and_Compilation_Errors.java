package CodeForces;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Feb 28, 2015 2:56:03 PM
 * mohamed265
 */

public class Round294_B_A_and_B_and_Compilation_Errors {
	static StringTokenizer st;
	static BufferedReader br;
	static PrintWriter pw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				System.out)));

		long n = nextInt(), temp = 0, sum = 0, temp1 = 0;

		for (int i = 0; i < n; i++) {
			sum += nextInt();

		}
		for (int i = 0; i < n - 1; i++) {
			temp += nextInt();
		}
		temp = sum - temp;
		System.out.println(temp);
		for (int i = 0; i < n - 2; i++) {
			temp1 += nextInt();
		}

		System.out.println(sum - temp - temp1);
		pw.close();
	}

	private static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	private static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
}
