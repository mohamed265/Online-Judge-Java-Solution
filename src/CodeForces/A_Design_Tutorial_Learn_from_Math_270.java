package CodeForces;
import java.util.Scanner;

public class A_Design_Tutorial_Learn_from_Math_270 {

	static boolean notPri(int x) {
		if (x == 2 || x == 1)
			return false;
		else if (x % 2 == 0)
			return true;
		for (int i = 3; i < x; i += 2)
			if (x % i == 0)
				return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		// /System.out.print(notPri(5));
		int num = x.nextInt();
		for (int i = 4; i < num; i++)
			if (notPri(i) && notPri(num - i)) {
				System.out.println(i + " " + (num - i));
				return;
			}

	}

}
