package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Anton_and_Letters_253 {

	public static void main(String arr[]) {
		Set<Character> letters = new HashSet<Character>();
		Scanner x = new Scanner(System.in);
		String line = x.nextLine();
		for (int i = 0; i < line.length(); i++)
			if (Character.isLetter(line.charAt(i)))
				letters.add(line.charAt(i));

		System.out.print(letters.size());

	}

}
