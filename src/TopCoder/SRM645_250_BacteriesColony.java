package TopCoder;
public class SRM645_250_BacteriesColony {

	public static int[] performTheExperiment(int[] colonies) {
		int numofChange = 0;
		int[] temp = new int[colonies.length];
		for (int i = 1; i < colonies.length - 1; i++) {
			if (colonies[i + 1] > colonies[i] && colonies[i] < colonies[i - 1]) {
				temp[i]++;
				numofChange++;
			} else if (colonies[i + 1] < colonies[i]
					&& colonies[i] > colonies[i - 1]) {
				temp[i]--;
				numofChange++;

			}
		}
		for (int i = 0; i < colonies.length; i++) {
			colonies[i] += temp[i];
		}
		if (numofChange == 0)
			return colonies;
		else
			return performTheExperiment(colonies);
	}

	public static void main(String[] args) {
		int[] colonies = { 1, 5, 4, 9 }, res = performTheExperiment(colonies);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

}
