package TopCoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Mar 3, 2015 5:19:09 PM
 * mohamed265
 */

public class SRM384_DIV2_Library {

	public int documentAccess(String[] records, String[] userGroups,
			String[] roomRights) {
		Arrays.sort(userGroups);
		Arrays.sort(roomRights);
		HashSet<String> num = new HashSet<String>();
		int index1, index2;
		for (int i = 0; i < records.length; i++) {
			String[] temp = records[i].split(" ");
			index1 = Arrays.binarySearch(userGroups, temp[2]);
			index2 = Arrays.binarySearch(roomRights, temp[1]);
			if (userGroups[index1].equals(temp[2])
					&& roomRights[index2].equals(temp[1]))
				num.add(temp[0]);
		}
		return num.size();

	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

	}
}
