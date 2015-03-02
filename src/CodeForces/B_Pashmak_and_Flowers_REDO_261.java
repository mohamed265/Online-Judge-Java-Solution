package CodeForces;

import java.util.Scanner;


public class B_Pashmak_and_Flowers_REDO_261 {
	public static void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		double n = x.nextInt(), min = Integer.MAX_VALUE , max  = Integer.MIN_VALUE , temp , minCount = 1 , maxCount = 1;
		for (int i = 0 ; i < n ; i++)
		{
			temp = x.nextInt();
			if (temp > max)
			{
				max = temp;
				maxCount = 1;
			}
			else if (temp == max)
				maxCount++;
			
			if (temp < min)
			{
				min = temp;
				minCount = 1;
			}
			else if (temp == min)
				minCount++;
		}
		System.out.print( (long) (max-min) + " " +  (max-min == 0 ? (long) (  (maxCount * maxCount) / 2 - (maxCount/2) ) : (long) maxCount * (long) minCount ));
	
			
	}
	

}
