package CodeForces;
import java.util.Scanner;

public class A_Robot_Bicorn_Attack_115 {
	static public void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		
		String res = x.next();
		
		if (res.length() < 3 ) {
			System.out.println(-1);
			return;
		}else if (res.length() == 3){
			System.out.println(res.charAt(0)+res.charAt(1)+res.charAt(2) - 3*'0');
			return;
		}

		long max = -1, f = 0, s = 0, t = 0;
		String tf, ts, tt;
		for (int i = 0; i <= res.length() - 3 && i < 8; i++) {
			for (int j = i + 1; j <= res.length() - 2 && j < 15; j++) {
				for (int j2 = j + 1; j2 < res.length(); j2++) {
					
					f = s = t = (long) 10E15;
					// System.out.println(i + " " + j + " " + j2);
					tf = res.substring(0, i + 1);
					ts = res.substring(i + 1, j2);
					tt = res.substring(j2);// , res.length());

					// System.out.println(tf + " " + ts + " " + tt);
					try {
					f = Long.valueOf(tf);

					s = Long.valueOf(ts);

					t = Long.valueOf(tt);}
					catch (Exception e) {
						// TODO: handle exception
					}

					if (f <= 1000000 && s <= 1000000 && t <= 1000000 && (tf.charAt(0) != '0' || tf.length() == 1) &&
																		(ts.charAt(0) != '0' || ts.length() == 1) && 
																		(tt.charAt(0) != '0' || tt.length() == 1))
						max = Math.max(max, f + s + t);
				}
			}
		}
		System.out.println(max);
	}

}
