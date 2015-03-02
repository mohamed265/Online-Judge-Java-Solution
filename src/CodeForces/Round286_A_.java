package CodeForces;
import java.util.Scanner;

public class Round286_A_ {

	static int other = 0;
	static boolean is_palindrome(String temp) {
		// System.out.println(temp);
		boolean flag = true;
		for (int i = 0, j = temp.length() - 1; i < temp.length() / 2; i++, j--) {
			if (temp.charAt(i) != temp.charAt(j)) {
				if (temp.charAt(j) != '?' && temp.charAt(i) != '?') {
					flag = false;
					break;
				} else {
					if (temp.charAt(j) == '?')
						other = i;
					else
						other = j;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		StringBuffer temp = new StringBuffer(x.next());
		for (int i = 0; i < temp.length() + 1; i++) {
			temp.insert(i, '?');
			if (is_palindrome(temp.toString())) {
				// System.out.println(temp.toString());
				if (i == temp.length() / 2 + 1) {
					temp.setCharAt(i, 'a');
				} else{
					//System.out.println(other);
					temp.setCharAt(i, temp.charAt((other)));
				}
				System.out.println(temp.toString());
				return;
			}
			temp.deleteCharAt(i);
		}
		System.out.println("NA");
	}

}
