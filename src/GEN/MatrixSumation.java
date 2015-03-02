package GEN;
import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * Feb 17, 2015 1:46:03 PM
 * mohamed265
 */

public class MatrixSumation {
	
	static int Max = 10;

	static int[][] A = new int[Max][Max], B = new int[Max][Max],
			C = new int[Max][Max];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		for (int i = 0; i < Max; i++) {
			for (int j = 0; j < Max; j++) {
				A[i][j] = i + 1;
				B[i][j] = j + 1;
			}
		}
		
		for (int i = 0; i < Max; i++) {
			
			final int ii = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < Max; j++) {
						C[ii][j] = A[ii][j] + B[ii][j];
					}
				}
			}).start();
			
		}
		
		for (int i = 0; i < Max; i++) {
			for (int j = 0; j <Max; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

	}
}
