package LiveArchive;
import java.util.ArrayList;
import java.util.Scanner;

public class Sort_Me_Live_Archive {

	public static void main(String[] args) {
		// ArrayList<Integer> jj = new ArrayList<Integer>();
		// jj.add(1);
		// jj.add(1, 5);
		// System.out.print(jj.get(jj.size()-1));
		Scanner x = new Scanner(System.in);
		int n , SI;
		String gide;
		char help;
		for (int year = 1; true; year++) {
			n = x.nextInt();
			if (n == 0)
				break;
			gide = x.next();
			ArrayList<String> list = new ArrayList<String>(n), sorted = new ArrayList<String>(
					n);
			for (int j = 0; j < n; j++)
				list.add(x.next());

			for (int i = 0; i < gide.length(); i++) {
				help = gide.charAt(i);
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).charAt(0) == help) {
						String temp = list.get(j);
						list.remove(j);
						j--;
						SI = sorted.size();
						if (sorted.size() == 0)
							sorted.add(temp);
						else {
							int a = sorted.size() - 1;
							for (; a >= 0; a--) {
								if (sorted.get(a).charAt(0) != help) {
									sorted.add(a+1, temp);
									break;
								} else {
									boolean good = false;
									int y = 1 , l , r;
									for (; y < temp.length() && y < sorted.get(a).length(); y++) {
										l = gide.indexOf(temp.charAt(y));
										r = gide.indexOf(sorted.get(a).charAt(y));
										if (l > r) {
											good = true;
											break;
										}else if (l < r)
											break;
									}
									if (good || ( (y == temp.length() || y == sorted.get(a).length() ) && temp.length() > sorted.get(a).length())) { 
										sorted.add(a+1, temp);
										break;
									}
								}// ////////////

							}
							if (a == -1 && SI == sorted.size())
								sorted.add(0, temp);
						}

					}
//					System.out.println("******");
//					for (int gg = 0; gg < sorted.size(); gg++)
//						System.out.println(sorted.get(gg));
				}

			}
			System.out.println("year " + year);
			for (int i = 0; i < sorted.size(); i++)
				System.out.println(sorted.get(i));
		}

	}

}
