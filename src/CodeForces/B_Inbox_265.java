package CodeForces;
import java.util.Scanner;


public class B_Inbox_265 {
	
	static int [] num = new int [1010];
	static int [] grid = new int [1010];
	static int n;
	static boolean te = false;
	
	static int solve (){
		 int res = 0 , help = -1;
		 for (int i = 0 ; i < n ; i++){
			 if (num[i] == 1 )
				 {
				 	if (help == 1)
				 		res++;
				 	res++;
				 	help = 0;
				 }
			 else {
				 if (help == 0)
					 help++;
				
			 }
		 }
			 
		 return res;
	}
	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		 n = x.nextInt();
		 int temp = 0 ;
		for (int i = 0 ; i < n ; i++){
				num[i] = x.nextInt();
				temp += num[i];
		}
		
		
		if (temp==0)
			System.out.print(0);
		else if (temp == 1)
			System.out.print(1);
		else if (temp == n)
			System.out.print(n );
		else
			System.out.print(solve());
		

	}

}
/*
 *  else if (help == 1)
					 {
					 	res++;
					 	help = -10000;
					 }*/
