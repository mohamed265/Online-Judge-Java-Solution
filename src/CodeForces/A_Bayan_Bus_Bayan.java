package CodeForces;
import java.util.Scanner;

public class A_Bayan_Bus_Bayan {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		System.out.println("+------------------------+");
		char[][] grid = new char[11][4];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 4; j++) {
				if (i== 0 && j == 2 && num > 0)
					{
					grid[i][j] = 'O';
					num--;
					}
				else if (i== 0 && j == 2 && num == 0)
					grid[i][j] = '#';
				else if (j == 2)
					grid[i][j] = '.';
				else if (num > 0) {
					grid[i][j] = 'O';
					num--;
				} else
					grid[i][j] = '#';
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.print('|');
			for (int j = 0; j < 11; j++) {
				System.out.print(grid[j][i]+".");
				 
			}
			if (i == 0)
				System.out.println("|D|)");
			else if ( i == 1)
				System.out.println("|.|");	
			else if ( i== 2)
				System.out.println("..|");	
			else 
				System.out.println("|.|)");
				
				
		}

		System.out.println("+------------------------+");

	}

}
