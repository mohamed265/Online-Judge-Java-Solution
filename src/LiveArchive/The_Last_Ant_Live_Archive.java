package LiveArchive;
import java.util.Scanner;

public class The_Last_Ant_Live_Archive {

	static void print(int n , int ind) {
		for (int i = 0; i < n; i++) {
			if (sign[i] != ind)
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	static int findLeft(int ind , int n){
		int i = 0;
		while (sign[i] == ind)
			i++;
		return i;
	}
	static int findRight(int ind , int n){
		int i = n-1;
		while (sign[i] == ind)
			i--;
		return i;
	}

	static boolean fun(int s , int ind , int n) {
		int i = findLeft(ind, n) , j = findRight(ind, n);
		/////System.out.println(i + " " +j);
		if (s > 2)
			return true;
		else if (list[i] > 0 && list[j] < 0  && list[i] > list[j]*-1)
				return false;
		else if (list[i] > 0 && list[j] < 0)
			return true;
		else
			return false;
	}
	static int slon;
	static int sign[] = new int[20] , list [] = new int[20];

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		for (int ind = 1 ; true ; ind++) {
			
			int n = x.nextInt(), l = x.nextInt() ,s = n;
			
			if (n == 0 && l == 0)
				break;
			 
			char d;
			for (int i = 0; i < n; i++) {
				d = x.next().charAt(0);
				if (d == 'R')
					list[i] = x.nextInt() ;
				else
					list[i] = x.nextInt() * -1;
			}
		//	print(n , ind);
			if (n == 1) {
				int slon;
				if (list[0] < 0)
					slon = list[0] * -1;
				else
					slon = l - list[0];
				System.out.println(slon + " 1");
			} else {
				 slon = 0;
				for (; s > 2 || fun(s,ind,n); slon++) {

					for (int i = 0; i < n; i++) {
						list[i]++;
						if (list[i] == 0 || list[i] == l || list[i] == -l) {
							sign[i] = ind;
//							System.out.println("*"+i+":"+ind);
//							for (int k = 0 ; k < n ; k++)
//								System.out.print(sign[k]+ " ");
//							System.out.println();
							s--;
						}
					}
					
					for (int i = 0; i < n -1 ; i++){
						if (sign[i] == ind)
							continue;
						for (int j = i +1 ; j < n ; j++)
						if (Math.abs(list[i]) == Math.abs(list[j]) && sign[j] != ind) {
							list[i] *= -1;
							list[j] *= -1;
						//	break;
						}
					}
			 	//	print(n , ind);
				}
				int lef = findLeft(ind, n) , rig = findRight(ind, n);
				//System.out.println(lef + " " + rig);
				if (  list[lef] > 0 &&  list[rig] > 0) {
				//	System.out.println(1);
					System.out.println((l- Math.abs(list[lef]) + slon) + " " + (lef + 1));
				} else if (  list[lef]  < 0 &&  list[rig] < 0) {
					System.out.println(2);
					System.out.println((Math.abs(list[rig]) + slon) + " " + (rig + 1));
				} else if (list[lef] > 0 && list[rig]  < 0 ){
				//	System.out.println(3);
					if (n - list[lef] >  list[rig] * -1) 
						System.out.println(  ((n-list[lef]) + slon)  + " " + (lef + 1));
					else
						System.out.println(  ((list[rig]*-1) + slon)  + " " + (rig + 1));
				} else {
				//	System.out.println(4);
					if (-1 * list[lef] >= l - list[rig])
						System.out.println((  -1 * list[lef] + slon)  + " " + (lef + 1));
					else
						System.out.println((  l + list[rig] + slon)  + " " + (rig + 1));
				}

			}
		}
	}
}
/*
public class The_Last_Ant {

static void print() {
	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i) + " ");
	}
	System.out.println();
}

static boolean fun() {
	if (list.size() > 2)
		return true;
	else if (list.get(0) > 0 && list.get(1) < 0  && list.get(0) > list.get(1)*-1)
			return false;
	else if (list.get(0) > 0 && list.get(1) < 0)
		return true;
	else
		return false;
}
static int slon;
static int sign[] = new int[20];
static ArrayList<Integer> list = new ArrayList<Integer>();

public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	while (true) {
		int n = x.nextInt(), l = x.nextInt();
		if (n == 0 && l == 0)
			break;
		list.clear();
		for (int i = 0 ; i < 20 ; i++)
			sign[i] = 0;
		char d;
		for (int i = 0; i < n; i++) {
			d = x.next().charAt(0);
			if (d == 'R')
				list.add(x.nextInt());
			else
				list.add(x.nextInt() * -1);
		}
		if (n == 1) {
			int slon;
			if (list.get(0) < 0)
				slon = list.get(0) * -1;
			else
				slon = l - list.get(0);
			System.out.println(slon + " 1");
		} else {
			 slon = 0;
			for (; list.size() > 2 || fun(); slon++) {

				for (int i = 0; i < list.size(); i++) {
					list.set(i, list.get(i) + 1);
					if (list.get(i) == 0 || list.get(i) == l
							|| list.get(i) == -l) {
						sign[i]++;
						list.remove(i);
						i--;
					}
				}
				for (int i = 0; i < list.size() - 1; i++)
					if (Math.abs(list.get(i)) == Math.abs(list.get(i + 1))) {
						list.set(i, list.get(i) * -1);
						list.set(i + 1, list.get(i + 1) * -1);
					}
				//print();
			}
			// slon--;

			if ( (Math.abs(list.get(0))) + slon >= Math.abs(list.get(1)) + slon) {
				int i = 0;
				while (sign[i] != 0)
					i++;
				System.out.println(( Math.abs(list.get(0)) + slon) + " "
						+ (i + 1));
			} else {
				int i = n - 1;
				while (sign[i] != 0)
					i--;
				System.out.println((Math.abs(list.get(1)) + slon) + " "
						+ (i + 1));
			}

		}
	}
}
}
*/