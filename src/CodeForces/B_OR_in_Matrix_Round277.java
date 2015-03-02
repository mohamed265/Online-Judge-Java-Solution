package CodeForces;
import java.util.Scanner;

public class B_OR_in_Matrix_Round277 {

	static int[][] A, B, C;
	static int row, colum;

	static void handle(int x, int y) {
		for (int i = x; i < row; i++) {
			C[i][y] = 1;
		}
		for (int i = x; i >= 0; i--) {
			C[i][y] = 1;
		}
		for (int i = y; i < colum; i++) {
			C[x][i] = 1;
		}
		for (int i = y; i >= 0; i--) {
			C[x][i] = 1;
		}
	}

	public static void main(String[] arr) {
		Scanner x = new Scanner(System.in);
		row = x.nextInt();
		colum = x.nextInt();
		int temp = 0;
		int[] rows = new int[row], colums = new int[colum];
		B = new int[row][colum];
		A = new int[row][colum];
		C = new int[row][colum];
		for (int i = 0; i < row; i++) {
			temp = 0;
			for (int j = 0; j < colum; j++) {
				temp += B[i][j] = x.nextInt();
			}
			rows[i] = temp;
		}
		for (int i = 0; i < colums.length; i++) {
			temp = 0;
			for (int j = 0; j < rows.length; j++) {
				temp += B[j][i];
			}
			colums[i] = temp;
		}
		// for (int i = 0; i < colums.length; i++) {
		// System.out.print(colums[i] + " ");
		// }
		// System.out.println();
		// for (int i = 0; i < rows.length; i++) {
		// System.out.print(rows[i] + " ");
		// }
		// System.out.println();
		for (int i = 0; i < colums.length; i++) {
			for (int j = 0; j < rows.length; j++) {
				if (colums[i] == row && rows[j] == colum) {
					A[j][i] = 1;
					handle(j, i);
				}
			}
		}
		boolean flag = true;

		for (int i = 0; i < row && flag; i++) {
			for (int j = 0; j < colum && flag; j++) {
				// System.out.print(C[i][j] + " ");
				if (C[i][j] != B[i][j]) {
					flag = false;

				}
			}
			// System.out.println();
		}
		if (flag) {
			System.out.println("YES");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println();
			}
		} else
			System.out.println("NO");

	}

}
