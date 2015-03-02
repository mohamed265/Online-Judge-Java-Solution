package Hard;
import java.util.ArrayList;

public class C_MUH_and_House_of_Cards {

	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<Long>();
		for (long i = 2; i < 1E2; i += 3)
			list.add(i);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
