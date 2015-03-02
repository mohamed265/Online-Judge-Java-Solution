package CodeForces;
import java.util.Scanner;


public class A_Appleman_and_Easy_Task_263 {

	static String [] grid = new String[101];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt() , sum = 0;
		for (int i = 0 ; i < n ; i++)
				grid[i] = x.next();
		
		boolean flag = true;
			
		for (int i = 0 ; i < n ; i++)
			for (int j = 0 ; j < n ; j++)
				//if (grid[i].charAt(j) == 'x' )
				{
					//System.out.print("ok");
					sum = 0;
					if (i != n-1 && grid[i+1].charAt(j) == 'o')
						sum++;
					if (i != 0 && grid[i-1].charAt(j) == 'o')
						sum++;
					if (j != n-1 && grid[i].charAt(j+1) == 'o')
						sum++;
					if (j != 0 && grid[i].charAt(j-1) == 'o')
						sum++;
					if (sum == 3 || sum == 1)
						flag = false;
				}
		if (flag)
			System.out.print("YES");
		else
			System.out.print("NO");

	}

}
