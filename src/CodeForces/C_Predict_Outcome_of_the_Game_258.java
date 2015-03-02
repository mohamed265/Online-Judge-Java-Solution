package CodeForces;
import java.util.Scanner;


public class C_Predict_Outcome_of_the_Game_258 {

	public static void main(String[] args) {
		 
		Scanner x = new Scanner(System.in);
		long t = x.nextLong(),n , k , d1 , d2;
		for (int i = 0 ; i < t ; i++){
			n = x.nextLong();
			k = x.nextLong();
			d1 = x.nextLong();
			d2 = x.nextLong();
			k = (long) n / (long) 3;
			System.out.print("K = " + k);
			System.out.print((k > d1 ? "ok" : "oh no" )) ;
			if (d1 > k || d2 > k)
				System.out.println("no");
			else
				System.out.println("yes");
			
		}

	}

}
