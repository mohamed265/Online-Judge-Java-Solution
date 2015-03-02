package CodeForces;
import java.util.Scanner;


public class B_Taxi_VK {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int slo = 0 , x1 = 0, x2 = 0 , x3 = 0 , temp , n = x.nextInt();
		for (int i = 0 ; i < n ; i++){
			temp = x.nextInt();
			if (temp == 4)
				slo++;
			else if (temp == 3)
				x3++;
			else if (temp == 2)
				x2++;
			else
				x1++;
		}
		slo += x2/2;
		x2 %= 2;
		
		if (x2 == 1){
			slo++;
			if (x1>=2)
				x1-=2;
			else if (x1>=1)
				x1--;
		}
		
		slo += x3;
		
		if (x1 > x3) {
			x1 -= x3;
			slo += x1/4;
			if (x1 % 4 > 0)
				slo++;
		}
		
		System.out.print(slo);
	}

}
