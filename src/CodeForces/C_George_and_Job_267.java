package CodeForces;

import java.util.Scanner;
//java code produce mem limit c++ ok accepted
public class C_George_and_Job_267 {
 
	static int n  , m  , k ;
	static long[] list = new long[5005];
	static long[][] grid = new long[5001][5005];
	
	static long maxSum(int index , int targetNum){
		
		if (grid[index][targetNum] != 0)
			return grid[index][targetNum];
		
		if ( index >= s)
			return 0;
		
		if (targetNum == k)
			return Long.MIN_VALUE;
		
		
		//grid[index][targetNum % 2] = Math.max(grid[index][targetNum % 2], Math.max( list[index] + maxSum(index + m, targetNum + 1), maxSum(index + 1, targetNum)) );
		grid[index][targetNum] =  Math.max( list[index] + maxSum(index + m, targetNum + 1) , maxSum(index + 1, targetNum))  ;
		
		
		return grid[index][targetNum];
	}
	/*static long[][] grid = new long[5001][2];
static long maxSum(int index , int targetNum){
		
		if (grid[index][targetNum % 2] != 0)
			return grid[index][targetNum % 2];
		
		if ( index > s)
			return 0;
		
		if (targetNum == k)
			return Long.MIN_VALUE;
		
		
		//grid[index][targetNum % 2] = Math.max(grid[index][targetNum % 2], Math.max( list[index] + maxSum(index + m, targetNum + 1), maxSum(index + 1, targetNum)) );
		grid[index][targetNum % 2] =  Math.max( list[index] + maxSum(index + m, targetNum + 1) , maxSum(index + 1, targetNum))  ;
		
		System.out.println(grid[index][0]+ " " +grid[index][1]);
		return Math.max(grid[index][0],grid[index][1]) ;
	}*/

	
	 
	static int  s = 1;

	public static void main(String[] args) {
		s = 1;
		
		Scanner x = new Scanner(System.in);
		n = x.nextInt();
		m = x.nextInt();
		k = x.nextInt();
		long sum = 0, temp;
		for (int i = 1; i <= n; i++) {
			sum += list[i] = x.nextLong();
		//	grid[i][0] = grid[i][1] = -1;
			if (i >= m) {
				s++;
				temp = list[i - m + 1];
				list[i - m + 1] = sum;
				sum -= temp;
			}
		}
		
//		for (int v = 1; v <  s; v++)
//			System.out.print(list[v] + " ");
//		System.out.println();
 
		System.out.print(maxSum(1,0));
	}

}/*
#include<bits/stdc++.h>
using namespace std;
long long int M[5010][5010], n,m,k,i,j,maxit=-100000,arr[5010];
long long int f(long long int kac,long long int indis)
{
    if(kac==k) return 0;
    if(indis>n-m+1) return 0;
    if(M[kac][indis]!=-1) return M[kac][indis];

    return M[kac][indis]=max(f(kac+1,indis+m)+arr[indis-1+m]-arr[indis-1],f(kac,indis+1));
}
int main()
{
    cin>>n>>m>>k;
    for(i=1; i<=n; i++)
    {
        cin>>arr[i];
        arr[i]+=arr[i-1];
    }

    memset(M,-1,sizeof(M));
    cout<<f(0,1);
    return 0;

}
*/