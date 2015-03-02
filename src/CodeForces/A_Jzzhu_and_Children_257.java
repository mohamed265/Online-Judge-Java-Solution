package CodeForces;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Jzzhu_and_Children_257 {
	static public void main(String arr[]) {
		ArrayList<Integer> candies = new ArrayList<Integer>(), order = new ArrayList<Integer>();
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt(), temp;
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			if (temp > m) {
				order.add(i + 1);
				candies.add(temp - m);
			}
		}
		// for (int i = 0 ; i <order.size();i++)
		// System.out.println(order.get(i) + " " + candies.get(i));
		if (order.size() == 0)
			System.out.print(n);
		else if (order.size() == 1)
			System.out.print(order.get(0));
		else {
			while (order.size() != 1) {
				if (candies.get(0) > m) {
					candies.add(candies.get(0) - m);
					order.add(order.get(0));
					candies.remove(0);
					order.remove(0);
				} else {
					candies.remove(0);
					order.remove(0);
				}
			}
			System.out.print(order.get(0));
		}
	}

}
