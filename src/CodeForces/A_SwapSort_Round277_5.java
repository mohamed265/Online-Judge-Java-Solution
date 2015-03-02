package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class A_SwapSort_Round277_5 {

	//public static int [] list = new int [3010];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		ArrayList<Integer> so = new ArrayList<Integer>() , xValue = new ArrayList<Integer>() , yValue = new ArrayList<Integer>() , list = new ArrayList<Integer>();
		int n = x.nextInt() , pos;
		for (int i = 0; i < n; i++) {
			list.add(x.nextInt());
			so.add(list.get(i));
		}
		//System.out.println(so);
		Collections.sort(so);
		for (int i = 0; i < n; i++) {
			pos = list.lastIndexOf(so.get(i));
			if (pos != i){
				xValue.add(i);
				yValue.add(pos);
				
				int temp = list.get(i);
				list.set(i  , list.get(pos));
				list.set(pos  , temp);
			//	list[pos] = temp;
			//	i = -1;
			//	i--;
			}
		}
		//System.out.println(so);
		//System.out.print(list);
		//System.out.println();
		System.out.println(xValue.size());
		for (int i = 0; i <xValue.size(); i++) {
			System.out.println(xValue.get(i) + " "+ yValue.get(i));
		}

	}

}
