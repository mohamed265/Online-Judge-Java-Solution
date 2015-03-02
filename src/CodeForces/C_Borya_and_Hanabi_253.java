package CodeForces;

import java.util.Scanner;

public class C_Borya_and_Hanabi_253 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
	 
		boolean  G = false , R = false , B = false , Y = false , W = false , x1 = false , x2 = false , x3 = false , x4 = false , x5 = false ;
		
		int n = x.nextInt();
		
		for (int i = 0 ; i < n ; i++){
	
			String temp = x.next();
			
			if (temp.charAt(0) == 'G')
				G = true;
			else if (temp.charAt(0) == 'R')
				R = true;
			else if (temp.charAt(0) == 'B')
				B = true;
			else if (temp.charAt(0) == 'Y')
				Y = true;
			else if (temp.charAt(0) == 'W')
				W = true;
			
			if (temp.charAt(1) == '1')
				x1 = true;
			else if (temp.charAt(1) == '2')
				x2 = true;
			else if (temp.charAt(1) == '3')
				x3 = true;
			else if (temp.charAt(1) == '4')
				x4 = true;
			else if (temp.charAt(1) == '5')
				x5 = true;
		}
		
		int letter = (G ? 1 : 0)  + (W ? 1 : 0) + (Y ? 1 : 0) + (R ? 1 : 0) + (B ? 1: 0) ,
			number = (x1 ? 1 : 0) + (x2 ? 1 : 0) + (x3 ? 1 : 0) + (x4 ? 1 : 0) + (x5 ? 1 : 0) ;
		
		letter--;
		number--;
		 
		if (letter == 1 && number != 0)
			System.out.print(number);
		else if (number == 1 && letter != 0)
			System.out.print(letter);
		else
			System.out.print(letter + number);
	}
}