package CodeForces;
import java.util.Scanner;

public class Round284_A_Watching_a_movie {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), xx = x.nextInt(), temp1, temp, cut = 1, slon = 0;
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			temp1 = x.nextInt() + 1;
			
			while (cut + xx <= temp)
				cut += xx; 
			
			slon += (temp1 - (cut) );
			cut = temp1;
		}
		System.out.println(slon);
	}

}
