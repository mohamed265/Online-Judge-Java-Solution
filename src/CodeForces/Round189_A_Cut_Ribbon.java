package CodeForces;
import java.util.Scanner;

/*
 * Jan 31, 2015 9:35:44 AM
 * mohamed265
 */

public class Round189_A_Cut_Ribbon {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), a = x.nextInt(), b = x.nextInt(), c = x.nextInt(), slon = n, temp, temp2 , temp3;
		if (a != 1 && b != 1 && c != 1) {
			slon = -1;
			int aa = n / a + 1, bb = n / b + 1, cc = n / c + 1;
			for (int i = 0; i < aa; i++) {
				for (int j = 0; j < bb; j++) {
					temp = i * a + j * b;
					temp2 = n - temp;
					if (temp2 % c == 0 && temp2 / c + i + j > slon && temp2 > 0){
					//	System.out.println( i + " " + j + " " + (temp2 / c));
						slon = i + j + temp2 / c;
					} else if (temp2 == 0 && i + j > slon){
						slon = i + j;
					}
					/*
					for (int k = 0; k < cc; k++) {
						temp2 = temp + k * c;
						if (temp2 == n && temp3 + k > slon) {
							// System.out.println(i + " " + j + " " +
							// k);
							slon = temp3 + k;
						} else if (temp2 > n)
							break;
					}
				}*/
				
				}

			}
		}
		System.out.println(slon);
	}
}