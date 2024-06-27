package Codes;

public class a {

	public static void main(String[] args) {
		int[] arr = { 10, 0 };
		int i = 0;
		try {
			int ans = arr[i] / arr[i + 1];

		} catch (Exception e) {
			System.out.println("unknown issue");
		} catch (ArithmeticException ae) {
			System.out.println("invalid divisor");
		}
	}
}
