package CodeForces;

import java.util.Scanner;


public class A_Rewards_256 {
	static public void main(String ar[])
	{
		Scanner x = new Scanner(System.in);
		int a1 = x.nextInt() , a2 = x.nextInt() , a3 = x.nextInt() ,
			b1 = x.nextInt() , b2 = x.nextInt() , b3 = x.nextInt() ,
			n = x.nextInt();
		int res =  (a1+a2+a3)/5  +  ( (a1+a2+a3)%5 > 0 ? 1 :0);
			res += ( ( (b1+b2+b3)/10) + (((b1+b2+b3)%10 > 0 ? 1 :0)) );
		System.out.print( (res <= n ?"YES":"NO"));
	}

}
