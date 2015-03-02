package CodeForces;
import java.util.Scanner;

public class B_Worms_271 {

	 static int [] list = new int [1000010];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int k = x.nextInt(), temp;

	//	ArrayList<Integer>  slon = new ArrayList<Integer>();

		for (int i = 0 , t = 0; i < k; i++) {
			temp = x.nextInt();
			while (temp > 0) {
				temp--;
				list [t] = i + 1;
				t++;
			}
		}
		k = x.nextInt();
		for (int j = 0; j < k; j++) {
			temp = x.nextInt();
			System.out.println(list[temp-1]);
		}

	}

}
