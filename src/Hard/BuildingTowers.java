package Hard;
public class BuildingTowers {
//SRM 647
	public static long maxHeight(int N, int K, int[] x, int[] t) {
		long k = K;
		long n = N;
		if (x.length == 0) {
			return (n - 1) * k;
		}
		long result = 0, curent = Math.min(t[0], (long) (x[0] - 1) * (long) k);
		result = curent;
		long change, duration;
		for (int i = 1; i < t.length; i++) {
			duration = (x[i] - x[i - 1]);
			change = (duration * k);
			curent = Math.min(t[i], change + curent);
			result = Math.max(result, curent);
		}
		// result = Math.max((N - x[x.length - 1]) * K, result);
		return result + (long) (n - x[x.length - 1]) * k;
	}

	public static void main(String[] args) {
		// int N = 20;
		// int K = 3;
		// int[] x = { 4, 7, 13, 15, 18 };
		// int[] t = { 8, 22, 1, 55, 42 };
		// Returns: 28495511604
		int N = 780;
		int K = 547990606;
		int[] x = { 34, 35, 48, 86, 110, 170, 275, 288, 313, 321, 344, 373,
				390, 410, 412, 441, 499, 525, 538, 568, 585, 627, 630, 671,
				692, 699, 719, 752, 755, 764, 772 };
		int[] t = { 89, 81, 88, 42, 55, 92, 19, 91, 71, 42, 72, 18, 86, 89, 88,
				75, 29, 98, 63, 74, 45, 11, 68, 34, 94, 20, 69, 33, 50, 69, 54 };
		System.out.println(maxHeight(N, K, x, t));
	}

}
