package CodeForces;
import java.util.Scanner;

/*
 * Feb 28, 2015 2:50:52 PM
 * mohamed265
 */

public class Round294_A_A_and_B_and_Chess {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int wite = 0, black = 0;
		String temp;
		for (int i = 0; i < 8; i++) {
			temp = x.next();
			for (int j = 0; j < 8; j++) {
				if (Character.isLowerCase(temp.charAt(j))) {

					if (temp.charAt(j) == 'q')
						black += 9;
					else if (temp.charAt(j) == 'r')
						black += 5;
					else if (temp.charAt(j) == 'b')
						black += 3;
					else if (temp.charAt(j) == 'n')
						black += 3;
					else if (temp.charAt(j) == 'p')
						black += 1;

				} else if (Character.isUpperCase(temp.charAt(j))) {
					if (temp.charAt(j) == 'Q')
						wite += 9;
					else if (temp.charAt(j) == 'R')
						wite += 5;
					else if (temp.charAt(j) == 'B')
						wite += 3;
					else if (temp.charAt(j) == 'N')
						wite += 3;
					else if (temp.charAt(j) == 'P')
						wite += 1;

				}
			}
		}
		if (black == wite)
			System.out.println("Draw");
		else if (black > wite)
			System.out.println("Black");
		else
			System.out.println("White");

	}
}
