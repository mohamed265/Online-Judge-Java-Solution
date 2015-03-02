package TopCoder;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class DiagonalDisproportion
{
	public int getDisproportion(String[] matrix)
	{
		long slon = 0 , l =  matrix.length ; 
		for (int i = 0 ; i < l; i++)
			slon += matrix[i].charAt(i);
		for(int i = (int) (l - 1) , j = 0; i >= 0 ; i--,j++)
			slon -= matrix[j].charAt(i);
		return (int) slon;
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
