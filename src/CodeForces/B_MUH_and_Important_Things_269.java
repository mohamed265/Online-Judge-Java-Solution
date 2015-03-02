package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_MUH_and_Important_Things_269 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), temp, temp3 = 0, temp21 = 0, temp22 = 0;
		int[] map = new int[2001];
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			list.add(temp);
			map[temp]++;
			if (map[temp] >= 3 && temp3 == 0)
				temp3 = temp;
			else if (map[temp] >= 2 && temp21 == 0)
				temp21 = temp;
			else if (map[temp] >= 2 && temp22 == 0 && temp != temp21)
				temp22 = temp;
		}
	

		if (temp3 == 0 && temp21 * temp22 == 0 )
			System.out.println("NO");
		else if (temp3 != 0) {
			System.out.println("YES");
			int x1[] = new int[3];
			for (int i = 0, j = -1; j < 2; i++)
				if (list.get(i) == temp3)
					x1[++j] = i+1;

			ArrayList<Integer> sorted = new ArrayList<Integer>(list), tt = new ArrayList<Integer>(n) ,
							   list2 = new ArrayList<Integer>(list);
			Collections.sort(sorted);
 
			int index;
			for (int i = 0, j = 3; i < sorted.size(); i++) {
				if (sorted.get(i) != temp3 || j <= 0) {
					index = list2.indexOf(sorted.get(i));
					tt.add(index + 1);
//					for (int k = 0 ; k < sorted.size() ;k++)
//						System.out.print(list2.get(k) + " ");
//					System.out.println();
					list2.set(index, 0);
					//sorted.set(i, 0);
				} else {
					tt.add(-1);
					j--;
					index = list2.indexOf(sorted.get(i));
					list2.set(index, 0);
				}
			}
//			for (int i = 0; i < sorted.size(); i++) {
//				System.out.println(sorted.get(i) + " " + tt.get(i));
//			}
			for (int i = 0; i < sorted.size(); i++)
				if (tt.get(i) != -1)
					System.out.print(tt.get(i) + " ");
				else {
					System.out.print(x1[0] + " " + x1[1] + " " + x1[2] + " ");
					i += 2;
				}
			System.out.println();
			for (int i = 0; i < sorted.size(); i++)
				if (tt.get(i) != -1)
					System.out.print(tt.get(i) + " ");
				else {
					System.out.print(x1[0] + " " + x1[2] + " " + x1[1] + " ");
					i += 2;
				}
			System.out.println();
			for (int i = 0; i < sorted.size(); i++)
				if (tt.get(i) != -1)
					System.out.print(tt.get(i) + " ");
				else {
					System.out.print(x1[2] + " " + x1[1] + " " + x1[0] + " ");
					i += 2;
				}

		}else{
			System.out.println("YES");
			if (temp21 > temp22){
				int t = temp21;
				temp21 = temp22;
				temp22 = t;
			}
			int x1[] = new int[4];
			for (int i = 0, j = -1 , g = 1 ; i < list.size() ; i++)
				if (list.get(i) == temp21 )
					x1[++j] = i+1;
				else if (list.get(i) == temp22)
					x1[++g] = i+1;

			ArrayList<Integer> sorted = new ArrayList<Integer>(list), tt = new ArrayList<Integer>(n) ,
							   list2 = new ArrayList<Integer>(list);
			Collections.sort(sorted);
 
			int index;
			for (int i = 0; i < sorted.size(); i++) {
					index = list2.indexOf(sorted.get(i));
					tt.add(index + 1);
					list2.set(index, 0);
					
			}
			boolean flag1 = true , flag2 = true;
			for (int i = 0; i < sorted.size() ; i++){
				if (sorted.get(i) != temp21 && sorted.get(i) != temp22)
					System.out.print(tt.get(i) + " ");
				else if (flag1){
					flag1 = false;
					System.out.print(x1[1] + " " + x1[0] + " ");
					i++;
				}else if (flag2){
					flag2 = false;
					System.out.print(x1[2] + " " + x1[3] + " ");
					i++;
				}else
					System.out.print(tt.get(i) + " ");
			}
			System.out.println();
			flag1 = true;
			flag2 = true;
			
			for (int i = 0; i < sorted.size() ; i++){
				if (sorted.get(i) != temp21 && sorted.get(i) != temp22)
					System.out.print(tt.get(i) + " ");
				else if (flag1){
					flag1 = false;
					System.out.print(x1[0] + " " + x1[1] + " ");
					i++;
				}else if (flag2){
					flag2 = false;
					System.out.print(x1[3] + " " + x1[2] + " ");
					i++;
				}else
					System.out.print(tt.get(i) + " ");
			}
			System.out.println();
			flag1 = true;
			flag2 = true;
			
			for (int i = 0; i < sorted.size() ; i++){
				if (sorted.get(i) != temp21 && sorted.get(i) != temp22)
					System.out.print(tt.get(i) + " ");
				else if (flag1){
					flag1 = false;
					System.out.print(x1[0] + " " + x1[1] + " ");
					i++;
				}else if (flag2){
					flag2 = false;
					System.out.print(x1[2] + " " + x1[3] + " ");
					i++;
				}else
					System.out.print(tt.get(i) + " ");
			}
			
		}
	}
}
// Scanner x = new Scanner(System.in);
// int n = x.nextInt(), temp, temp3 = 0 , temp4 = 0, temp5 = 0;
// int[] map = new int[2001];
// ArrayList<Integer> list = new ArrayList<Integer>(n);
// for (int i = 0; i < n; i++) {
// temp = x.nextInt();
// list.add(temp);
// map[temp]++;
// }
// temp = 0;
// for (int i = 0; i < 2001; i++) {
// if (map[i] >= 3) {
// temp3 = i;
// break;
// } else if (map[i] >= 2){
// temp++;
// if (temp4 >= 2)
// temp4 = i;
// else if (temp5 >= 2){
// temp5 = i;
// break;
// }
// }
// }
// if (temp < 2 && temp3 == 0)
// System.out.println("NO");
// else if (temp3 != 0) {
// System.out.println("YES");
// int[] x1 = new int[3];
// for (int i = 0, j = 0; i < n; i++)
// if (list.get(i) == temp3) {
// x1[j] = i;
// j++;
// }
// int index;
//
// ArrayList<Integer> list2 = new ArrayList<Integer>(list);
// for (int i = 1; i < 2001; i++) {
// if (i != temp3) {
// index = list2.indexOf(i);
// if (index != -1) {
// System.out.print((index + 1) + " ");
// list2.set(index, 0);
// i--;
// }
// } else {
// System.out.print((x1[0] + 1) + " " + (x1[1] + 1) + " "
// + (x1[2] + 1) + " ");
// }
// }
// System.out.println();
// ArrayList<Integer> list3 = new ArrayList<Integer>(list);
// for (int i = 1; i < 2001; i++) {
// if (i != temp3) {
// index = list3.indexOf(i);
// if (index != -1) {
// System.out.print((index + 1) + " ");
// list3.set(index, 0);
// i--;
// }
// } else {
// System.out.print((x1[2] + 1) + " " + (x1[1] + 1) + " "
// + (x1[0] + 1) + " ");
//
// }
// }
// System.out.println();
// ArrayList<Integer> list4 = new ArrayList<Integer>(list);
// for (int i = 1; i < 2001; i++) {
// if (i != temp3) {
// index = list4.indexOf(i);
// if (index != -1) {
// System.out.print((index + 1) + " ");
// list4.set(index, 0);
// i--;
// }
// } else {
// System.out.print((x1[1] + 1) + " " + (x1[2] + 1) + " "
// + (x1[0] + 1) + " ");
//
// }
// }
//
// } else {
// System.out.println("YES");
// int[] x1 = new int[3];
// for (int i = 0, j = 0; i < n && j < 3; i++)
// if (list.get(i) == temp4) {
// x1[j] = i;
// j++;
// }
// int index;
//
//
// }
//
