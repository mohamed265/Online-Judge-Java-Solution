package CodeForces;
import java.util.Scanner;

public class A_Dreamoon_and_Stairs_272 {

	static boolean ch(int num, int target) {
		int temp2 = num, temp1 = 0;
		while (temp2 >= 0) {
			if (temp2 * 2 + temp1 == target)
				return true;
			else {
				temp2--;
				temp1++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt(), slon = -1;

		if (n / m > 0) {
			int temp = m;
			while (temp <= n) {
				if (ch(temp, n)) {
					slon = temp;
					break;
				}
				temp += m;
			}

		}

		System.out.println(slon);
	}

}
