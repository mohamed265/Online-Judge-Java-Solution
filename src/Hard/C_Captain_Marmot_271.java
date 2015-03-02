package Hard;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;


public class C_Captain_Marmot_271 {
	
	static ArrayList<Integer> x  = new ArrayList<Integer>() ,
			y = new ArrayList<Integer>() ,
			a = new ArrayList<Integer>() ,
			b = new ArrayList<Integer>() ;
	
	static boolean checkSq(){
		int xSc1 = Math.abs(x.get(0) - x.get(3)) , xSc2 = Math.abs(x.get(1) - x.get(2));
		if (xSc1 != xSc2)
			return false;
		int ySc1 = Math.abs(y.get(0) - y.get(2)) , ySc2 = Math.abs(x.get(3) - x.get(1));
		if (ySc1 != ySc2)
			return false;
		if (ySc1 != xSc1)
			return false;
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new BigDecimal(2).pow(1000000) );
		Scanner in = new Scanner(System.in);
		
//		ArrayList<Integer> x  = new ArrayList<Integer>() ,
//							y = new ArrayList<Integer>() ,
//							a = new ArrayList<Integer>() ,
//							b = new ArrayList<Integer>() ;
		for (int i = 0 ; i < 4 ; i++){
			x.add(in.nextInt());
			y.add(in.nextInt());
			a.add(in.nextInt());
			b.add(in.nextInt());
		}
		System.out.print(checkSq());
		
		if (x.get(0) > a.get(0) && y.get(0) > b.get(0))
			x.set(0, -1 * Math.abs(x.get(0) - a.get(0)) + a.get(0));
		else if (x.get(0) < a.get(0) && y.get(0) > b.get(0) )
			y.set(0, -1 * Math.abs(y.get(0) - b.get(0) + b.get(0)));
		else if (x.get(0) < a.get(0) && y.get(0)  < b.get(0))
			x.set(0,  Math.abs(x.get(0) - a.get(0)) + a.get(0));
		else if (x.get(0) > a.get(0) && y.get(0) < b.get(0))
			y.set(0, Math.abs(y.get(0) - b.get(0) + b.get(0)));
			
		
		System.out.print(x.get(0) + " " + y.get(0));
	}

}
