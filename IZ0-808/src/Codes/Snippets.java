package Codes;

public class Snippets {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			if(i%3==0) {
				System.out.println(i+" ");
				break;
			}
		}
	}
}
