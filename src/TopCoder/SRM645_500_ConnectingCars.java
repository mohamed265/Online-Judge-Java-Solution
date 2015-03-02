package TopCoder;
public class SRM645_500_ConnectingCars {

	public static long minimizeCost(int[] positions, int[] lengths) {
		int t;
		for (int i = 0; i < lengths.length; i++) {
			for (int j = i + 1; j < lengths.length; j++) {
				if (positions[i] >= positions[j]) {
					t = positions[i];
					positions[i] = positions[j];
					positions[j] = t;

					t = lengths[i];
					lengths[i] = lengths[j];
					lengths[j] = t;
				}
			}
		}
		// for (int i = 0; i < lengths.length; i++) {
		// System.out.print(positions[i] + " ");
		// }
		// System.out.println();
		// for (int i = 0; i < lengths.length; i++) {
		// System.out.print(lengths[i] + " ");
		// }
		long min = Long.MAX_VALUE, start = 0, end = 0, temp;
		for (int i = 0; i < lengths.length; i++) {
			start = positions[i];
			end = positions[i] + lengths[i];
			temp = 0;
			for (int j = i + 1; j < lengths.length; j++) {

				temp += Math.abs(positions[j] - end);
				end += lengths[j];
			}
			for (int j = i - 1; j >= 0; j--) {

				temp += Math.abs(start - (positions[j] + lengths[j]));
				start -= lengths[j];

			}
			min = Math.min(min, temp);
		}

		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] pos = { 5606451, 63581020, 81615191, 190991272, 352848147,
		// 413795385, 468408016, 615921162, 760622952, 791438427 };
		// int[] len = { 42643329, 9909484, 58137134, 99547272, 39849232,
		// 15146704, 144630245, 604149, 15591965, 107856540 };
		int[] pos = { 4, 10, 100, 13, 80 };
		int[] len = { 5, 3, 42, 40, 9 };
		System.out.println(minimizeCost(pos, len));
	}

}
