package CodeForces;
import java.util.Scanner;


public class A_Caisa_and_Sugar_264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
		float n = x.nextInt(), s = x.nextInt() , temp1  , temp2 , sweet = -1    ;
		for (int i = 0 ; i < n ; i++)
		{
			temp1 = x.nextInt();
			temp2 = x.nextInt();
			
			if (temp2 == 0 && temp1 <= s )
				sweet = Math.max(sweet, 0) ;
			else if (temp1 + temp2/100  <= s )
				sweet = Math.max(sweet, 100 - temp2) ;
				
			//System.out.println(sweet + " *");
			
		}
    	System.out.print((int)sweet);
		

	}

}
