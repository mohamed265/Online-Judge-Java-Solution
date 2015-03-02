package CodeForces;
import java.util.Scanner;

/*
 * Feb 9, 2015 7:15:31 PM
 * mohamed265
 */

public class Round255_B_DZY_Loves_Strings {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String line = x.next();
		int k = x.nextInt(), max = -1;
		int[] grid = new int[26];
		for (int i = 0; i < 26; i++) {
			grid[i] = x.nextInt();
			max = Math.max(max, grid[i]);
		}
		long solu = 0;
		for (int i = 0; i < line.length(); i++) {
			solu += grid[line.charAt(i) - 'a'] * (i + 1);
		}
		long last = line.length() + k + 1, fi = line.length() ;
		
		//System.out.println(((last - fi - 1) * ((float) (fi + last) / 2)));
		
		 solu += ((last - fi - 1) * ((double) (fi + last) / 2)) * max;
		 
		// System.out.println(((last - fi - 1) * ((float) (fi + last) / 2)) *
		// max);
//		for (int i = line.length() + 1; i < line.length() + k + 1; i++) {
//			solu += max * i;
//		}
		System.out.println(solu);
	}
}
