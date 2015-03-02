package SPOJ;
import java.io.PrintWriter;
import java.util.Scanner;


public class BinarySearch {
	//static ArrayList<Integer> list = new ArrayList<Integer>();
	static int[] list = new int[100010];
	static public int n , q ;
	static int BS (int num) {
		int f = 0 , l = n-1, m ;
		if (num > list[n-1])
			return -1;
		else if (num == list[n-1])
			return n-1;
		else if (num < list[0])
			return -1;
		else if (num == list[0])
			return 0;
		while (f <= l)
		{
			m = (f + l)/2;
			if (num == list[m])
				return m;
			else if (num > list[m])
				f = m + 1;
			else
				l = m - 1;
		}
		return -1;
		
	}
	static public void main (String arr[])
	{
		PrintWriter out = new PrintWriter(System.out);
		Scanner x = new Scanner (System.in);
		n = x.nextInt();
		q = x.nextInt();
		
		for (int i = 0; i < n; i++)
			list[i] = x.nextInt();
		
		for (int i = 0 ; i < q; i++)
			out.println(BS(x.nextInt()));
		
		out.close();
		
	}

}
