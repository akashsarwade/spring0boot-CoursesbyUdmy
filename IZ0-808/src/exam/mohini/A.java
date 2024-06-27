package exam.mohini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List lst = new ArrayList<>();
		lst.add("julia");
		lst.add("peter");
		for (Iterator itr = lst.iterator(); itr.hasNext();)
			System.out.println(itr.next());

		String[] str = { "CA", "JF", "US", "CA", "UK" };
		int count = 0;
		for (String c : str) {
			if (c.equals("CA")) {
				continue;

			} else {
				count++;
			}
		}
		System.out.println(count);

		System.out.println(10 == 10 && !(5 != 5));
		System.out.println(10 < 8 || 10 > 2);

		int n1 = 10, n2 = 15;
		int sum = 0, avg = 0;
		sum = n1 + n2;
		avg = sum / 2;
		System.out.println("sum" + sum + "ABg=" + avg);

	}
}
