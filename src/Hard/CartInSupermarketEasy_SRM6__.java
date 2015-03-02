package Hard;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Feb 10, 2015 6:24:57 PM
 * mohamed265
 */

public class CartInSupermarketEasy_SRM6__ {
	static int dp(int k, int min, ArrayList<Integer> slon) {
		System.out.println(slon);
		ArrayList<Integer> temp = new ArrayList<>();
		int num = 0;
		boolean flag = true;
		for (int i = 0; i < slon.size(); i++) {
			if (slon.get(i) == 1) {
				num++;
			} else if (slon.get(i) % 2 == 1)
				temp.add(slon.get(i) - 1);
			else if (slon.get(i) % 2 == 0 && k != 0) {
				if (flag)
				{
					k--;
					flag = false;
				}
				temp.add(slon.get(i) / 2);
				temp.add(slon.get(i) / 2 );

			} else {
				temp.add(slon.get(i) - 1);
			}
		}
		//if (num == slon.size())
	//		min--;

		if (temp.size() == 0)
			return min;
		else
			return dp(k, min + 1, temp);
	}

	public static int calc(int N, int K) {
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(N);
		return dp(K, 0, temp);
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println(calc(45,5));
	}
}
