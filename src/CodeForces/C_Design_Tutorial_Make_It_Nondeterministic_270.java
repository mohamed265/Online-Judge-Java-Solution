package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C_Design_Tutorial_Make_It_Nondeterministic_270 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String temp = "", temp2 = "";
		int n = x.nextInt();
		ArrayList<String> list = new ArrayList<String>(2 * n), fname = new ArrayList<String>(
				n), lname = new ArrayList<String>(n);
		ArrayList<Integer> perm = new ArrayList<Integer>(n);

		for (int i = 0; i < n; i++) {
			temp = x.next();
			temp2 = x.next();
			fname.add(temp);
			lname.add(temp2);
			// list.add(temp2);
			// list.add(temp1);
		}
		//Collections.sort(list);
		for (int i = 0; i < n; i++) {
			perm.add(x.nextInt());
		}
//		for (int i = 0; i < 2 * n; i += 2) {
//			System.out.println(list.get(i) + " " + list.get(i + 1));
//		}
		boolean flag = true;
		int index = perm.get(0) - 1;
		
		if (fname.get(index).compareTo(lname.get(index)) < 0)
			temp = fname.get(index);
		else
			temp = lname.get(index);
		
		for (int i = 1; i < perm.size(); i++) {
			index = perm.get(i) - 1;

			if (fname.get(index).compareTo(lname.get(index)) < 0) {
				if (temp.compareTo(fname.get(index)) < 0)
					temp = fname.get(index);
				else if (temp.compareTo(lname.get(index)) < 0) {
					temp = lname.get(index);
				} else {
					flag = false;
					break;
				}
			} else {
				if (temp.compareTo(lname.get(index)) < 0)
					temp = lname.get(index);
				else if (temp.compareTo(fname.get(index)) < 0) {
					temp = fname.get(index);
				} else {
					flag = false;
					break;
				}
			}

		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
// if (fname.get(index) != list.get(i) &&
// fname.get(index) != list.get(i+1) &&
// lname.get(index) != list.get(i) &&
// lname.get(index) != list.get(i+1) ){
// flag = false;
// System.out.print(index + "oK" + i);
// break;
// }
// System.out.println(list.get(i));