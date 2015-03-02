package CodeForces;
import java.util.Scanner;

public class A_Giga_Tower_Round278 {

	static boolean che(long x) {

		int temp;
		while (x != 0) {
			temp = (int) (x % 10);
			// System.out.println(temp);
			if (temp == 8 || temp == -8)
				return true;
			x /= 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long num = x.nextInt(), value = num;

		value++;

		while (!che(value)) {
			// System.out.println("Value" + value);
			value++;
		}

		// System.out.println(value + " " + num);
		System.out.print(value - num);

	}

}