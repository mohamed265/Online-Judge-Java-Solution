package CodeForces;
import java.util.Scanner;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class B_Strongly_Connected_City_Bayan {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt();
		String hori = x.next(), ver = x.next();
		if (hori.indexOf('<') == -1 || hori.indexOf('>') == -1
				|| ver.indexOf('^') == -1 || ver.indexOf('v') == -1) {
			System.out.print("NO\n");
			return ;
		}
		if (hori.charAt(0) == '<' && ver.charAt(0) == '^')  {
			System.out.print("NO\n");
			return ;
		}
		if (hori.charAt(0) == '>' && ver.charAt(m-1) == '^') {
			System.out.print("NO\n");
			return ;
		}
		if (hori.charAt(n-1) == '<' && ver.charAt(0) == 'v') {
			System.out.print("NO\n");
			return ;
		}
		if (hori.charAt(n-1) == '>' && ver.charAt(m-1) == 'v') {
			System.out.print("NO\n");
			return ;
		}
		
		System.out.print("YES\n");
	}

}
