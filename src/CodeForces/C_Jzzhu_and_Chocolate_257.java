package CodeForces;
import java.math.BigInteger;
import java.util.Scanner;
/*
public class C_Jzzhu_and_Chocolate {

	static long n  , m , k;
	static public void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		// 987283748 999283748 589766888

		 
		 n = x.nextInt();
		 m = x.nextInt();
		 k = x.nextInt();

		if (n > m) {
			long t = n;
			n = m;
			m = t;
		}

		if (n + m - 2 < k)
			System.out.print(-1);
		else if (n + m - 2 == k)
			System.out.print(1);
		else if ((n * m) % (k + 1) == 0)
			System.out.print((n * m) / (k + 1));
		else if (k + 1 == n)
			System.out.print(m);
		else if (k + 1 == m)
			System.out.print(n);
		else {
			if (k < n)
				System.out.print(res(1,k+1));
			else if (k >= n && k < m)//&&  k < m)
				System.out.print(res(1,k+1));
			else
				System.out.print(res(k + 2 -m,m));
			
			

		}
	}
	static long res (long x ,long y)
	{
		return (long) (Math.floor(n/x) * Math.floor(m/y)) ;
	}
}
 */
public class C_Jzzhu_and_Chocolate_257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        if (k > n + m - 2) {
            System.out.println(-1);
            return;
        }
        long res = 0;
        if (k < n) 
            res = Math.max(res, n / (k + 1) * m);
        else
            res = Math.max(res, m / (k - (n - 1) + 1));
        if (k < m) 
            res = Math.max(res, m / (k + 1) * n);
        else 
            res = Math.max(res, n / (k - (m - 1) + 1));
        System.out.println(res);
    }
} 