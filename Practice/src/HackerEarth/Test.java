package HackerEarth;

import java.util.Scanner;

public class Test {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		// here converting string into char array
		int z = 0;
		int o = 0;
		System.out.println("Enter input");
		String s = sc.next();
		char c[] = s.toCharArray();
		for (int i = 1; i < c.length; i++) {
			if ('z' == c[i])
				z++;
			else
				o++;
		}
		if (z * 2 == o)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
