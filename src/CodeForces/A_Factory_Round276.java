package CodeForces;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class A_Factory_Round276 {

	public static void main(String[] arss) {
		Scanner x = new Scanner(System.in);
		long a = x.nextLong(), m = x.nextLong(), temp;
		HashSet<Long> set = new HashSet<Long>();
		while (true) {
			temp = a - ( (a / m) * m);
			//System.out.print(temp);
			if (set.contains(temp)) {
				System.out.println("No\n");
				return;
			} else {
				set.add(temp);
				if (temp == 0) {
					System.out.println("Yes\n");
					return;
				}
				a += (temp);
			}
		}
	}
}
