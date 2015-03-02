package LiveArchive;
import java.util.Scanner;

public class Grachten_Live_Archive {
	// static float fract(float bas, float mak) {
	// float num = bas / mak;
	// DecimalFormat df = new DecimalFormat("#.00");
	// return Float.parseFloat(df.format((num - (int) bas / (int) mak)));
	// }

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int ab, ac, bd, bas, mak;
		//float num;
		 while (x.hasNext()) {
		ab = x.nextInt();
		ac = x.nextInt();
		bd = x.nextInt();
		bas = ac * ab;
		mak = bd - ac;
//		bas = x.nextInt();
//		mak = x.nextInt();
		for (int i = Math.min(bas, mak); i >= 1; i--) {
			if (bas % i == 0 && mak % i == 0) {
				System.out.println(bas / i + "/" + mak / i);
				return;
			//	break;
			}
		}
		//System.out.println(bas + "/" + mak);
		 }
		// num = fract(ac * ab, mak);
		// if (num == 0 && bas >= mak)
		// System.out.println(bas / mak + "/1");
		// else {
		// System.out.print(num+"\n");
		// int i = 1;
		// for (; i <= mak; i++)
		// if (i / num == (int) i / num) {
		// System.out
		// .println((int) (bas * (float) ((i / num) / (float) mak))
		// + "/" + (int) (i / num));
		// return;
		// }
		//
		// System.out.println(bas + "/" + mak);
		// }
		// }
	}

}
