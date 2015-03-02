package CodeForces;
import java.util.Scanner;


public class A_Keyboard_271 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		char Shift = x.next().charAt(0);
		String squen = x.next();
		String key = "qwertyuiopasdfghjkl;zxcvbnm,./";
		for (int i = 0 ; i < squen.length() ; i++){
			System.out.print( key.charAt( key.indexOf(squen.charAt(i)) + (Shift == 'R' ? -1 : 1) ));
		}

	}

}
