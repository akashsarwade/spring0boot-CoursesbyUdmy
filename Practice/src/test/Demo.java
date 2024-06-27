package test;

public class Demo {
	public static void main(String[] args) {

//		System.out.println(10 == 10 && !(5 != 5));
//		System.out.println(10 < 8 || 10 > 2);

		boolean checkout = true;
		int days = 0;
		while (checkout) {
			days++;
			if (days > 3) {
				checkout = false;

			}

		}
		System.out.println(days);
	}
}
