package CodeForces;
import java.util.Scanner;


public class B_Random_Teams_273 {
	
	static long fun (long num){
		return (num * num - num) / 2;
	}

	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	long n = x.nextInt() , m = x.nextInt();
	long max = fun(n - m + 1);
	long temp = n;
	while (temp % m != 0)
		temp--;
	long rest = n - temp ;
	long min = (m - rest)  * fun(temp / m) + rest * fun(temp / m + 1);
	System.out.print(min + " " + max);

	}

}
