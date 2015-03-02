package CodeForces;
import java.util.ArrayList;
import java.util.Scanner;


public class B_Dreamoon_and_WiFi_272 {
	static ArrayList<Integer>slon =new  ArrayList<Integer>();
	
	static String s1 , s2;
	static void dp (int len, int tar){
		
		if (len == s2.length()){
				slon.add(tar);
				return;
		}
		
		if (s2.charAt(len) == '+')
			dp(len+1 , tar+1);
		else if (s2.charAt(len) == '-')
			dp(len+1 , tar-1);
		else{
			dp(len+1 , tar+1);
			dp(len+1 , tar-1);
		}
		
			
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		 s1 = x.next() ;
		 s2 = x.next();
		int tar = 0 , count = 0 ;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '+')
				tar++;
			else
				tar--;
		}
		dp(0, 0);
		
		for (int i = 0; i < slon.size() ; i++)
			if (slon.get(i) == tar)
				count++;
		
		System.out.print((double) count/(double) slon.size());

	}

}
