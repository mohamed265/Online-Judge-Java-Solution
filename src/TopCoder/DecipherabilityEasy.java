package TopCoder;
import java.util.Scanner;

/*
 * Feb 10, 2015 6:00:59 PM
 * mohamed265
 */

public class DecipherabilityEasy {

	public static String check(String s, String t) {
		String pos = "Possible", not = "Impossible";
		StringBuffer ss = new StringBuffer(s), tt = new StringBuffer(t);
		if (s.length() <= t.length())
			return not;
		char temp;
		for (int i = 0; i < s.length(); i++) {
			temp = ss.charAt(i);
			ss.deleteCharAt(i);
			//System.out.println(ss + " " + tt);
			if (ss.toString().equals(tt.toString()))
				return pos;
			ss.insert(i, temp);
		}
		return not;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println(check("sunuke", "snuke"));

	}
}
