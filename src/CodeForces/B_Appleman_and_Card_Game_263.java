package CodeForces;

import java.util.Collections;
import java.util.Scanner;


public class B_Appleman_and_Card_Game_263 {
	// 65 // 90
	static int [] map = new int [30];
	
	static int index ()
	{
		int i = 0 , min = Integer.MIN_VALUE , minIndex = 0;
		for (; i < 30 ; i++)
		if (map[i] > min ){
			minIndex = i;
			min = map[i];
		}
		return minIndex;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		//System.out.print((int)'A' + " " + (int) 'Z');
		int n = x.nextInt() ,  k = x.nextInt() , ind;
		long res = 0;
		String line = x.next();
		for ( int i = 0 ; i < n ; i++)
			map[line.charAt(i)-'A']++;
		 
		while (k > 0){
			ind = index();
			if (k >= map[ind])
				{
					k-=map[ind];
					res += ((long) map[ind]*map[ind]);
					map[ind] = 0;
					
				}
			else
			{	
				res += ((long) k*k);
				k=0;
			}
		}
		System.out.print(res);
	}

}
