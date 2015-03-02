package TopCoder;
import java.util.ArrayList;
import java.util.Collections;

public class SRM643_500_TheKingsFactorization {

	static ArrayList<Long> primes(int num) {
		long[] test = new long[num + 1];
		ArrayList<Long> list = new ArrayList<Long>(num + 1);
		for (long i = 2; i <= num; i++) {
			if (test[(int) i] != -1) {
				list.add(i);
				for (long j = i * i; j < num + 1; j += i) {
					test[(int) j] = -1;
				}
			}
		}
		return list;
	}

	public static long[] getVector(long N, long[] primes) {
		ArrayList<Long> list = new ArrayList<Long>(primes.length * 2 + 1), pr = primes(1000010);

		for (int i = 0; i < primes.length; i++) {
			while (N % primes[i] == 0) {
				list.add(primes[i]);
				N /= primes[i];
			}
		}

		for (int i = 0; i < pr.size(); i++) {
			while (N % pr.get(i) == 0) {
				list.add(pr.get(i));
				N /= pr.get(i);
			}
		}
		if (N > 1)
			list.add(N);
		Collections.sort(list);

		long[] result = new long[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		// long[] primes = { 2, 2, 2, 2, 2, 2, 3, 3, 3 };
		// long num = Long.parseLong("1492992010450944");
		long[] primes = { 2, 5 };
		long num = 210;
		SRM643_500_TheKingsFactorization.getVector(num, primes);
	}

}
