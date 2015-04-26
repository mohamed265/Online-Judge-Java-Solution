import java.util.Random;
import java.util.Scanner;

/*
 * Apr 26, 2015 8:40:11 AM
 * mohamed265
 */

public class HashInt {

	class node {
		public int key, value;
		node next;
	}

	private long a1, a2, a3, a4, tableSize;
	private node[] table;

	public HashInt(int tableSize_) {
		tableSize = tableSize_;
		table = new node[(int) tableSize];
		Random rand = new Random();
		a1 = rand.nextInt((int) tableSize);
		a2 = rand.nextInt((int) tableSize);
		a3 = rand.nextInt((int) tableSize);
		a4 = rand.nextInt((int) tableSize);
	}

	public int insert(int key, int value) {
		int hashValue = universalHashFunction(key);
		if (table[hashValue] == null) {
			node temp = new node();
			temp.key = key;
			temp.value = value;
			temp.next = null;
			table[hashValue] = temp;
		} else {
			node temp = new node();
			temp.key = key;
			temp.value = value;
			temp.next = null;

			node parent = table[hashValue];
			while (parent.next != null) {
				if (parent.key == key) {
					parent.value = value;
					return hashValue;
				}
				parent = parent.next;
			}

			if (parent.key == key)
				parent.value = value;
			else
				parent.next = temp;
		}
		return hashValue;
	}

	public Integer getValue(int key) {
		int hashValue = universalHashFunction(key);

		if (table[hashValue] != null) {
			node parent = table[hashValue];
			while (parent.next != null) {
				if (parent.key == key)
					return parent.value;
				parent = parent.next;
			}
			if (parent.key == key)
				return parent.value;
		}
		return null;
	}

	public void delete(int key) {
		int hashValue = universalHashFunction(key);

		if (table[hashValue] != null) {
			node parent = null, curent = table[hashValue];

			while (curent != null) {
				if (curent.key == key) {
					if (parent == null)
						table[hashValue] = curent.next;
					else
						parent.next = curent.next;
					return;
				}
				curent = parent;
				curent = curent.next;
			}
		}
	}

	private int universalHashFunction(int num) {
		long x1 = 0, x2 = 0, x3 = 0, x4 = 0, temp = 1;
		for (int i = 0; i < 8; i++, temp *= 2)
			x1 |= (temp & num);
		for (int i = 0; i < 8; i++, temp *= 2)
			x2 |= (temp & num);
		for (int i = 0; i < 8; i++, temp *= 2)
			x3 |= (temp & num);
		for (int i = 0; i < 8; i++, temp *= 2)
			x4 |= (temp & num);
		// System.out.println(temp + " " + ((temp & num)));
		return (int) ((a1 * x1 + a2 * x2 + a3 * x3 + a4 * x4) % tableSize);
	}

	public static void main(String[] args) {
		// Scanner x = new Scanner(System.in);
		HashInt b = new HashInt(10);

		System.out.println("Insertion");

		System.out.println(b.insert(15, 1000));
		System.out.println(b.insert(15, 1001));
		System.out.println(b.insert(115, 1026501));
		System.out.println(b.insert(45454, 565650));

		System.out.println("Get Value");

		System.out.println(b.getValue(15));
		System.out.println(b.getValue(15));
		System.out.println(b.getValue(115));
		System.out.println(b.getValue(45454));

		System.out.println("Deletion");

		// Not in table
		b.delete(960);

		System.out.println(b.getValue(15));
		System.out.println(b.getValue(15));
		System.out.println(b.getValue(115));
		System.out.println(b.getValue(45454));

		// in table
		b.delete(15);

		System.out.println(b.getValue(15));
		System.out.println(b.getValue(15));
		System.out.println(b.getValue(115));
		System.out.println(b.getValue(45454));

	}
}
