package CodeForces;
import java.util.Scanner;

public class B_Caisa_and_Pylons_264 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), pre, energy = 0, temp , dif;
		long doller = pre = x.nextInt();

		for (int i = 1; i < n; i++) {
			temp = x.nextInt();
			if (temp < pre)
				energy += pre - temp;
			else if (temp > pre) {
				dif = temp - pre;
				if (dif <= energy)
					energy -= dif;
				else {
					doller += dif - energy;
					energy = 0;
				}
			}
			pre = temp;
		}
		System.out.print(doller);

	}

}
