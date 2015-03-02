package CodeForces;
import java.util.Scanner;


public class C_Prime_swap_246 {

	static int N;
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		N = in.nextInt()+1;
		int[] p = new int[N];
		for(int i=2;i<N;i++) p[i]=1;
		for(int i=2;i<N;i++){
			if(p[i]==1){
				for(int j=i*2;j<N;j+=i){
					p[j]=0;
				}
			}
		}
		
		int[] a = new int[N];
		int[] index = new int[N];
		for(int i=1;i<N;i++){
			int inNum = in.nextInt();
			a[i]=inNum;
			index[inNum]=i;
		}
		
		StringBuilder sb = new StringBuilder();
		int count=0;
		for(int i=1;i<N;i++){
			int minIndex = index[i];
			int target = i;
			while(minIndex != target){
//				System.out.println(target+" "+minIndex);
				while(p[minIndex-target+1]!=1){
					target++;
				}
				index[a[minIndex]] = target;
				index[a[target]] = minIndex;
				int temp = a[minIndex];
				a[minIndex] = a[target];
				a[target] = temp;
//				System.out.println(a[target]+" "+minIndex);
				count++;
				sb.append(String.format("%d %d\n", target, minIndex));
				minIndex = target;
				target = i;
			}
		}
		System.out.println(count);
		if(sb.length()>0) System.out.println(sb.substring(0, sb.length()-1));
	}
}/*
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class C_Prime_swap_246 {
	//static java.util.List<Integer> list = new ArrayList<Integer>(100001);
	static ArrayList<Integer> xlist = new ArrayList<Integer>(500005),
			ylist = new ArrayList<Integer>(500005);
	static int[] num = new int[100002] , prime  = new int [100002] , list = new int [100002] ;
	static void prime (){
		for (int i = 2  ; i < 100002 ; i++){
			for (int j  = 2 ;  j * i < 100002 && prime[i] == 0; j++ )
				prime[ i * j] = -1;
		}
	}
	
	static boolean isPrime(int num) {
		if (num < 2 || prime[num] == -1)
			return false;
		 else 
			 return true;
	}

	static void swapNum(int p1, int v1, int p2, int v2) {
		// System.out.println("p1 " + p1 + " p2 "+ p2 + " v1 " + v1 + " v2 " +
		// v2);
		num[p1] = v1;
		num[p2] = v2;
		/*
		 * int temp = num[t]; num[t] = j; num[i] = temp; printNum(9);
		 */
	/*}

	static void swapList(int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] =  temp;
	}

	static void printNum(int n) {
		for (int i = 1; i <= n; i++)
			System.out.print(num[i] + " ");
		System.out.println();
	}

	static void printList(int n) {
		for (int i = 1; i < n; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

	static void result() {
		PrintWriter out = new PrintWriter(System.out);
		out.println(xlist.size());
		for (int i = 0; i < xlist.size(); i++) {
			out.println(xlist.get(i) + " " + ylist.get(i));
		}
		out.close();
	}

	public static void main(String arr[]) {
		//for (int i = 2 ; i < 100 ; i++ )
		// System.out.println(i + " " +isPrime(i));
		
		Scanner x = new Scanner(System.in);
		prime();
		int n = x.nextInt(), temp;
	//	int n = 100000, temp;

		for (int i = 0; i < n; i++) {
			temp = x.nextInt();
			list[i] = temp;
			num[temp] = i + 1;
		}

		// printNum(n);
		int max =  0 , temp1;
		for (int i = 1; i <= n;) {

			if (i == num[i]) {
				i++;
				continue;
			}
			max = num[i] - i + 1 ;
			
			//System.out.println(i + " " + max);

			for (int j = 0 ; j < max - 1; j++) {
				if (isPrime(  num[i]  - i - j  + 1 )  && num[i] > i + j )
				{
					 	xlist.add(i + j);
						ylist.add(num[i]);
					 

					 temp1 = num[i];

					swapNum(i, i + j, list[i + j], temp1);
					swapList(i + j, temp1);
					
					//printNum(n);
					//printList();
					//n = x.nextInt();
				}

			}
			//System.out.print(i);
			//printList();
		}
			// printNum(n);

			result();
			
			//printList();
	}
}
/*
if (isPrime(num[i] - i + 1) && i < num[i]) {
	
	xlist.add(i);
	ylist.add(num[i]);
	//System.out.print("sp ");
	//printNum(n);
	int temp1 = num[i];
	swapNum(i, i , list.get(i) , temp1 );
	swapList(i, temp1);
} else {
	int max = num[i] - i + 1;
	System.out.println(i + "max" + max);
	for (int j = 1; j < max - 1; j++) {
		if (isPrime(max + j) && isPrime(j + 1))// && max-j )
		{
			System.out.println("here " + i + " " + j + " " + max
					+ " " + (max - j) + " " + (j + 1));
			xlist.add(i + j);
			ylist.add(num[i]);

			xlist.add(i);
			ylist.add(i + j);
//swapNum(i, temp1, list.get(i) , list.get(temp1));
			int temp1 = num[i];

			swapNum(i , i+j , list.get(i+j),temp1 );
			swapList(i + j, temp1);

			swapNum(i, i ,list.get(i),  i+j);
			swapList(i, i + j);

		}
	}

}
System.out.println(i);
printList();
printNum(n);
*/
/*

public class C_Prime_swap_246 {
	private static BufferedReader br;
	private static StringTokenizer st;

	public static String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	public static double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	public static int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	static java.util.List<Integer> list = new ArrayList<Integer>(100001);
	static ArrayList<Integer> xlist = new ArrayList<Integer>(500005),
			ylist = new ArrayList<Integer>(500005);
	static int [] num = new int [100002];
	static void insetAndDelete(int i) {
		int temp = list.get(i);
		list.remove(i);
		list.add(temp, temp);
	}

	public static void main(String[] args) throws Exception {
		list.add(0);
		InputStream in = System.in;

		br = new BufferedReader(new InputStreamReader(in));
		PrintWriter out = new PrintWriter(System.out);

		//int n = nextInt() ,  temp;
		int n = 100000 ,  temp;
		for (int i = 0; i < n; i++)
			{
				temp = 100000-i;//nextInt();
				list.add(temp);
				num[temp] = i+1;
			}
		
		int position, operation, xx, y, total = 0;
		for (int i = 1; i <= n; i++) {
			if (i == list.get(i))
				continue;
			position = num[i]; //list.indexOf(i);
			// System.out.println(position);
			operation = position - i;
			total += operation;
			// System.out.println(i + " " + position + " "+ operation);
			if (operation > 0) {
				insetAndDelete(position);
				xx = position - 1;
				y = xx + 1;
				while (operation > 0) {
					xlist.add(xx);
					ylist.add(y);
					num[xx]++;
					operation--;
					xx--;
					y--;
				}
				
				
			}

		}
		out.println(total);
		for (int i = 0; i < xlist.size(); i++) {
			out.println(xlist.get(i) + " " + ylist.get(i));
		}
		out.close();
		// for (int i = 1; i < list.size(); i++)
		// System.out.print(list.get(i) + " ");
	}
}

class OutputWriter {
	private PrintWriter output;

	public OutputWriter() {
		this(System.out);
	}

	public OutputWriter(OutputStream out) {
		output = new PrintWriter(out);
	}

	public OutputWriter(Writer writer) {
		output = new PrintWriter(writer);
	}

	public void print(Object o) {
		output.print(o);
	}

	public void println() {
		output.println();
	}

	public void close() {
		output.close();
	}
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class C_Prime_swap_246 {
	private static BufferedReader br;
	private static StringTokenizer st;

	public static String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	public static double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	public static int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	static java.util.List<Integer> list = new ArrayList<Integer>(100001);
	static ArrayList<Integer> xlist = new ArrayList<Integer>(500005),
			oplist = new ArrayList<Integer>(500005);

	static void insetAndDelete(int i) {
		int temp = list.get(i);
		list.remove(i);
		list.add(temp, temp);
	}

	public static void main(String[] args) throws Exception {
		list.add(0);
		InputStream in = System.in;

		br = new BufferedReader(new InputStreamReader(in));
		PrintWriter out = new PrintWriter(System.out);

		int n = nextInt();
		for (int i = 0; i < n; i++)
			list.add(nextInt());
		
		int position, operation, xx, y, total = 0;
		for (int i = 1; i <= n; i++) {
			if (i == list.get(i))
				continue;
			position = list.indexOf(i);
			// System.out.println(position);
			operation = position - i;
			total += operation;
			// System.out.println(i + " " + position + " "+ operation);
			if (operation > 0) {
				insetAndDelete(position);
				xx = position - 1;
				xlist.add(xx);
				oplist.add(operation);
			}

		}
		out.println(total);
		for (int i = 0; i < oplist.size(); i++) {
			operation = oplist.get(i);
			xx = xlist.get(i);
			y = xx + 1;
			while (operation > 0) {
				out.println(xx + " " + y);
				operation--;
				xx--;
				y--;
			}
		}
		out.close();
		// for (int i = 1; i < list.size(); i++)
		// System.out.print(list.get(i) + " ");
	}
}*//*

class OutputWriter {
	private PrintWriter output;

	public OutputWriter() {
		this(System.out);
	}

	public OutputWriter(OutputStream out) {
		output = new PrintWriter(out);
	}

	public OutputWriter(Writer writer) {
		output = new PrintWriter(writer);
	}

	public void print(Object o) {
		output.print(o);
	}

	public void println() {
		output.println();
	}

	public void close() {
		output.close();
	}
}
*/