package CodeForces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * Jan 30, 2015 11:58:52 AM
 * mohamed265
 */

public class Round186_C_Ilya_and_Matrix {

	public static void main(String[] args) throws IOException {
		// Scanner x = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long size = Integer.parseInt(br.readLine()), ts = size, temp, next, slon = 0;
		if (size == 1) {
			System.out.println(br.readLine());
			return;
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Long> list = new ArrayList<>((int) size);
		list.add((long) 0);

		for (int i = 0; i < size; i++) {
			temp = Long.parseLong(st.nextToken());// x.nextLong();
			slon += temp;
			list.add(temp);
		}

		temp = 0;
		ts /= 4;
		next = 3 * ts + 1;
		Collections.sort(list);
		for (int i = (int) (size / 4) * 3 + 1; i <= size; i++) {
			if (i == next) {
				ts /= 4;
				next += (ts * 3);
				temp++;
			}
			// System.out.println(i + " " + next + " " + ts + " " + temp);
			slon += (temp * list.get(i));
		}

		System.out.println(slon);
	}
}
