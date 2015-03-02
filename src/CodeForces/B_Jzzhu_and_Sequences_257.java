package CodeForces;
import java.util.Scanner;

public class B_Jzzhu_and_Sequences_257 {
	static public void main(String arr[]) {
		int[] num = new int[6];
		Scanner x = new Scanner(System.in);
		num[0] = x.nextInt();
		num[1] = x.nextInt();
		int n = x.nextInt();
		n--;
		for (int i = 2; i < 6; i++)
			num[i] = num[i - 1] - num[i - 2];
		
		int res  = num[n % 6] % 1000000007;
		
		while(res<0)
			 res += 1000000007;
		
		System.out.print(res);
	}

}
//(Math.abs(num[n % 6]) % 1000000007)
// 