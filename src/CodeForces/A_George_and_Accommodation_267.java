package CodeForces;
import java.util.Scanner;


public class A_George_and_Accommodation_267 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt() , p, q , slon = 0;
		for ( int i = 0 ; i < n ; i++){
			p = x.nextInt();
			q = x.nextInt();
			if (q-p >= 2)
				slon++;
		}
		System.out.print(slon);

	}

}
