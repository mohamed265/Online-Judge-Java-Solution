package CodeForces;
import java.util.Scanner;


public class A_inc_ARG_265 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt()   , ma = 0;
		String line = x.next() ;
		for (int i = 0 ; i < n ; i++)
			if (line.charAt(i) == '1')
				ma++;
			else
				{
					ma++;
					break;
				}
		System.out.print(ma);
			
		//System.out.print(line);

	}

}
