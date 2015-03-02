package Hard;
import java.util.Scanner;

public class C_Table_Decorations {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		int r = x.nextInt(), g = x.nextInt(), b = x.nextInt();

		long slon = Math.min(Math.min(r, b), g);
		long temp, temp2;

		if (slon == r) {
			temp2 = Math.max(g, b) - slon;
			temp = Math.min(g, b) - slon;
		} else if (slon == b) {
			temp2 = Math.max(g, r) - slon;
			temp = Math.min(g, r) - slon;
		} else {
			temp2 = Math.max(r, b) - slon;
			temp = Math.min(r, b) - slon;
		}
		
		while (true) {
			
			if (temp == 0 || temp2 == 0 || (temp2 == 1 && temp == 1))
				break;
			
			System.out.println(temp + " " + temp2 +" "+ slon );
			
			slon += Math.min(temp2 / 2, temp);
			 
			temp -= Math.min(temp2 / 2, temp);
			
			temp2 -= Math.min( (temp2 / 2) * 2, temp * 2);
			
			if (temp > temp2){
				long t = temp2;
				temp2 = temp;
				temp = t;
			}

		}

		System.out.print(slon);

	}

}
