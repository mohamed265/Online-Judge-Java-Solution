package CodeForces;
import java.util.Scanner;

public class B_Kolya_and_Tandem_Repeat_253 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt();
		for (; k > 0; k--) {
			s += "?";
		}
		for (int n = s.length() / 2; n >= 1; n--) {
			for (int j = 0; j <= s.length() - n * 2; j++) {
				boolean b = true;
				for (int i = 0; i < n; i++) {
					if (s.charAt(j + i + n) != '?' && s.charAt(j + i) != s.charAt(j + i + n)) {
						b = false;
					}
				}
				if (b) {
					System.out.println(n * 2);
					return;
				}
			}
		}
	}

	/*
	 * 
	 * 
	 * static int maxTandem (String line , int s , int k){ String l = line +
	 * line.substring(s, s+k);
	 * 
	 * int t = 0 , m = 0 ;
	 * 
	 * for (int n = 1 ; n <= l.length()/2 ; n++) { t = 0; for (int i = 0 ; i+n <
	 * l.length() / n * n ; i++) if (l.charAt(i) == l.charAt(i + n)) t++; else{
	 * if (n==1){ double d = Math.ceil( (double) t / (double) 2 );
	 * //System.out.println("*" +d); m = (int) Math.max(m ,d); // } else m =
	 * Math.max(m, t); t = 0; }
	 * 
	 * if (n==1){ double d = Math.ceil( (double) t / (double) 2 );
	 * //System.out.println("*" +d); m = (int) Math.max(m ,d); } else m =
	 * Math.max(m, t); //System.out.println(n + " " + m); }
	 * //System.out.println(l + " " + t + " " + m);// + " " + rl + " " + m);
	 * return 2 * m; }
	 * 
	 * public static void main(String[] args) { Scanner x = new
	 * Scanner(System.in); String s = x.nextLine(); int k = x.nextInt() , l = 0;
	 * if (k <= s.length()){ for (int i = 0 ; i <= s.length()-k ; i++) l =
	 * Math.max(l, maxTandem(s, i, k)); System.out.print(l); } else
	 * System.out.print ( (k + s.length()) / 2 *2 );
	 * 
	 * 
	 * 
	 * }
	 */

}
