package Strings;

import java.util.ArrayList;
import java.util.List;

public class Testt {
	void test(int x) {

		switch (x) {
		case 1:
		case 2:
			System.out.println("hdjc");
		case 0:
		default:
		case 4:
		}
	}

	public static void main(String[] args) {

		Testt t = new Testt();
		t.test(2);

		String str = "hello\r\n" + "world";
		System.out.println(str.length());

		List s1 = new ArrayList<>();
		s1.add("a");
		s1.add("b");
		s1.add(1, "c");//a  c b     
		List s2 = new ArrayList(s1.subList(1, 1));
		s1.addAll(s2);
		System.out.println(s1);
	}
	
}
