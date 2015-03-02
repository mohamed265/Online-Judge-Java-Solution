package CodeForces;
import java.util.Scanner;


public class B_Fedor_and_New_Game_267 {
	static String toBinry(int num ,int n){
		String res = "";
		while(num > 0){
			if (num % 2 == 0)
				res = "0" + res;
			else
				res = "1" + res;
			num/=2;
		}
		for ( int i = res.length() ; i < n ; i ++)
			res = "0" + res;
		return res;
	}
	public static void main(String[] args) {
		Scanner x= new Scanner (System.in);
		 int n = x.nextInt() , m = x.nextInt() , k = x.nextInt() , slon = 0 , temp;
		 String [] rep = new String[m+1];
		 for (int  i = 0 ; i < m+1 ; i++)
			 rep[i] = toBinry(x.nextInt() , n);
		 
		 for ( int i = 0 ; i < m ; i++){
			 temp = k;
			 for (int j = 0; j < n; j++) {
				if (rep[i].charAt(j) !=  rep[m].charAt(j))
					temp--;
				if (temp < 0)
					break;
			}
			 if (temp >= 0)
				 slon++;
		 }
		 System.out.print(slon);
	}

}
