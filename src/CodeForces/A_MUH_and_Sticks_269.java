package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_MUH_and_Sticks_269 {

	static int[] grid = new int[10];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		for (int i = 0; i < 6; i++)
			grid[x.nextInt()]++;
		boolean flag = false;
		for (int i = 0; i < 10; i++)
			if (grid[i] >= 4) {
				flag = true;
				grid[i] -= 4;

			}
		if (flag) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < 10; i++) {
				if (grid[i] > 0) {
					temp.add(i);
					grid[i]--;
					i--;
				}
			}
			if (temp.get(0) == temp.get(1))
				System.out.println("Elephant");
			else
				System.out.println("Bear");

		} else
			System.out.println("Alien");

	}
}
