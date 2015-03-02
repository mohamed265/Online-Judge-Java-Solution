package CodeForces;
import java.math.BigInteger;
import java.util.Scanner;

public class B_Fedya_and_Maths_260 {

	public static void main(String arr[]) {
		
		Scanner x = new Scanner(System.in);
		BigInteger num = x.nextBigInteger();
		if (num.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO))
			System.out.print(4);
		else
			System.out.print(0);
	}

}
