package TopCoder;
public class SRM634_ShoppingSurveyDiv2_500 {
	///static
	// SRM 634
	public int minValue(int N, int[] s) {
		
		int sum = 0;
		for (int i = 0; i < s.length; i++)
			sum += s[i];
		
			sum -= N * (s.length-1);
		
		return sum >= 0 ? sum : 0;
	}
//	public int minValue(int N, int[] s) {
//		
//		if (s.length == 1)
//			return s[0];
//		
//		int sum = 0;
//		for (int i = 0; i < s.length; i++)
//			sum += s[i];
//		
//		if (sum == N * s.length)
//			return s.length;
//		
//		for (int i = 1; i < s.length; i++)
//			sum -= N ;
//		
//		return sum >= 0 ? sum : 0;
//	}

//	public static void main(String[] args) {
//		int N = 5;
//		int[] s = new int[] {9, 9, 9,9,9 };
//		System.out.print(minValue(N, s));
//
//	}

}
