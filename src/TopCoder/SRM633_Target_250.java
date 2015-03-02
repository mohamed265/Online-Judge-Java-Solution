package TopCoder;


// DRM 633 250
import java.util.Scanner;

public class SRM633_Target_250 {
	public static String[] draw (int n){
		String [] grid = new  String [n]; 
		//int g = 1;
	
		for (int i = 0 ; i < n/2 +1 ; i++){
			grid[i]="";
			int flag = i/2 +1;
			for (int j = 0 ; j < n/2 +1; j++){
				
				
				
				 if (i % 2 == 0 && j >= i && ( j < n-i ) )
					grid[i] += "#" ;
		 
				else if (i % 2 == 0 && j % 2 ==0)
					grid[i] += "#" ;
		 
				
				else if (i%2==1 && j% 2 == 0 &&  flag >=1 )//|| j == (n-1))
						{
							grid[i] += "#" ;
							flag--;
						}
				else  
					grid[i] += " " ;
			 
			}
		 
		} 
		for (int i = 0 ; i < n/2 +1; i++){
			StringBuffer c = new StringBuffer(grid[i].substring(0,grid[i].length()-1 ));
			grid[i] += c.reverse();
		}
		for (int i = 0 , j = n-1 ; i < n/2  ; i++ , j--){
			grid[j] = grid[i];
		}
		return grid;
		
	}

//	public static void main(String[] args) {
//		Scanner x = new Scanner(System.in);
//		int n = 13;
//		String [] grid = draw(n);
//		for (int i = 0 ; i < n ; i++)
//			 
//				System.out.println(grid[i]);
//			 
//
//	}

}
/*
"#################",
"#               #",
"# ############# #",
"# #           # #",
"# # ######### # #",
"# # #       # # #",
"# # # ##### # # #",
"# # # #   # # # #",
"# # # # # # # # #",
"# # # #   # # # #",
"# # # ##### # # #",
"# # #       # # #",
"# # ######### # #",
"# #           # #",
"# ############# #",
"#               #",
"#################" */