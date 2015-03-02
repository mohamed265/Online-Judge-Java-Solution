package CodeForces;
import java.util.Scanner;

public class A_DZY_Loves_Chessboard_ {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), m = x.nextInt();
		StringBuffer[] res = new StringBuffer[n];
		String temp;
		for (int i = 0; i < n; i++) {
			res[i] = new StringBuffer();
			for (int j = 0; j < m; j++) {
				 if (j%2 == i%2)
					 res[i].append('W');
				 else
					 res[i].append('B');
			}
		}
		for (int i = 0; i < n; i++){
			temp = x.next();
			for ( int j = 0 ; j < m; j++)
				if (temp.charAt(j) == '-')
					res[i].setCharAt(j, '-');
		}
		 
		System.out.println();
		for (int i = 0; i < n; i++)
			System.out.println(res[i]);
	}

}
/*
 * for (int i = 0; i < n; i++) {
			res[i] = "";
			for (int j = 0; j < m; j++) {
				if (grid[i].charAt(j) == '.' && dash == 0) {
					if (i > 0 && res[i - 1].charAt(j) == 'W')
						res[i] += 'B';
					else if (i > 0 && res[i - 1].charAt(j) == 'B')
						res[i] += 'W';
					else if (j > 0 && res[i].charAt(j - 1) == 'W')
						res[i] += 'B';
					else if (j > 0 && res[i].charAt(j - 1) == 'B')
						res[i] += 'W';
					else
						res[i] += 'B';
				} else if (grid[i].charAt(j) == '.' && dash != 0) {
					beDash = j - dash;
					int theSame = beDash % 2;
					if (beDash > 0 && theSame == 1)
						res[i] += res[i].charAt(beDash-1);
					else if (beDash > 0 && theSame == 0 && grid[i].charAt(beDash-1) == 'W')
						res[i] += 'B';
					else if (beDash > 0 && theSame == 0 && grid[i].charAt(beDash-1) == 'B')
						res[i] += 'W';
					else if (beDash == 0 && i > 0 && grid[i-1].charAt(j) == 'B')
						res[i] += 'W';
					else if (beDash == 0 && i > 0 && grid[i-1].charAt(j) == 'W')
						res[i] += 'B';
					else
						res[i] += 'B';
					dash = 0;
				} else {
					res[i] += '-';
					dash++;
				}
			}
		}*/
