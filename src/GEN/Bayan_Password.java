package GEN;
import java.util.HashSet;
import java.util.Scanner;

public class Bayan_Password {

	public static void main(String[] args) {
		Scanner x = new Scanner("20.in");
		int t = x.nextInt(), lev;
		String pass;
		for (int i = 1; i <= t; i++) {
			lev = 0;
			pass = x.next();
			HashSet<Character> set = new HashSet<Character>();
			boolean flagDigit = false, flagLatinSmall = false, flagLatinCapital = false, flag = false;
			for (int j = 0; j < pass.length(); j++) {
				set.add(pass.charAt(j));

				if (pass.charAt(j) >= '0' && pass.charAt(j) <= '9') {
					flagDigit = true;

				}
				if (pass.charAt(j) >= 'a' && pass.charAt(j) <= 'z') {
					flagLatinSmall = true;
				}

				if (pass.charAt(j) >= 'A' && pass.charAt(j) <= 'Z') {
					flagLatinCapital = true;
				}

				if (pass.charAt(j) == '!' || pass.charAt(j) == '@'
						|| pass.charAt(j) == '#' || pass.charAt(j) == '$'
						|| pass.charAt(j) == '%' || pass.charAt(j) == '^'
						|| pass.charAt(j) == '&' || pass.charAt(j) == '*'
						|| pass.charAt(j) == '(' || pass.charAt(j) == ')') {
					flag = true;

				}
				//System.out.println(flag);
			}
			if (flagDigit)
				lev++;
		//	System.out.println(lev);
			if (flag)
				lev++;
		//	 System.out.println(lev);
			if (set.size() == pass.length())
				lev++;
		//	 System.out.println(lev);
			if (flagLatinCapital && flagLatinSmall)
				lev += 2;
			else if (flagLatinCapital || flagLatinSmall)
				lev++;
		//	 System.out.println(lev);
			if (pass.length() > 10)
				lev += 2;

			else if (pass.length() >= 6)
				lev++;

	//	 System.out.println(lev);
			if (lev >= 6)
				System.out.println("Case #" + i + ":\nstrong");
			else if (lev < 4)
				System.out.println("Case #" + i + ":\nweak");
			else
				System.out.println("Case #" + i + ":\nnormal ");
		}

	}

}
