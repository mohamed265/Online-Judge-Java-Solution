package Hard;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Round4_D_Mysterious_Present {

	public static ArrayList<envelope> list = new ArrayList<>(),
			FinalSlon = new ArrayList<>();
	public static ArrayList<ArrayList<envelope>> Save = new ArrayList<ArrayList<envelope>>();
	public static int n, w, h;

	public static class envelope implements Comparator<envelope> {
		public int W, H, I;

		envelope() {

		}

		envelope(int w, int h, int i) {
			W = w;
			H = h;
			I = i;
		}

		envelope(envelope temp) {
			W = temp.W;
			H = temp.H;
			I = temp.I;
		}

		@Override
		public int compare(envelope e1, envelope e2) {
			return (e1.W == e2.W ? e1.H - e2.H : e1.W - e2.W);
		}

		public boolean isSmall(envelope temp) {
			return W < temp.W && H < temp.H;
		}

		public String toString() {
			return W + " " + H + " " + I + "\n";
		}
	}

	public static void save(ArrayList<envelope> slon, int i) {
		 System.out.println("Test save " + slon.size());
		// System.out.println(slon);
		// boolean flag = false;
		// Save.get(i) slon;
		for (int j = 0; j < slon.size(); j++) {
			for (int k = j; k < slon.size(); k++) {
				Save.get(slon.get(j).I).add(slon.get(k));
			}
		}

		// System.out.println(Save);
	}

	public static ArrayList<envelope> dp(ArrayList<envelope> slon, int i) {
		if (i >= n) {
			return slon;
		}

		if (Save.get(i).size() != 0) {
			System.out.println("Test " + i);
			return Save.get(i);
		}

		ArrayList<envelope> temp = new ArrayList<>();
		for (int j = 0; j < slon.size(); j++) {
			temp.add(new envelope(slon.get(j)));
		}
		if (list.get(i).W > w && list.get(i).H > h) {

			if (slon.size() == 0
					|| slon.get(slon.size() - 1).isSmall(list.get(i))) {
				temp.add(list.get(i));
				// temp.addAll(dp(temp, i + 1));
				temp = dp(temp, i + 1);
				save(temp, i);

			} else {
				System.out.println("Test else " + i);
				ArrayList<envelope> temp1 = new ArrayList<>();
				for (int j = 0; j < slon.size() - 1; j++) {
					if (slon.get(j).isSmall(list.get(i)))
						temp1.add(new envelope(slon.get(j)));
				}
				temp1.add(list.get(i));

				// temp1.addAll(dp(temp1, i + 1));
				// slon.addAll(dp(slon, i + 1));
				temp1 = dp(temp1, i + 1);
				slon = dp(slon, i + 1);

				if (temp1.size() > slon.size()) {
					temp = temp1;
				} else {
					temp = slon;
				}

				save(temp, i);
			}
		} else {
			temp = dp(temp , i + 1);
		}

		return temp;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int tempW, tempH;
		Save.add(new ArrayList<envelope>());
		n = x.nextInt();
		w = x.nextInt();
		h = x.nextInt();
		for (int i = 0; i < n; i++) {
			tempW = x.nextInt();
			tempH = x.nextInt();
			Save.add(new ArrayList<envelope>());
			// if (tempW > w && tempH > h)
			list.add(new envelope(tempW, tempH, i + 1));
		}
		// n = list.size();
		Collections.sort(list, new envelope());
		// System.out.println(list);
		FinalSlon = dp(new ArrayList<envelope>(), 0);
		System.out.println(FinalSlon.size());
		for (int i = 0; i < FinalSlon.size(); i++) {
			System.out.print(FinalSlon.get(i).I + " ");
		}

	}
}
// 45 6134 8495 9045 8632 4145 4991 5368 5303 6245 4894 8529 6378 5797 6165 5444
// 6826 7091 4030 6680 9984 4155 6711 5100 5977 7333 6514 9729 4141 8171 6185
// 6146 6016 4488 7588 9333 4921 7368 6350 6552 8552 9900 8327 3310 7281 6402
// 5749 6124 4381 8190 3834 7421 3816 3475 4977 6239 6577 9277 4139 4037 5329
// 6808 7446 7679 5283 6775 3023 6777 8500 5921 6975 4501 4383 4623 8409 7070
// 6430 9429 8736 7353 7760 3942 3683 4859 8424 6348 7379 9043 9054 9012 7114
// 7050 9454
