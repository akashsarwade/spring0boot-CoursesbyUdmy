package test;

public class Calc {

	int sum(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {

		Calc ob = new Calc();
		int cc = ob.sum(10, 20);
		System.out.println("sum of ob " + cc);

		int a = 9;
		int b = 77;
		int c = 33;
		if (!(b++ > 77) && ++a == 10 || c-- == 32) {
			System.out.println(a + b);
		}

		String string1, string2, string3;
		string1 = new String("myObj");
		string2 = string1;
		string3 = string1 + string2;
		System.out.println(string1);

		System.out.println(string2);
		System.out.println(string3);
	}

}
