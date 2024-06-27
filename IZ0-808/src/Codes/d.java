package Codes;

import java.util.ArrayList;
import java.util.List;

public class d {

	public static void main(String[] args) {
		int[] num = new int[2];
		num[0] = 10;
		num[1] = 20;

		List list = new ArrayList<>();
		list.add(10);
		list.add(20);

		num[1] = 20;
		list.add(20);

		for (int x : num) {
			System.out.println(x);
		}
		System.out.println("");
		for (int y : list) {
			System.out.println(y);
		}

		class Employee {
			String eName;
			final int MIN_SCORE = 10;

			public void printDetails() {
			};

		}
	}
}
