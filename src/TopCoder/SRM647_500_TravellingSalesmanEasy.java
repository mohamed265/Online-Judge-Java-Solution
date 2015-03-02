package TopCoder;
import java.util.ArrayList;
import java.util.Collections;

public class SRM647_500_TravellingSalesmanEasy {

	public static int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
		int slon = 0;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < M + 1; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < profit.length; i++) {
			list.get(city[i]).add(profit[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			Collections.sort(list.get(i));
		}
		for (int i = 0; i < visit.length; i++) {
			if (list.get(visit[i]).size() > 0) {
				slon += list.get(visit[i]).get(list.get(visit[i]).size() - 1);
				list.get(visit[i]).remove(list.get(visit[i]).size() - 1);
			}
		}
		return slon;
	}

	public static void main(String[] args) {
		int M = 2;
		int[] profit = {3,10};
		int[] city = {1,1};
		int[] visit = {2,1};
		System.out.println(getMaxProfit(M, profit, city, visit));

	}

}
