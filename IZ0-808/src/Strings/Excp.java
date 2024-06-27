package Strings;

import java.util.ArrayList;
import java.util.List;

public class Excp {

	void test(int x) {

		switch (x) {
		case 1:
		case 2:
		case 0:
		default:
		case 4:
		}
	}

	public static void main(String args[]) {

		boolean flag = true;
		if (flag = false) {
			System.out.println("1");
		} else if (flag) {
			System.out.println("2");
		} else if (!flag) {
			System.out.println("3");
		} else
			System.out.println("4");

		List s1 = new ArrayList<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("a");
		if (s1.remove("a")) {
			if (s1.remove("a")) {
				s1.remove("b");
			} else {
				s1.remove("c");
			}
		}
		System.out.println(s1);

		int i = 1, j = 10;
		do {
			if (i++ > --j)
				continue;
		} while (i < 5);
		System.out.println("i=" + i + " j=" + j);

	void test(int x) {

		switch (x) {
		case 1:
		case 2:
		case 0:
		default:
		case 4:
		}

	}
}
