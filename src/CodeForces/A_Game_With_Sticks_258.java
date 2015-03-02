package CodeForces;

import java.util.Scanner;

public class A_Game_With_Sticks_258 {
	public static void main (String arr[])
	{
		Scanner x = new Scanner(System.in);
		int n = x.nextInt() , m = x.nextInt();
		int temp = Math.min(n, m);
		if (temp%2 == 0)
			System.out.print("Malvika");
		else
			System.out.print("Akshat");
	}

}
