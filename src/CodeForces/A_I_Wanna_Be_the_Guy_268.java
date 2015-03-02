package CodeForces;
import java.util.Scanner;

public class A_I_Wanna_Be_the_Guy_268 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), p;
		int[] line = new int[105];
		p = x.nextInt();
		for (int i = 0; i < p ; i++)
			line[x.nextInt()]++;
		p = x.nextInt();
		for (int i = 0; i < p ; i++)
			line[x.nextInt()]++;
		p = (n*n) /2 - n/2 +n;
		for (int i = 1 ; i <= n ; i++)
			if (line[i] > 0)
				p-=i;
		if (p == 0)
			System.out.print("I become the guy.");
		else
			System.out.print("Oh, my keyboard!");
	}

}
