package CodeForces;
import java.util.Scanner;

public class A_New_Year_Candles {
	public static int temp = 0;

	public static int fun(int a, int b) {
		int slon = 0;
		while (a != 0) {
			slon += (a / b) * b;
			temp += a % b;
			a /= b;
		}
		return slon;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a = x.nextInt(), b = x.nextInt();
		int slon = fun(a, b);
		while (temp > 0) {
			if (temp % b == temp) {
				slon += temp;
				break;
			}
			a = temp;
			temp = 0;
			slon += fun(a, b);
		}
		System.out.println(slon);
	}

}
