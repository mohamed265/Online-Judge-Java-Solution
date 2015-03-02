package CodeForces;
import java.util.Scanner;

public class A_C_Boredom_260 {
	static long[] list = new long[200010] , in = new  long[200010] ;
	static long n, max = 0;

	public static long maxSum(int i) {
		if (i > max)
			return 0;
		
		if (in[i] != 0)
			return in[i];
		
		long ch1 = maxSum(i + 1);
		long ch2 = maxSum(i + 2) + list[i];
		in[i] = Math.max(ch1, ch2);
		return in[i] ;

	}

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		n = x.nextLong();
		max = 0;
		int min = Integer.MAX_VALUE;
		int temp;
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			max = Math.max(max, temp);
			min = Math.min(min, temp);
			list[temp] += temp;
		//	in [temp] = -1;
		}
		System.out.print(maxSum(min));
		// for (int i = 0 ; i < 200000 ; i++)

	}

}
