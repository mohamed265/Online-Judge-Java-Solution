package TopCoder;

public class SRM647_250_PeacefulLine {

	public static String makeLine(int[] x) {

		int[] arr = new int[26];
		for (int i = 0; i < x.length; i++) {
			arr[x[i]]++;
		}
		int last = 0, temp = x.length;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= last) {
				last = arr[i];
			}
		}
		if (last-1 <= (temp - last))
			return "possible";
		else
			return "impossible";
	}

	public static void main(String[] args) {
		int[] x = { 12, 12, 12, 12, 12, 4, 4, 4, 4 };
		System.out.println(makeLine(x));

	}

}
