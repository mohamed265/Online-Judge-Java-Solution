package CodeForces;

import java.util.Scanner;

public class B_Suffix_Structures_256 {
	static int[] tt = new int[27], ss = new int[27];

	static public void main(String arr[]) {
		Scanner x = new Scanner(System.in);
		String s = x.nextLine(), t = x.nextLine();
		if (t.length() > s.length())
			System.out.print("need tree");
		else if (t.length() == s.length()) {
			for (int i = 0; i < s.length(); i++) {
				tt[t.charAt(i) - 'a']++;
				ss[s.charAt(i) - 'a']++;
			}

			for (int i = 0; i < 27; i++)
				if (tt[i] != ss[i])
					{
						System.out.print("need tree");
						return;
					}

			System.out.print("array");
		}
		else 
		{
			for (int i = 0; i < s.length(); i++) 
				ss[s.charAt(i) - 'a']++;
			
			for (int i = 0; i < t.length(); i++)
				tt[t.charAt(i) - 'a']++;
			
			for (int i = 0; i < 27; i++)
				if (tt[i] > ss[i] && tt[i] != 0)
					{
						System.out.print("need tree");
						return;
					}
			boolean flag = true;
			//if (s.contains(t))
			int j = 0 ;
				for (int i = 0  ; i < s.length() && j < t.length(); i++ )
					if (t.charAt(j) == s.charAt(i))
						j++;
				//System.out.print(j);
				if (j == t.length())
				System.out.print("automaton");
			else
				System.out.print("both");
		}
	}
}
