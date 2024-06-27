package test;

public class VV {

	public static void main(String[] args) {

		int i = 0, j = 11;
		do {
			if (i > j) {
				break;
			}
			j--;
		} while (++i < 5);
		System.out.println(i + "  " + j);
	
		int a = 5,  b = 2, c = 30;
		System.out.println( a+b  * c  );

	}
	
}