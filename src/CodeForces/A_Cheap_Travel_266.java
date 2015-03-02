package CodeForces;
import java.util.Scanner;


public class A_Cheap_Travel_266 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt() , m = x.nextInt() , a = x.nextInt() , b = x.nextInt();
		if ( n > m)
			System.out.print(Math.min( ( (n/m)*b) + Math.min( (n%m)*a  , b)  , n * a));
		else 
			System.out.print(Math.min( b  , n * a));
		
	}

}
