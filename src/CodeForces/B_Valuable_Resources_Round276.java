package CodeForces;
import java.util.Scanner;

public class B_Valuable_Resources_Round276 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		long n = x.nextInt(), tempX, tempY;
		long maxX = Long.MIN_VALUE, minX = Long.MAX_VALUE, maxY = Long.MIN_VALUE, minY = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			tempX = x.nextLong();
			tempY = x.nextLong();

			maxX = Math.max(maxX, tempX);
			minX = Math.min(minX, tempX);

			maxY = Math.max(maxY, tempY);
			minY = Math.min(minY, tempY);
		}
		tempX = maxX - minX;
		tempY = maxY - minY;

		n = Math.max(tempX, tempY);
		
		System.out.println(n * n);

	}

}
