package TopCoder;

public class SRM635_IdentifyingWood_250 {
//	static
	String check(String s, String t){
		int num = 0 ;
		for (int i = 0  ; i < s.length() && num < t.length(); i++)
			if (s.charAt(i) == t.charAt(num))
				num++;
		if (t.length() == num)
			return "Yep, it's wood.";
		else
			return "Nope.";
	}

//	public static void main(String[] args) {
//		System.out.print(check("string"
//				,"longstring" ));
//
//	}

}
