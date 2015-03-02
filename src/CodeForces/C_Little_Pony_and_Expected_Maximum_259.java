package CodeForces;
import java.math.BigInteger;
import java.util.Scanner;

/* Expected value for value i 
 * 
 * i power tos number - (i-1) power tos number
 * 
 * */
public class C_Little_Pony_and_Expected_Maximum_259 {

	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		int m = x.nextInt() , n = x.nextInt();
		double slon = 0;
		for (float i = 1; i <= m; i++) {
			slon += (double)  i * (Math.pow(i /m, n) - Math.pow( (i-1) /m , n)) ;// / Math.pow(m, n);
		}
		System.out.print(slon);
		/*double  y = 19;
		//System.out.print(Math.pow(1e5, 1e5));
		
		for (int i = 3 ; i < 42 ; i++)
		{
		 
			y = (double) ( (Math.pow(10, i-1) +  y * (double) 9) );/// Math.pow(10, i) );
			System.out.println(i+ " " +(long) y);
		}
		/*int num = (int) 1e3;
		int [] x = new int [num+1];
		for ( int i = 1 ; i <= num ;i++)
			for (int j = 1; j <= num; j++)
			//	x[(Math.max(i, j))]++;
			 
				for (int j2 = 1 ; j2 <=num ; j2++)
	
			//		System.out.println(  Math.max(Math.max(i, j), j2)+" " + (x[Math.max(Math.max(i, j), j2)]+ 1));
					x[Math.max(Math.max(i, j), j2)]++;
 
		for (int i = 1 ; i <= num ; i++ )
			System.out.println(i + " " +x[i]);
		
		
		int [] y = new int [num+1];
		for ( int i = 1 ; i <= num ;i++)
			for (int j = 1; j <= num; j++)
				for (int j2 = 1 ; j2 <=num ; j2++)
					for (int j3 = 1 ; j3 <=num ; j3++)
					y[Math.max(Math.max(i, j), Math.max(j2, j3))]++;
 
		for (int i = 1 ; i <= num ; i++ )
			System.out.println(i + " " +y[i]);*/
	}

}
