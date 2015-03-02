package CodeForces;
import java.util.Scanner;

public class A_Calculating_Function_Round277 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long num = x.nextLong();

		if (num % 2 == 0)
			System.out.print(num / 2);
		else
			System.out.print(((num - 1) / 2) - num);

	}

}
