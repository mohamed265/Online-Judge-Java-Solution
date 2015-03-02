package CodeForces;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class C_Pashmak_and_Buses_261 {
	public static void main(String ar[]) {
		Scanner x = new Scanner(System.in);
		long n = x.nextInt(), k = x.nextInt(), d = x.nextInt(), limit = k;
		//OutputStream outputStream = System.out;
		 
		//OutputWriter out = new OutputWriter(outputStream);
		
		 PrintWriter out = new PrintWriter(System.out);
		 
		if (Math.pow(k, d) >= n) {
			
			for (int j = 0; j < n; j++)
				out.print((j % k + 1) + " ");
			out.println();
				//System.out.print((j % k + 1) + " ");
			//System.out.println();
			
			for (int i = 1; i < d; i++) {
				if (limit >= n) {
					for (int j = 0 ; j < n; j++)
						//System.out.print("1 ");
						out.print("1 ");
				} else {
					for (int j = 0, t = 0, p = 1; j < n; j++, t++) {
						if (t == limit) {
							if (p == k)
								p = 1;
							else
								p++;
							t = 0;
						}
						//System.out.print(p + " ");
						out.print(p + " ");
					}
					limit *= k;
				}
				//System.out.println();
				out.println();
			}
		} else
			out.print(-1);
			//System.out.print(-1);
		out.close();
	}

}
class OutputWriter {
	private PrintWriter output;
	public OutputWriter() {
		this(System.out);
	}
	public OutputWriter(OutputStream out) {
		output = new PrintWriter(out);
	}
	public OutputWriter(Writer writer) {
		output = new PrintWriter(writer);
	}
	public void print(Object o) {
		output.print(o);
	}

	public void println() {
		output.println();
	}

	public void close() {
		output.close();
	}
}
