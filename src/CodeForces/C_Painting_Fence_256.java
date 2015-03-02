package CodeForces;

import java.util.Scanner;

public class C_Painting_Fence_256 {
	
	static int [] num = new int [5001];
	static int n , k = 0;
	static int [][] grid = new int [5001][5001];
	static int minSum (int i , int total ,int current)
	{
		if ( i == n)
			return total ;
		k++;
		if (grid[total][current] != -1)
			return grid[total][current];
		
		//System.out.println(i +  "*" + total + "*"+ current  );
		
		long ch1 = minSum(i+1 , total+1 ,current) ,  ch2 = Long.MAX_VALUE ;
		
		//long ch2 = Long.MAX_VALUE ;
		
		if (current < num[i])
			ch2 = minSum(i+1, total + (num[i] - current) , num[i] ) ;
		else if (current == num[i])
			ch2 = minSum(i+1, total , current );
		else if (current > num[i])
			ch2 = minSum(i+1, total , num[i] );
		
		System.out.println(i +  "*" + total + " "+ current  );
		System.out.println(i +  " " + ch1 + " "+ ch2  );
		
		grid[total][current] = (int) Math.min(ch1, ch2);
		return grid[total][current];
	//	return (int) Math.min(i+1, ch2);
			
	}
	static public void main (String arr[])
	{
		Scanner x = new Scanner (System.in);
		n = x.nextInt();
		for (int i = 0 ; i < n ; i++ )
			num[i] = x.nextInt();
		//n = 5000;
		//for (int i = 0 ; i < n ; i++ )
			//num[i] = 1000000000 ;
		for (int i = 0 ; i < n+1  ; i++ )
			for (int j = 0 ; j < n+1  ;j++ )
				grid[i][j] = -1;
		
		System.out.println(minSum(0,0,0));
		
		System.out.print(k);

	}

}
/*To solve this problem we need to understand some little things. First, every horizontally stroke must be as widely as possible. Second,
 *  under every horizontally stroke should be only horizontally strokes. So,
 *   if bottom of fence painted by horizontally stroke then number of this strokes must at least min(a1, a2, ..., an).
 *    These strokes maybe divides fence into some unpainted disconnected parts. For all of these parts we need to sum they answers.
 *     Now its clearly that solution is recursive. 
 *     It takes segment [l, r] and height of painted bottom h. 
 *     But we must not forget about situation when all planks painted with vertically strokes. 
 *     In this case answer must be limited by r - l + 1 (length of segment).
 *      With given constrains of n we can find minimum on segment by looking all the elements from segment. Complexity in this case will be O(n2).
 *       But if we use for example segment tree,
 *  we can achieve O(nlogn) complexity.
 */
/* 
 #include<bits/stdc++.h>
using namespace std;
int i,a[5001],n;
int f(int b,int s,int y)
{
    if(b>s)
        return 0;
    int m = min_element( a+b , a+s+1 ) - a ;
    return min( s-b+1 , f(b , m-1 , a[m]) + f(m+1, s , a[m]) +  a[m]-y);
}
int main()
{
    cin >> n;
    for(i=1; i<=n; i++)cin>>a[i];
   // cout<<min_element( a+1 , a+n+1 ) - a ;
   cout<<f(1,n,0);
}

/*
int sum = 0 , current = 0 , change , tempCurrent = 0;
for (int i = 0 ; i < n ; i++)
{
	if (num[i] < current)
		current = num[i];
	else if (num[i] > current)
	{
		if (num[i] > n)
				sum++;
		else
		{
			change = num[i] - current;
			if (change == 1)
			{
				current++;
				sum++;
				//tempCurrent++;
			}
			else
			{
				boolean flag = true;
				int temp = 0 ;
				for (int j = i ; j < i + change ; j++)
					if (num[j] < num[i])
					{
						sum += (j - i);
						flag = false;
						i = j -1;
						tempCurrent=0;
						break;
					}
					else if (num[j] > num[i])
						temp++;
				if (flag)
				{
					sum += change;
					if (temp == 0)
						current += change;
					i += (change -1); 
						//tempCurrent=0;
				}
			}
		}
	}
}
System.out.print(sum);*/