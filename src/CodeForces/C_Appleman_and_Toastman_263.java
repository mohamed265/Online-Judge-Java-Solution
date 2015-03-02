package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class C_Appleman_and_Toastman_263 {

	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		long sum = 0;
		int n = x.nextInt() , temp;
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for (int i = 0 ; i < n ; i++){
			temp = x.nextInt();
			sum += temp;
			list.add(temp);
		}
		long solidSum = sum;
		Collections.sort(list);
		for (int i = 0 ; i < n-1 ; i++){
			sum += solidSum;
			solidSum -= list.get(i);
		}
		System.out.print(sum);
		

	}

}
