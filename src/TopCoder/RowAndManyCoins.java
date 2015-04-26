package TopCoder;
import java.util.Scanner;

/*
 * Mar 3, 2015 6:01:50 PM
 * mohamed265
 */

public class RowAndManyCoins {

	public static String getWinner(String cells) {
		int A = 0, B = 0;
		char curent = '.';
		cells += '.';
		for (int i = 0; i < cells.length(); i++) {
			if (curent != cells.charAt(i)) {
				if (curent == 'A') {
					A++;
					curent = 'B';
				} else if (curent == 'B') {
					B++;
					curent = 'A';
				} else {
					curent = cells.charAt(i);
				}
			}
		}
		//System.out.println(A + " " + B);
		return B > A ? "Bob" : "Alice";
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println(getWinner("BBBB"));
	}
}
