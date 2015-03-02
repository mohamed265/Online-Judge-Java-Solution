package CodeForces;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Team_Olympiad_Round279 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		ArrayList<Integer> one = new ArrayList<Integer>(5000), two = new ArrayList<Integer>(5000), three = new ArrayList<Integer>(5000);
		int n = x.nextInt(), temp;
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			if (temp == 1)
				one.add(i + 1);
			else if (temp == 2)
				two.add(i + 1);
			else
				three.add(i + 1);
		}
		temp = Math.min(one.size(), Math.min(two.size(), three.size()));
		System.out.println(temp);
		for (int i = 0; i < temp; i++) {
			System.out.println(one.get(i) + " " + two.get(i) + " "
					+ three.get(i));
		}

	}

}
