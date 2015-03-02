package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class A_Vasya_and_Football_Round281 {
	public static class falou {
		public int min, num;
		public String team, type;

	}

	public static class out implements Comparator<out> {
		public String team;
		public int min, num;

		public String toString() {
			return team + " " + num + " " + min;

		}

		@Override
		public int compare(out arg0, out arg1) {
			return arg0.min - arg1.min;
		}
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String home = x.next(), away = x.next();
		int n = x.nextInt();

		ArrayList<falou> list = new ArrayList<falou>();
		ArrayList<out> eventOut = new ArrayList<out>();

		for (int i = 0; i < n; i++) {
			falou temp = new falou();
			temp.min = x.nextInt();
			temp.team = (x.next().charAt(0) == 'a' ? away : home);
			// System.out.println( " team " + temp.team );
			temp.num = x.nextInt();
			temp.type = x.next();

			if (temp.type.charAt(0) == 'r') {
				out o = new out();
				o.min = temp.min;
				o.num = temp.num;
				o.team = temp.team;
				eventOut.add(o);
			} else
				list.add(temp);

		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).team.equals(list.get(j).team)
						&& list.get(i).num == list.get(j).num) {
					out o = new out();
					o.min = Math.max(list.get(j).min, list.get(i).min);
					o.num = list.get(j).num;
					o.team = list.get(j).team;
					eventOut.add(o);
					break;
				}

			}
		}
		Collections.sort(eventOut, new out());
		for (int i = 0; i < eventOut.size(); i++) {
			for (int j = i + 1 ; j < eventOut.size(); j++) {
				if (eventOut.get(i).team.equals(eventOut.get(j).team) && eventOut.get(i).num == eventOut.get(j).num){
					eventOut.remove(j);
					j--;
				}
			} 
			
		}
		for (int i = 0; i < eventOut.size(); i++) {
			System.out.println(eventOut.get(i).toString());

		}

	}
}
