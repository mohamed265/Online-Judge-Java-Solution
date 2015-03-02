package CodeForces;
import java.util.HashMap;
import java.util.Scanner;

public class Round285_B_Misha_and_Changing_Handles {

	static HashMap<String, String> map = new HashMap<String, String>();

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int q = x.nextInt();
		String temp = "", t = "";
		for (int i = 0; i < q; i++) {
			t = x.next();
			temp = x.next();
			if (map.containsValue(t)) {
				for (String string : map.keySet()) {
					if (map.get(string).equals(t)) {
						t = string;
						break;
					}
				}
			}
			map.put(t, temp);
		}
		System.out.println(map.size());
		for (String str : map.keySet()) {
			System.out.println(str + " " + map.get(str));
		}
	}
}