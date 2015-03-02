package LiveArchive;
import java.util.Scanner;

public class Generations_of_Tribbles_Live_Archive {

	static long[] list = new long[68];

	public static void main(String[] args) {
		list[0] = list[1] = 1;
		list[2] = 2;
		list[3] = 4;
		for (int i = 4; i < 68; i++)
			list[i] = list[i - 1] + list[i - 2] + list[i - 3] + list[i - 4];
		// for (int i = 0 ; i < 68 ; i++)
		// System.out.print(list[i] + " ");
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(list[x.nextInt()]);
		}
	}

}
