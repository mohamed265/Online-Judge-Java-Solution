package CodeForces;
import java.util.Scanner;

public class B_Modular_Equations {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a = x.nextInt(), b = x.nextInt(), count = 0;
		if (a == b)
			System.out.println("infinity");
		else {
			int temp = a - b;
			for (int i = 1; i < Math.sqrt(temp); i++) {
				if (temp % i == 0) {
					if (b < i)
						count++;
					if (temp / i > b)
						count++;
				}
			}
			if (temp % Math.sqrt(temp) == 0 && temp / Math.sqrt(temp) > b)
				count++;
			System.out.println(count);
		}

	}
}

/*
 * #include<cstdio>
 * 
 * int k,a,b,A;
 * 
 * int main(){ scanf("%d%d",&a,&b); if(a<b) printf("0\n"); else if(a==b)
 * printf("infinity\n"); else{ for(k=1;k*k<a-b;k++) if((a-b)%k==0){ if(k>b) A++;
 * if((a-b)/k>b) A++; } if(k*k==(a-b)&&k>b) A++; printf("%d\n",A); } return 0; }
 */