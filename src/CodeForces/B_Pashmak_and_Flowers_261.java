package CodeForces;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class B_Pashmak_and_Flowers_261 {
	//static int num[] = new int [1000000001];
	public static void main(String arr[]) {
		Map<Integer,Integer> num = new HashMap<Integer,Integer>();
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), min = Integer.MAX_VALUE , max  = Integer.MIN_VALUE , temp;
		for (int i = 0 ; i < n ; i++)
		{
			temp = x.nextInt();
			min = Math.min(min , temp);
			max = Math.max(max , temp);
			int count = num.containsKey(temp) ? num.get(temp) : 0;
			num.put(temp, count + 1);
		}
		System.out.print( (max-min) + " " +  (max-min == 0 ? fact( (long) num.get(min)-1) : (long) num.get(min) * (long) num.get(max) ));
		//num[min] * num[max]) ); 
			
	}
	static long fact (long x)
	{
		long res = 0;
		while (x > 0)
		{
			res += x;
			x--;
		}
		return res;
	}

}
