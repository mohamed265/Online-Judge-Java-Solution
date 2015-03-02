package CodeForces;
 
import java.util.Scanner;


public class C_No_to_Palindromes_265 {
	 
	
	static boolean PalindromesTest(String  s , int len ){
		System.out.println(s + " "  + len);
		 //len = 10000;
		if (s.length() == 1)
			return true;
		
		else if (s.length() == 2){
			if (s.charAt(0) == s.charAt(1))
				return false;
			else 
				return true;
		}
		 // && len-- > 0
		for (int i = s.length() ; i >= 3 ;i--)
			if (s.charAt(i-1) == s.charAt(i-2) || s.charAt(i-2) == s.charAt(i-3) || s.charAt(i-3) == s.charAt(i-1))
				return false;
			return true;
		}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt() , p = x.nextInt() , len = 0;
		 p =  'a' + p -1 ;
		String s = x.next(); 
		
		StringBuffer c = new StringBuffer(s);

		while (true){
			//map.clear();
			len = 0;
			for (int i = n-1 ; i >= 0 ; i-- ){
				 len++;
				if (c.charAt(i) < p ) {
					c.setCharAt(i, (char) (c.charAt(i) + 1));
					//System.out.println(i);
				if (i >= 1 && c.charAt(i - 1) == c.charAt(i))
					i++;
				else if (i >= 2 && c.charAt(i - 2) == c.charAt(i))
					i++;
				else
					break;
				len--;
				}
				else {
					c.setCharAt(i, 'a');
					
					if (i == 0){
						System.out.println("NO");
						return;
					}
					//System.out.println(i);
					
					 if ( (i < n-1 && c.charAt(i + 1) == c.charAt(i) )|| (i < n-2 && c.charAt(i + 2) == c.charAt(i)))
						 // i = n;
						len = 10000;
				}
			}
			//System.out.println(c.toString());
			
			if (PalindromesTest(c.toString() , len) ){
				
				System.out.println(c.toString());
				return;
			}
			//len = x.nextInt();
		}
		
		//System.out.println(PalindromesTest(s));
		 
	}

}/*
	static boolean loc (String s){

		if (s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2))
			return true;
		return false;
		
	}*/
/*
 * static HashMap<String, Boolean> map = new HashMap<String, Boolean>();
static boolean PalindromesTest(String s){
if (s.length() == 1)
			return true;

if (map.containsKey(s))
	return map.get(s);

String reverse = new StringBuffer(s).reverse().toString();

if (s.equals(reverse))
	return false;

if (s.length() == 2)
	return true;

map.put(s , (PalindromesTest(s.substring( 1 , s.length() )) && PalindromesTest(s.substring( 0 , s.length() - 1))) );
 return map.get(s);
}*//*
static boolean smaller (String s , String c){
for (int i = 0; i < s.length(); i++) {
	if (s.charAt(i) < c.charAt(i))
		return true;
}
return false;
}*/