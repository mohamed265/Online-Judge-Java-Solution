package CodeForces;
import java.util.Scanner;

public class A_Pashmak_and_Garden_261 {
	public static void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		// -100 100 100 -100
		int x1 = x.nextInt(), y1 = x.nextInt(), x2 = x.nextInt(), y2 = x
				.nextInt(), xScale = Math.abs(x1 - x2), yScale = Math.abs(y1
				- y2);
		//System.out.print(xScale + " " + yScale);
		//if ((x1 + xScale == x2 && y1 + yScale == y2 || x2 + xScale == x1 && y2 + yScale == y1) && 
		if (xScale == yScale)
			System.out.print(x2 + " " + y1 + " " + x1 + " " + y2);
		else if (x1 == x2)
			System.out.print((x1 + yScale) + " " + y1 + " " + (x1 + yScale)
					+ " " + y2);
		else if (y1 == y2)
			System.out.print(x1 + " " + (y1 + xScale) + " " + x2 + " "
					+ (y2 + xScale));
		else
			System.out.print(-1);

	}

}
