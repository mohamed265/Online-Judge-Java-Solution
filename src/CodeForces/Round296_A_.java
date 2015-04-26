package CodeForces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Mar 17, 2015 6:23:27 PM
 * mohamed265
 */

public class Round296_A_ {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long slon = 0, temp;
		long[] arr = new long[2];
		arr[0] = x.nextLong();
		arr[1] = x.nextLong();
		while (arr[0] != 0 && arr[1] != 0) {
			Arrays.sort(arr);
			temp = arr[1] / arr[0];
			arr[1] -= temp * arr[0];
			slon += temp;
			if (temp == 0)
				break;
		}
		System.out.println(slon);
	}
}
