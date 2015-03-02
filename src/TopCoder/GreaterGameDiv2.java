package TopCoder;
import java.util.Scanner;


public class GreaterGameDiv2 {
	public int calc(int[] snuke, int[] sothe){
		int num = 0;
		for (int i = 0; i < sothe.length; i++) {
			if (snuke[i] > sothe[i])
				num ++;//= snuke[i];
		}
		return num;
	}

	public static void main(String[] args) {
		
	}

}
