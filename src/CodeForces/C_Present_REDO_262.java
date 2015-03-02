package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class C_Present_REDO_262 {
	 //11 18 8
	//4996 4993 4988 4982 4982 4982 4982 4982 4986 4989 4994
	//11 4 4
	//2 2  2 2 10 7 8 1 5 1 1
	static ArrayList<Integer> num;
	static ArrayList<Long> group ;
	static int n   , m   , w ;
	static int siutableIndex (){
		long temp = Long.MAX_VALUE;
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for (int i = 0; i < group.size(); i++) {
			if (group.get(i) < temp){
				temp = group.get(i);
				indexes.clear();
				indexes.add(i);
			}else if (group.get(i) == temp)
				indexes.add(i);
		}
		if (group.size() == 1)
			return indexes.get(0);
		else{
			long tempMax = Integer.MIN_VALUE;
			int ind = 0;
			for (int i = 0; i < indexes.size(); i++) {
				temp = 0;
				for (int j = indexes.get(i); j < indexes.get(i) + w; j++) 
					temp += ((long) num.get(j) * num.get(j));
				if (temp > tempMax){
					tempMax = temp;
					ind = i;
				}
			}
			return indexes.get(ind);
		}
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		 n = x.nextInt();
		 m = x.nextInt();
		 w = x.nextInt();
		 num = new ArrayList<Integer>(n);
		 group = new ArrayList<Long>(n);
		if (w >= n ) {
			long temp = Integer.MAX_VALUE;
			for (int i = 0 ; i <n ; i++)
				temp = Math.min(temp, x.nextInt());
			System.out.print(temp + m);
		}
		else {
			int temp , index;
			long tempSum = 0 , tempM;
			for (int i = 0 ; i < n ; i++){
				temp = x.nextInt();
				num.add(temp);
				if ( i < w-1 )
					tempSum += temp;
				else{
					tempSum += (temp);
					group.add(tempSum);
					tempSum -= num.get(i-w+1);
				}
			}
			//for (int i = 0 ; i < n ; i++)
				//System.out.println(group.get(i));
			 
			for (int i = 0 ; i < m; i++){
				
				index = siutableIndex(); // group.indexOf(Collections.min(group)) ;
				for (int j = index ; j < w + index; j++)
					num.set(j, num.get(j) + 1);
				tempM = w;
				for (int j = index ; tempM > 0 && j < group.size() ; tempM--, j++)
					group.set(j, group.get(j) + tempM);
				tempM = w-1;
				for (int j = index -1 ; j >= 0 && tempM > 0 ; j-- , tempM--)
					group.set(j, group.get(j) + tempM);
				
				
				System.out.println(index + "*");
				for (int h = 0; h < n; h++) 
					System.out.print(num.get(h) + " " );
				System.out.println();
				for (int j = 0; j <group.size(); j++)
					System.out.print(group.get(j) + " " );
				
				
			}
			
			//System.out.print(Collections.min(num));
				
		}

	}

}/*
#include <cstdio>
#include <cstdlib>
using namespace std;

long long n,m,w,ans,l,r,a[100001],f[200001];

int main()
{
	scanf("%I64d%I64d%I64d",&n,&m,&w);
	for (int i=1;i<=n;i++) scanf("%I64d",&a[i]);
	l=1; r=2000000000;
	while (l<=r)
	{
		int mid=(l+r)>>1;
		long long need=0,sum=0;
		for (int i=1;i<=n;i++) f[i]=0;
		for (int i=1;i<=n;i++)
		{
			sum+=f[i];
			if (sum<mid-a[i])
			{
				need+=mid-a[i]-sum; f[i+w]-=(mid-a[i]-sum); 
				sum+=mid-a[i]-sum;
			}
		}
		if (need>m) r=mid-1;
		else {
			if (mid>ans) ans=mid;
			l=mid+1;
		}
	}
	printf("%I64d\n",ans);
}*/
