package TopCoder;
public class PathGameDiv2 {

	static int dp(String[] board, int path, int i, int max) {

		if (board[path].charAt(i) == '#')
			return 0;

		if (i == board[0].length() - 1) {

			if (board[0].charAt(i) == board[1].charAt(i))
				return (max + 1);
			else
				return max;
		}

		if (board[1].charAt(i) != board[0].charAt(i))
			return dp(board, path, i + 1, max);
		else
			return Math.max(dp(board, (path == 1 ? 0 : 1), i + 1, max),
					dp(board, path, i + 1, max + 1));

	}

	static int count(String[] board, int path, int i) {
		int cou = 0;
		for (int j = 0; j < board[0].length(); j++) {
			if (j == board[path].length() - 1
					|| board[path].charAt(j + 1) == '.') {
				if (board[path == 1 ? 0 : 1].charAt(j) == '.')
					cou++;
			} else
				path = (path == 1 ? 0 : 1);
		}
		return cou;
	}

	public static int calc(String[] board) {
		/*
		 * int temp = 0, temp1 = 0; for (int i = 0; i < board[0].length(); i++)
		 * { if (board[0].charAt(i) == '.') temp++; if (board[1].charAt(i) ==
		 * '.') temp1++; } if (temp1 == board[1].length() || temp ==
		 * board[1].length()) return Math.min(temp, temp1);
		 * 
		 * return Math.max(dp(board, 0, 0, 0), dp(board, 1, 0, 0));
		 */
		int t = -1;
		if (board[0].charAt(0) == '.')
			t = Math.max(t, count(board, 0, 0));
		if (board[1].charAt(0) == '.')
			t = Math.max(t, count(board, 1, 0));
		return t;
	}

	public static void main(String[] args) {
		String[] x = new String[2];

		x[0] = "#....";
		x[1] = "...#.";

		// x[0] = ".....#...................#........................";
		// x[1] = ".............#....#....#.........................#";

		System.out.print(calc(x));

	}

}
