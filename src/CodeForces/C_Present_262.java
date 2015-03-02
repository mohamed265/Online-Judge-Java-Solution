package CodeForces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//11 18 8
//4996 4993 4988 4982 4982 4982 4982 4982 4986 4989 4994


public class C_Present_262 {
	
	//static int [] num = new int [100000];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt() , m = x.nextInt() , w = x.nextInt() , temp , min = Integer.MAX_VALUE , preMin = Integer.MAX_VALUE;
		ArrayList<Integer> list = new ArrayList<Integer>() ,
							num = new ArrayList<Integer>() ,
							premin = new ArrayList<Integer>() ,
							prenum = new ArrayList<Integer>();
		for (int i = 0 ; i < n ; i++){
			temp = x.nextInt();
			if (temp == min)
				list.add(i);
			else if (temp == preMin)
				premin.add(i);
			else if (temp < min){
				list.clear();
				list.add(i);
				premin.clear();
				premin.add(i);
				preMin = min;
				min = temp;
			}
			else if (temp < preMin){
				premin.clear();
				premin.add(i);
				preMin = temp;
			}
		}
		for (int i = 0 ; i < premin.size() ; i++ )
			prenum.add(0);
		
		
		if (n != 1)
			for (int i = 0 ; i <  list.size() ; i++){
				if (list.get(i) + w < n)
				{
					for (int j = 0 ; j < premin.size() ;j++)
						if (premin.get(j) > list.get(i) && premin.get(j) < list.get(i) + w)
							prenum.set(j, num.get(j) + 1);
						else if ( premin.get(j) >= list.get(i) + w)
							break;
				}
				else
				{
					int s = n - w , e = s + w;  // need Gready behavior :\
					
					for (int j = 0 ; j < premin.size() ;j++)
						if (premin.get(j) >= s && premin.get(j) < n)
							prenum.set(j, num.get(j) + 1);
				
				}
			
			}
		int willIncrease = Collections.min(prenum);
		//for(int i = 0 ; i < list.size() ; i++ )
			//System.out.print(list.get(i) + " ");
		for (int i = 0 ; i < list.size() ; i++ )
			num.add(0);
		
		int index = 0; //num.indexOf(Collections.min(num));
		boolean end = false;
		
		for (int i = 1 ; i <= m  ; i++) {
			
			int  interval = list.get(index) + w , per = index + w;
			
			for (   ;  index < per && index < list.size(); index++)
				
			if (preMin + willIncrease == num.get(index) + min)
				{
					end = true;
					break;
				}
			else if (list.get(index) < interval)
					num.set(index, num.get(index) + 1);
				else
					break;
			
			if (index >= list.size())
				index = 0;
			
			if (end)
				break;
		}
		System.out.println(Collections.min(num) + min);

		

	}

}
//num[x.nextInt()]++;
/*
for (int i = 0 ; i < list.size() ; i++ )
num.add(0);

int index = 0; //num.indexOf(Collections.min(num));

for (int i = 1 ; i <= m  ; i++) {

int  interval = list.get(index) + w , per = index + w;

for (int j = index ;  j < per && j < list.size(); j++)
	if (list.get(j) < interval)
		num.set(j, num.get(j) + 1);
	else
		break;
}
System.out.println(Collections.max(num) + min);

*/