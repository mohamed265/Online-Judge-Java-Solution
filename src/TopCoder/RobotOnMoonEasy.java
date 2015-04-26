package TopCoder;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class RobotOnMoonEasy {
	public String isSafeCommand(String[] board, String S) {
		int x = 0, y = 0;
		boolean flag = true;
		for (int i = 0; i < board.length && flag; i++)
			for (int j = 0; j < board[0].length() && flag; j++)
				if (board[i].charAt(j) == 'S') {
					y = i;
					x = j;
					flag = false;
				}
		for (int i = 0; i < S.length(); i++) {

			if (x == 0)
				return "Dead";
			else if (S.charAt(i) == 'U' && board[x - 1].charAt(y) == '.')
				x--;
			else if (x == board[0].length())
				return "Dead";
			else if (S.charAt(i) == 'D' && board[x + 1].charAt(y) == '.')
				x++;
			else if (y == 0)
				return "Dead";
			else if (S.charAt(i) == 'L' && board[x].charAt(y - 1) == '.')
				y--;
			else if (y == board.length)
				return "Dead";
			else if (S.charAt(i) == 'R' && board[x].charAt(y + 1) == '.')
				y++;
		}
		return "Alive";
	}
	public static void main(String [] arr){
		
	}
	// <%:testing-code%>
}
// Powered by [KawigiEdit] 2.0!