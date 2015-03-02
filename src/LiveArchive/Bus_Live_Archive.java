package LiveArchive;
import java.util.Scanner;

public class Bus_Live_Archive {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt(), n;
		double slon = 0;
		for (int i = 0; i < t; i++) {
			slon = 0;
			n = x.nextInt();

			for (int j = 0; j < n; j++) {
				slon += .5;
				slon *= 2;
			}

			System.out.println((long)slon);

		}

	}

}
