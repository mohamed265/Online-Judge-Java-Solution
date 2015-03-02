package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Round287_A_ {
	static Scanner x = new Scanner(System.in);

	public static class pair implements Comparator<pair> {
		public int ele, index;

		@Override
		public int compare(pair arg0, pair arg1) {
			return arg0.ele - arg1.ele;
		}
	}

	public static void main(String[] args) {
		int n = x.nextInt(), k = x.nextInt();
		ArrayList<pair> list = new ArrayList<pair>();

		for (int i = 0; i < n; i++) {
			pair c = new pair();
			c.ele = x.nextInt();
			c.index = i + 1;
			list.add(c);
		}
		Collections.sort(list, new pair());
		ArrayList<Integer> slon = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (k >= list.get(i).ele){
				slon.add( list.get(i).index);
				k-=list.get(i).ele;
			}
		}
		Collections.sort(slon);
		System.out.println(slon.size());
		for (int i = 0; i < slon.size(); i++) {
			System.out.print(slon.get(i) + " ");
		}
		
	}
}
